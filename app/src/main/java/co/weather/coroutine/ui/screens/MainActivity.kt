package co.weather.coroutine.ui.screens


import android.view.LayoutInflater
import co.weather.coroutine.databinding.ActivityMainBinding
import co.weather.coroutine.extension.provideViewModels
import co.weather.coroutine.ui.base.BaseActivity
import co.weather.coroutine.ui.screens.home.HomeViewModel
import dagger.hilt.android.AndroidEntryPoint
import java.util.*


@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>() {


    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding
        get() = { inflater -> ActivityMainBinding.inflate(inflater) }

    override val viewModel: MainViewModel by provideViewModels()

}
