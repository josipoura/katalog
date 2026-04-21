package com.moriatsushi.katalog.androidsample

import android.app.Application
import com.moriatsushi.katalog.androidsample.compose.material.ButtonWithIcon
import com.moriatsushi.katalog.androidsample.compose.material.SampleBottomAppBar
import com.moriatsushi.katalog.androidsample.compose.material.SampleBottomNavigation
import com.moriatsushi.katalog.androidsample.compose.material.SampleButton
import com.moriatsushi.katalog.androidsample.compose.material.SampleCard
import com.moriatsushi.katalog.androidsample.compose.material.SampleCheckbox
import com.moriatsushi.katalog.androidsample.compose.material.SampleCircularProgressIndicator
import com.moriatsushi.katalog.androidsample.compose.material.SampleDropdownMenu
import com.moriatsushi.katalog.androidsample.compose.material.SampleExtendedFloatingActionButton
import com.moriatsushi.katalog.androidsample.compose.material.SampleExtendedFloatingActionButtonFullWidth
import com.moriatsushi.katalog.androidsample.compose.material.SampleFloatingActionButton
import com.moriatsushi.katalog.androidsample.compose.material.SampleIcon
import com.moriatsushi.katalog.androidsample.compose.material.SampleIconButton
import com.moriatsushi.katalog.androidsample.compose.material.SampleIconToggleButton
import com.moriatsushi.katalog.androidsample.compose.material.SampleLinearProgressIndicator
import com.moriatsushi.katalog.androidsample.compose.material.SampleOutlinedButton
import com.moriatsushi.katalog.androidsample.compose.material.SampleRadioButton
import com.moriatsushi.katalog.androidsample.compose.material.SampleRadioButtonWithLabels
import com.moriatsushi.katalog.androidsample.compose.material.SampleScaffold
import com.moriatsushi.katalog.androidsample.compose.material.SampleSlider
import com.moriatsushi.katalog.androidsample.compose.material.SampleSliderWithSteps
import com.moriatsushi.katalog.androidsample.compose.material.SampleSnackbar
import com.moriatsushi.katalog.androidsample.compose.material.SampleSnackbarWithSnackbarHost
import com.moriatsushi.katalog.androidsample.compose.material.SampleSurface
import com.moriatsushi.katalog.androidsample.compose.material.SampleSwitch
import com.moriatsushi.katalog.androidsample.compose.material.SampleTabRow
import com.moriatsushi.katalog.androidsample.compose.material.SampleText
import com.moriatsushi.katalog.androidsample.compose.material.SampleTextButton
import com.moriatsushi.katalog.androidsample.compose.material.SampleTextField
import com.moriatsushi.katalog.androidsample.compose.material.SampleTextFieldForPassword
import com.moriatsushi.katalog.androidsample.compose.material.SampleTextFieldIsError
import com.moriatsushi.katalog.androidsample.compose.material.SampleTextFieldWithIcons
import com.moriatsushi.katalog.androidsample.compose.material.SampleTextFieldWithMessage
import com.moriatsushi.katalog.androidsample.compose.material.SampleTextFieldWithPlaceholder
import com.moriatsushi.katalog.androidsample.compose.material.SampleTopAppBar
import com.moriatsushi.katalog.ext.androidtheme.AndroidThemeExt
import com.moriatsushi.katalog.ext.pagesaver.PageSaverExt
import com.moriatsushi.katalog.ext.theme.ThemeExt
import com.moriatsushi.katalog.registerKatalog
import com.google.android.material.R as MaterialR

class SampleApp : Application() {
    override fun onCreate() {
        super.onCreate()

        registerKatalog(
            title = "Android Sample",
            extensions = listOf(
                AndroidThemeExt(MaterialR.style.Theme_MaterialComponents_DayNight_NoActionBar),
                ThemeExt { SampleTheme(it) },
                PageSaverExt(),
            ),
        ) {
            compose("BottomAppBar") {
                SampleBottomAppBar()
            }
            compose("BottomNavigation") {
                SampleBottomNavigation()
            }
            group("Button") {
                compose("Button") {
                    SampleButton()
                }
                compose("Button with Icon") {
                    ButtonWithIcon()
                }
            }
            compose("Card") {
                SampleCard()
            }
            compose("Checkbox") {
                SampleCheckbox()
            }
            compose("CircularProgressIndicator") {
                SampleCircularProgressIndicator()
            }
            compose("DropdownMenu") {
                SampleDropdownMenu()
            }
            group("ExtendedFloatingActionButton") {
                compose("ExtendedFloatingActionButton") {
                    SampleExtendedFloatingActionButton()
                }
                compose("ExtendedFloatingActionButton full width") {
                    SampleExtendedFloatingActionButtonFullWidth()
                }
            }
            compose("FloatingActionButton") {
                SampleFloatingActionButton()
            }
            compose("Icon") {
                SampleIcon()
            }
            compose("IconButton") {
                SampleIconButton()
            }
            compose("IconToggleButton") {
                SampleIconToggleButton()
            }
            compose("LinearProgressIndicator") {
                SampleLinearProgressIndicator()
            }
            compose("OutlinedButton") {
                SampleOutlinedButton()
            }
            group("RadioButton") {
                compose("RadioButton") {
                    SampleRadioButton()
                }
                compose("RadioButton with labels") {
                    SampleRadioButtonWithLabels()
                }
            }
            compose("Scaffold") {
                SampleScaffold()
            }
            group("Slider") {
                compose("Slider") {
                    SampleSlider()
                }
                compose("Slider with steps") {
                    SampleSliderWithSteps()
                }
            }
            group("Snackbar") {
                compose("Snackbar") {
                    SampleSnackbar()
                }
                compose("Custom with SnackbarHost") {
                    SampleSnackbarWithSnackbarHost()
                }
            }
            compose("Surface") {
                SampleSurface()
            }
            compose("Switch") {
                SampleSwitch()
            }
            compose("TabRow") {
                SampleTabRow()
            }
            compose("Text") {
                SampleText()
            }
            compose("TextButton") {
                SampleTextButton()
            }
            group("TextField") {
                compose("TextField") {
                    SampleTextField()
                }
                compose("TextField with placeholder") {
                    SampleTextFieldWithPlaceholder()
                }
                compose("TextField with icons") {
                    SampleTextFieldWithIcons()
                }
                compose("TextField is error") {
                    SampleTextFieldIsError()
                }
                compose("TextField with message") {
                    SampleTextFieldWithMessage()
                }
                compose("TextField for password") {
                    SampleTextFieldForPassword()
                }
            }
            compose("TopAppBar") {
                SampleTopAppBar()
            }
        }
    }
}
