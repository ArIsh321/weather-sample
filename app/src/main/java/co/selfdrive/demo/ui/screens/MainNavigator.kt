package co.selfdrive.demo.ui.screens

import androidx.fragment.app.Fragment
import co.selfdrive.demo.R
import co.selfdrive.demo.ui.base.BaseNavigator
import co.selfdrive.demo.ui.base.BaseNavigatorImpl
import co.selfdrive.demo.ui.base.NavigationEvent

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
