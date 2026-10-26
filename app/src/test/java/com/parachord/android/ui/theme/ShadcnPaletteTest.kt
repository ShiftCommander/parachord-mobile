package com.parachord.android.ui.theme

import androidx.compose.ui.graphics.Color
import org.junit.Assert.assertEquals
import org.junit.Test

/** Guards the shadcn preset b6W2kHjuVs color mapping on Android. */
class ShadcnPaletteTest {

    @Test
    fun neutralPrimaryColorsMatchTheSharedPreset() {
        assertEquals(Color(0xFF171717), ShadcnPalette.Light.primary)
        assertEquals(Color(0xFFE5E5E5), ShadcnPalette.Dark.primary)
    }

    @Test
    fun mainSurfacesMatchTheSharedPreset() {
        assertEquals(Color(0xFFFFFFFF), ShadcnPalette.Light.background)
        assertEquals(Color(0xFF0A0A0A), ShadcnPalette.Dark.background)
        assertEquals(Color(0xFF171717), ShadcnPalette.Dark.card)
    }

    @Test
    fun chartAccentIsPurpleOnBothThemes() {
        assertEquals(Color(0xFFDAB2FF), ShadcnPalette.Light.chart1)
        assertEquals(ShadcnPalette.Light.chart1, ShadcnPalette.Dark.chart1)
        assertEquals(Color(0xFF6E11B0), ShadcnPalette.Light.chart5)
    }
}
