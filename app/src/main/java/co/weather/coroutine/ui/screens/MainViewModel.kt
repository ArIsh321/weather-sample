package co.weather.coroutine.ui.screens


import co.weather.coroutine.ui.base.BaseViewModel
import co.weather.coroutine.util.DispatchersProvider
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    dispatchers: DispatchersProvider
) : BaseViewModel(dispatchers)
