package co.weather.coroutine.ui.screens

import androidx.fragment.app.Fragment
import co.weather.coroutine.R
import co.weather.coroutine.domain.model.MainWeatherData
import co.weather.coroutine.ui.base.BaseNavigator
import co.weather.coroutine.ui.base.BaseNavigatorImpl
import co.weather.coroutine.ui.base.NavigationEvent
import co.weather.coroutine.ui.screens.xml.HomeFragmentDirections

import javax.inject.Inject

interface MainNavigator : BaseNavigator

class MainNavigatorImpl @Inject constructor(
    fragment: Fragment
) : BaseNavigatorImpl(fragment), MainNavigator {

    override val navHostFragmentId = R.id.navHostFragment

    override fun navigate(event: NavigationEvent) {
            when(event){
                is NavigationEvent.PopBackStack -> popBack()
                is NavigationEvent.CityWeather -> navigateHomeToWeatherFragment(event.weather)
            }
        }

        private fun navigateHomeToWeatherFragment(weather: MainWeatherData) {
            val navController = findNavController()
            when (navController?.currentDestination?.id) {
                R.id.homeFragment -> navController.navigate(
                    HomeFragmentDirections.actionGlobalWeatherFragment(
                        weather)
                )
//            else -> unsupportedNavigation()
            }
        }

    }
