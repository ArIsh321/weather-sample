package co.selfdrive.demo.ui.screens


import android.view.LayoutInflater
import co.selfdrive.demo.databinding.ActivityMainBinding
import co.selfdrive.demo.extension.provideViewModels
import co.selfdrive.demo.ui.base.BaseActivity
import dagger.hilt.android.AndroidEntryPoint
import java.util.*


@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>() {


    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding
        get() = { inflater -> ActivityMainBinding.inflate(inflater) }

    override val viewModel: MainViewModel by provideViewModels()

}
