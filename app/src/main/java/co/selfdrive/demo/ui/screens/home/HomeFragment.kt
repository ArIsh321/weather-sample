package co.selfdrive.demo.ui.screens.home

import android.Manifest
import android.content.Context
import android.content.pm.PackageManager
import android.os.Build
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import co.selfdrive.demo.databinding.FragmentHomeBinding
import co.selfdrive.demo.databinding.ViewLoadingBinding
import co.selfdrive.demo.domain.model.ForeCastList
import co.selfdrive.demo.domain.model.MainWeatherData
import co.selfdrive.demo.extension.provideViewModels
import co.selfdrive.demo.ui.base.BaseFragment
import co.selfdrive.demo.ui.screens.MainNavigator
import dagger.hilt.android.AndroidEntryPoint
import java.util.*
import javax.inject.Inject


@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding>() {

    @Inject
    lateinit var navigator: MainNavigator

    private val viewModel: HomeViewModel by provideViewModels()

    private val LOCATION_PERMISSION_CODE = 1000
    private var todayTemp: String = ""

    private lateinit var viewLoadingBinding: ViewLoadingBinding

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentHomeBinding
        get() = { inflater, container, attachToParent ->
            FragmentHomeBinding.inflate(inflater, container, attachToParent)
        }

    override fun setupView() {
        super.setupView()
        binding.viewModel = viewModel
        viewLoadingBinding = ViewLoadingBinding.bind(binding.root)
        viewLoadingBinding.pbLoading.isVisible = true
        with(binding) {

        }
        setupDataList()
    }


    private fun setupDataList() {
//        with(binding.contentMainLayout.rvForecastView) {
//            adapter = ForecastAdapter().also { forecastAdapter = it }
//            layoutManager = LinearLayoutManager(requireContext())
//            setHasFixedSize(true)
//        }
    }


    override fun bindViewModel() {
        viewModel.weatherData bindTo ::displayUiModels
        viewModel.error bindTo toaster::display
        viewModel.navigator bindTo navigator::navigate
        viewModel.forecastDetail bindTo ::bindData
    }

    private fun bindData(foreCastList: ForeCastList) {
//        with(forecastAdapter) {
//            if (foreCastList.weatherDataList!!.isNotEmpty()) {
//                viewLoadingBinding.pbLoading.isVisible = false
//                binding.lvView.isVisible = true
//                items = foreCastList.weatherDataList!!.toMutableList()
//            }
//        }
    }

    private fun displayUiModels(uiModels: MainWeatherData) {
        binding.item = uiModels
        with(binding) {
        }
    }

    private fun requestLocationPermission(): Boolean {
        var permissionGranted = false

        // If system os is Marshmallow or Above, we need to request runtime permission
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            val cameraPermissionNotGranted = ContextCompat.checkSelfPermission(
                activity as Context,
                Manifest.permission.CAMERA
            ) == PackageManager.PERMISSION_DENIED
            if (cameraPermissionNotGranted) {
                val permission = arrayOf(
                    Manifest.permission.ACCESS_COARSE_LOCATION,
                    Manifest.permission.ACCESS_FINE_LOCATION
                )

                // Display permission dialog
                requestPermissions(permission, LOCATION_PERMISSION_CODE)
            } else {
                // Permission already granted
                permissionGranted = true
            }
        } else {
            // Android version earlier than M -> no need to request permission
            permissionGranted = true
        }
        return permissionGranted
    }

}
