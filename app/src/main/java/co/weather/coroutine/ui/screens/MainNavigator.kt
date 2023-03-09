package co.weather.coroutine.ui.screens

import androidx.fragment.app.Fragment
import co.weather.coroutine.R
import co.weather.coroutine.ui.base.BaseNavigator
import co.weather.coroutine.ui.base.BaseNavigatorImpl
import co.weather.coroutine.ui.base.NavigationEvent

import javax.inject.Inject

interface MainNavigator : BaseNavigator

class MainNavigatorImpl @Inject constructor(
    fragment: Fragment
) : BaseNavigatorImpl(fragment), MainNavigator {

    override val navHostFragmentId = R.id.navHostFragment

    override fun navigate(event: NavigationEvent) {
        when (event) {
            is NavigationEvent.PopBackStack -> popBack()
        }
    }
}
