package co.weather.coroutine.ui.screens.xml

import co.weather.coroutine.databinding.FragmentHomeBinding
import co.weather.coroutine.test.TestNavigatorModule.mockMainNavigator
import co.weather.coroutine.test.getPrivateProperty
import co.weather.coroutine.test.replace
import co.weather.coroutine.ui.BaseFragmentTest
import co.weather.coroutine.ui.screens.home.HomeFragment
import co.weather.coroutine.ui.screens.home.HomeViewModel
import dagger.hilt.android.testing.*
import io.kotest.matchers.nulls.shouldNotBeNull
import io.kotest.matchers.shouldBe
import io.mockk.mockk
import org.junit.*

@HiltAndroidTest
class HomeFragmentTest : BaseFragmentTest<HomeFragment, FragmentHomeBinding>() {

    private val mockViewModel = mockk<HomeViewModel>(relaxed = true)

    @get:Rule
    var hiltRule = HiltAndroidRule(this)

    @Before
    fun setup() {
        hiltRule.inject()
    }

    @Test
    fun `When initializing fragment, it displays the title correctly`() {
        launchFragment()
        fragment.binding.tvTitle.text.toString() shouldBe fragment.resources.getString(R.string.app_name)
    }

    private fun launchFragment() {
        launchFragmentInHiltContainer<HomeFragment>(
            onInstantiate = {
                replace(getPrivateProperty("viewModel"), mockViewModel)
                navigator = mockMainNavigator
            }
        ) {
            fragment = this
            fragment.navigator.shouldNotBeNull()
        }
    }
}
