package com.parachord.android.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import com.parachord.android.R
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp

/**
 * The shadcn preset's DM Sans / Space Grotesk typography.
 * Fonts are bundled for offline Android use and are SIL OFL licensed.
 * Source of truth: design-system/shadcn-preset.json.
 */
private val ShadcnBodyFont = FontFamily(
    Font(R.font.dm_sans_variable, FontWeight.Normal),
    Font(R.font.dm_sans_variable, FontWeight.Medium),
    Font(R.font.dm_sans_variable, FontWeight.SemiBold),
    Font(R.font.dm_sans_variable, FontWeight.Bold),
)

private val ShadcnHeadingFont = FontFamily(
    Font(R.font.space_grotesk_variable, FontWeight.Normal),
    Font(R.font.space_grotesk_variable, FontWeight.Medium),
    Font(R.font.space_grotesk_variable, FontWeight.SemiBold),
    Font(R.font.space_grotesk_variable, FontWeight.Bold),
)

val ParachordTypography = Typography(
    // Display styles (large hero text)
    displayLarge = Typography().displayLarge.copy(
        fontFamily = ShadcnHeadingFont,
        fontWeight = FontWeight.SemiBold,
        letterSpacing = (-0.02).em,
        lineHeight = 40.sp,
    ),
    displayMedium = Typography().displayMedium.copy(
        fontFamily = ShadcnHeadingFont,
        fontWeight = FontWeight.SemiBold,
        letterSpacing = (-0.02).em,
    ),
    displaySmall = Typography().displaySmall.copy(
        fontFamily = ShadcnHeadingFont,
        fontWeight = FontWeight.SemiBold,
        letterSpacing = (-0.01).em,
    ),

    // Headline styles (screen titles, section titles)
    headlineLarge = Typography().headlineLarge.copy(
        fontFamily = ShadcnHeadingFont,
        fontWeight = FontWeight.SemiBold,
        letterSpacing = (-0.01).em,
        lineHeight = 36.sp,
    ),
    headlineMedium = Typography().headlineMedium.copy(
        fontFamily = ShadcnHeadingFont,
        fontWeight = FontWeight.SemiBold,
        letterSpacing = (-0.005).em,
        lineHeight = 32.sp,
    ),
    headlineSmall = Typography().headlineSmall.copy(
        fontFamily = ShadcnHeadingFont,
        fontWeight = FontWeight.SemiBold,
        letterSpacing = (-0.005).em,
        lineHeight = 28.sp,
    ),

    // Title styles
    titleLarge = Typography().titleLarge.copy(
        fontFamily = ShadcnHeadingFont,
        fontWeight = FontWeight.SemiBold,
        letterSpacing = 0.sp,
    ),
    titleMedium = Typography().titleMedium.copy(
        fontFamily = ShadcnHeadingFont,
        fontWeight = FontWeight.Medium,
        letterSpacing = 0.01.em,
    ),
    titleSmall = Typography().titleSmall.copy(
        fontFamily = ShadcnHeadingFont,
        fontWeight = FontWeight.Medium,
        letterSpacing = 0.02.em,
    ),

    // Body styles
    bodyLarge = Typography().bodyLarge.copy(
        fontFamily = ShadcnBodyFont,
        lineHeight = 24.sp,
        letterSpacing = 0.01.em,
    ),
    bodyMedium = Typography().bodyMedium.copy(
        fontFamily = ShadcnBodyFont,
        lineHeight = 22.sp,
        letterSpacing = 0.02.em,
    ),
    bodySmall = Typography().bodySmall.copy(
        fontFamily = ShadcnBodyFont,
        lineHeight = 18.sp,
        letterSpacing = 0.02.em,
    ),

    // Label styles (section headers, badges, metadata)
    labelLarge = Typography().labelLarge.copy(
        fontFamily = ShadcnBodyFont,
        fontWeight = FontWeight.Medium,
        letterSpacing = 0.05.em,
    ),
    labelMedium = Typography().labelMedium.copy(
        fontFamily = ShadcnBodyFont,
        fontWeight = FontWeight.Medium,
        letterSpacing = 0.05.em,
    ),
    labelSmall = Typography().labelSmall.copy(
        fontFamily = ShadcnBodyFont,
        fontWeight = FontWeight.Medium,
        letterSpacing = 0.08.em,
    ),
)
