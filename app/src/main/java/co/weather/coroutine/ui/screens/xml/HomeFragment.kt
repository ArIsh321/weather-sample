package co.weather.coroutine.ui.screens.xml

import android.Manifest
import android.R
import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.os.Environment
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import android.widget.EditText
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import androidx.recyclerview.widget.LinearLayoutManager
import co.weather.coroutine.databinding.FragmentHomeBinding
import co.weather.coroutine.databinding.ViewLoadingBinding
import co.weather.coroutine.domain.model.ForeCastList
import co.weather.coroutine.domain.model.MainWeatherData
import co.weather.coroutine.extension.provideViewModels
import co.weather.coroutine.ui.base.BaseFragment
import co.weather.coroutine.ui.screens.MainNavigator
import co.weather.coroutine.util.GeoLocationManager
import co.weather.coroutine.util.extension.isDate
import co.weather.coroutine.util.receiver.DailyReceiver
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.Target
import com.google.android.gms.location.LocationCallback
import com.google.android.gms.location.LocationResult
import dagger.hilt.android.AndroidEntryPoint
import org.json.JSONArray
import org.json.JSONException
import org.json.JSONObject
import java.io.File
import java.io.FileWriter
import java.io.IOException
import java.util.*
import javax.inject.Inject


@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding>() {

    @Inject
    lateinit var navigator: MainNavigator

    private val viewModel: HomeViewModel by provideViewModels()

    private lateinit var forecastAdapter: ForecastAdapter
    private lateinit var locationManager: GeoLocationManager
    private val LOCATION_PERMISSION_CODE = 1000
    private var todayTemp : String = ""

    private lateinit var viewLoadingBinding: ViewLoadingBinding

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentHomeBinding
        get() = { inflater, container, attachToParent ->
            FragmentHomeBinding.inflate(inflater, container, attachToParent)
        }

    override fun setupView() {
        super.setupView()
        binding.viewModel = viewModel
        locationManager = GeoLocationManager(activity as Context)
        viewLoadingBinding = ViewLoadingBinding.bind(binding.root)
        viewLoadingBinding.pbLoading.isVisible = true
        with(binding) {
            lvView.isVisible = false

            etSearchView.setOnEditorActionListener { _, actionId, _ ->
                if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                    locationManager.stopLocationTracking()
                    this@HomeFragment.viewModel.onSearchText(etSearchView.text.toString().trim())
                }
                false
            }
        }
        val permissionGranted = requestLocationPermission();
        if (permissionGranted) {
            locationManager.startLocationTracking(locationCallback)
        }
        setAlarm()
        setupDataList()

    }

    private val locationCallback = object : LocationCallback() {
        override fun onLocationResult(locationResult: LocationResult?) {
            locationResult ?: return
            for (location in locationResult.locations){
                // Update UI
              this@HomeFragment.viewModel.getWeatherByLocation(location.latitude, location.longitude)
              this@HomeFragment.viewModel.foreCastList(location.latitude, location.longitude)

            }
        }
    }


    private fun setupDataList() {
        with(binding.contentMainLayout.rvForecastView) {
            adapter = ForecastAdapter().also { forecastAdapter = it }
            layoutManager = LinearLayoutManager(requireContext())
            setHasFixedSize(true)
        }
    }


    override fun bindViewModel() {
        viewModel.weatherData bindTo ::displayUiModels
        viewModel.error bindTo toaster::display
        viewModel.navigator bindTo navigator::navigate
        viewModel.forecastDetail bindTo ::bindData
    }

    private fun bindData(foreCastList: ForeCastList) {
        with(forecastAdapter) {
            if (foreCastList.weatherDataList!!.isNotEmpty()) {
                viewLoadingBinding.pbLoading.isVisible = false
                binding.lvView.isVisible = true
                items = foreCastList.weatherDataList!!.toMutableList()
            }
        }
    }

    private fun displayUiModels(uiModels: MainWeatherData) {
        binding.item = uiModels
        with(binding) {
            contentMainLayout.tvDate.text = uiModels.dateTime.toString().isDate()
            contentMainLayout.tvTemp.text = String.format("%.1f",uiModels.mainTemp?.tempMax?.toInt()?.minus(273.15)?.toDouble())+"°C"
            todayTemp = contentMainLayout.tvTemp.text.toString()
            if(uiModels.weather!!.isNotEmpty()){
                contentMainLayout.tvDescription.text = uiModels.weather!![0].description
            }
            Glide.with(requireActivity())
                .load(this@HomeFragment.viewModel.input.forecastData.value.getForeCastIcon())
                .override(Target.SIZE_ORIGINAL, Target.SIZE_ORIGINAL)
                .into(contentMainLayout.imgView)
        }
    }

    private fun requestLocationPermission(): Boolean {
        var permissionGranted = false

        // If system os is Marshmallow or Above, we need to request runtime permission
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
            val cameraPermissionNotGranted = ContextCompat.checkSelfPermission(
                activity as Context,
                Manifest.permission.CAMERA
            ) == PackageManager.PERMISSION_DENIED
            if (cameraPermissionNotGranted){
                val permission = arrayOf(Manifest.permission.ACCESS_COARSE_LOCATION, Manifest.permission.ACCESS_FINE_LOCATION)

                // Display permission dialog
                requestPermissions(permission, LOCATION_PERMISSION_CODE)
            }
            else{
                // Permission already granted
                permissionGranted = true
            }
        }
        else{
            // Android version earlier than M -> no need to request permission
            permissionGranted = true
        }
        return permissionGranted
    }


    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        if (requestCode === LOCATION_PERMISSION_CODE) {
            if (grantResults.size === 2 &&
                grantResults[0] == PackageManager.PERMISSION_GRANTED &&
                grantResults[1] == PackageManager.PERMISSION_GRANTED){
                // Permission was granted
                locationManager.startLocationTracking(locationCallback)
            }
            else{
                // Permission was denied

            }
        }
    }

    private fun setAlarm() {
        // Quote in Morning at 06:00 AM
        val calendar: Calendar = Calendar.getInstance()
        calendar.set(Calendar.HOUR_OF_DAY, 6)
        calendar.set(Calendar.MINUTE, 0)
        calendar.set(Calendar.SECOND, 0)
        calendar.set(Calendar.MILLISECOND, 0)
        val cur: Calendar = Calendar.getInstance()
        if (cur.after(calendar)) {
            calendar.add(Calendar.DATE, 1)
        }
        val myIntent = Intent(requireActivity(), DailyReceiver::class.java)
        myIntent.putExtra("msg", "GoodMorning")
        myIntent.putExtra("todayTemp", todayTemp)
        val ALARM1_ID = 10000
        val pendingIntent = PendingIntent.getBroadcast(
            requireContext(), ALARM1_ID, myIntent,PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_MUTABLE

        )
        val alarmManager = requireActivity().getSystemService(Context.ALARM_SERVICE) as AlarmManager
        alarmManager.setRepeating(
            AlarmManager.RTC_WAKEUP,
            calendar.timeInMillis,
            AlarmManager.INTERVAL_DAY,
            pendingIntent
        )
    }
