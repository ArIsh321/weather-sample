package co.selfdrive.demo.ui.screens


import co.selfdrive.demo.ui.base.BaseViewModel
import co.selfdrive.demo.util.DispatchersProvider
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    dispatchers: DispatchersProvider
) : BaseViewModel(dispatchers)
