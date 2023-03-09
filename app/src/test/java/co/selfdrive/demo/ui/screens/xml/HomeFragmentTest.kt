package co.selfdrive.demo.ui.screens.xml

import co.selfdrive.demo.databinding.FragmentHomeBinding
import co.selfdrive.demo.test.TestNavigatorModule.mockMainNavigator
import co.selfdrive.demo.test.getPrivateProperty
import co.selfdrive.demo.test.replace
import co.selfdrive.demo.ui.BaseFragmentTest
import co.selfdrive.demo.ui.screens.home.HomeFragment
import co.selfdrive.demo.ui.screens.home.HomeViewModel
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