//
//    @Throws(IOException::class, JSONException::class)
//    fun saveCsv(outerArray: MainWeatherData) {
//        val rootPath: String = Environment.getExternalStorageDirectory()
//            .absolutePath.toString() + "/test/"
//        val dir = File(rootPath)
//        if (!dir.exists()) {
//            dir.mkdir()
//        }
//        val file: File
//        val editText = findViewById(R.id.editText1) as EditText
//        if (editText.text.toString() != "") {
//            file = File(rootPath, editText.text.toString() + ".csv")
//        } else {
//            editText.error = "Defualt csv file name will be used"
//            Toast.makeText(this, "CSV name is empty", 5000).show()
//            file = File(rootPath, "test1.csv")
//        }
//        if (!file.exists()) {
//            file.createNewFile()
//        }
//        if (file.exists()) {
//            val writer = CSVWriter(FileWriter(file), ',')
//            val arrayOfArrays: Array<Array<String?>> = arrayOfNulls(outerArray.length())
//            for (i in 0 until outerArray.length()) {
//                val innerJsonArray = outerArray[i] as JSONObject
//                val stringArray1 = arrayOfNulls<String>(innerJsonArray.length())
//                stringArray1[0] = innerJsonArray.getString("Id") as String
//                stringArray1[1] = innerJsonArray.getString("value") as String
//                stringArray1[2] = innerJsonArray.getString("name") as String
//                arrayOfArrays[i] = stringArray1
//                writer.writeNext(arrayOfArrays[i])
//            }
//            writer.close()
//        }
//    }



    override fun onDestroyView() {
        super.onDestroyView()
        locationManager.stopLocationTracking()
    }
}
