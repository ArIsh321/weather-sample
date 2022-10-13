package co.weather.coroutine.ui.screens


import android.view.LayoutInflater
import androidx.activity.viewModels
import co.weather.coroutine.databinding.ActivityMainBinding
import co.weather.coroutine.ui.base.BaseActivity
import dagger.hilt.android.AndroidEntryPoint
import java.util.*


@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>() {

    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding
        get() = { inflater -> ActivityMainBinding.inflate(inflater) }

    override val viewModel by viewModels<MainViewModel>()

}
