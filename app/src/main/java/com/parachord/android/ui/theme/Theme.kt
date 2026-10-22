package com.parachord.android.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

/**
 * Parachord Material 3 schemes from the exact shadcn preset b6W2kHjuVs.
 * Shared source: design-system/shadcn-theme.json; dynamic color is disabled.
 */
private val DarkColorScheme = darkColorScheme(
    primary = ShadcnPalette.Dark.primary,
    onPrimary = ShadcnPalette.Dark.primaryForeground,
    primaryContainer = ShadcnPalette.Dark.secondary,
    onPrimaryContainer = ShadcnPalette.Dark.secondaryForeground,
    secondary = ShadcnPalette.Dark.secondary,
    onSecondary = ShadcnPalette.Dark.secondaryForeground,
    secondaryContainer = ShadcnPalette.Dark.muted,
    onSecondaryContainer = ShadcnPalette.Dark.secondaryForeground,
    tertiary = ShadcnPalette.Dark.accent,
    onTertiary = ShadcnPalette.Dark.accentForeground,
    background = ShadcnPalette.Dark.background,
    onBackground = ShadcnPalette.Dark.foreground,
    surface = ShadcnPalette.Dark.card,
    onSurface = ShadcnPalette.Dark.cardForeground,
    surfaceVariant = ShadcnPalette.Dark.muted,
    onSurfaceVariant = ShadcnPalette.Dark.mutedForeground,
    outline = ShadcnPalette.Dark.border,
    outlineVariant = ShadcnPalette.Dark.input,
    error = ShadcnPalette.Dark.destructive,
    onError = Color.White,
)

private val LightColorScheme = lightColorScheme(
    primary = ShadcnPalette.Light.primary,
    onPrimary = ShadcnPalette.Light.primaryForeground,
    primaryContainer = ShadcnPalette.Light.secondary,
    onPrimaryContainer = ShadcnPalette.Light.secondaryForeground,
    secondary = ShadcnPalette.Light.secondary,
    onSecondary = ShadcnPalette.Light.secondaryForeground,
    secondaryContainer = ShadcnPalette.Light.muted,
    onSecondaryContainer = ShadcnPalette.Light.secondaryForeground,
    tertiary = ShadcnPalette.Light.accent,
    onTertiary = ShadcnPalette.Light.accentForeground,
    background = ShadcnPalette.Light.background,
    onBackground = ShadcnPalette.Light.foreground,
    surface = ShadcnPalette.Light.card,
    onSurface = ShadcnPalette.Light.cardForeground,
    surfaceVariant = ShadcnPalette.Light.muted,
    onSurfaceVariant = ShadcnPalette.Light.mutedForeground,
    outline = ShadcnPalette.Light.border,
    outlineVariant = ShadcnPalette.Light.input,
    error = ShadcnPalette.Light.destructive,
    onError = Color.White,
)

// ── Extended Colors ──────────────────────────────────────────────────
// Colors that don't map to Material 3 slots (alpha variants, resolver
// colors, always-dark player surfaces, card-specific styles).

@Immutable
data class ParachordExtendedColors(
    // Accent alpha variants
    val accentAlpha06: Color,
    val accentAlpha10: Color,
    val accentAlpha20: Color,
    val accentAlpha40: Color,
    val accentAlpha60: Color,
    val accentSurface: Color,

    // Card styling
    val cardBackground: Color,
    val cardBorder: Color,

    // Always-dark player surfaces (same in both themes)
    val playerSurface: Color = PlayerSurface,
    val playerSurfaceElevated: Color = PlayerSurfaceElevated,
    val playerTextPrimary: Color = PlayerTextPrimary,
    val playerTextSecondary: Color = PlayerTextSecondary,
)

private val LightExtendedColors = ParachordExtendedColors(
    accentAlpha06 = ShadcnPalette.Light.primary.copy(alpha = 0.06f),
    accentAlpha10 = ShadcnPalette.Light.primary.copy(alpha = 0.10f),
    accentAlpha20 = ShadcnPalette.Light.primary.copy(alpha = 0.20f),
    accentAlpha40 = ShadcnPalette.Light.primary.copy(alpha = 0.40f),
    accentAlpha60 = ShadcnPalette.Light.primary.copy(alpha = 0.60f),
    accentSurface = ShadcnPalette.Light.accent,
    cardBackground = ShadcnPalette.Light.card,
    cardBorder = ShadcnPalette.Light.border,
)

private val DarkExtendedColors = ParachordExtendedColors(
    accentAlpha06 = ShadcnPalette.Dark.primary.copy(alpha = 0.06f),
    accentAlpha10 = ShadcnPalette.Dark.primary.copy(alpha = 0.10f),
    accentAlpha20 = ShadcnPalette.Dark.primary.copy(alpha = 0.20f),
    accentAlpha40 = ShadcnPalette.Dark.primary.copy(alpha = 0.40f),
    accentAlpha60 = ShadcnPalette.Dark.primary.copy(alpha = 0.60f),
    accentSurface = ShadcnPalette.Dark.accent,
    cardBackground = ShadcnPalette.Dark.card,
    cardBorder = ShadcnPalette.Dark.border,
)

val LocalParachordColors = staticCompositionLocalOf { LightExtendedColors }

/**
 * Whether the app is currently using a dark theme.
 *
 * Use this instead of [isSystemInDarkTheme] — the app supports a manual
 * dark/light toggle in settings, so the system setting may not reflect
 * the actual theme. [ParachordTheme] provides the correct value.
 */
val LocalIsDarkTheme = staticCompositionLocalOf { false }

/** User-configured resolver priority order, provided at the app root. */
val LocalResolverOrder = staticCompositionLocalOf { emptyList<String>() }

// ── Theme Accessor ───────────────────────────────────────────────────

object ParachordTheme {
    val colors: ParachordExtendedColors
        @Composable get() = LocalParachordColors.current

    val isDark: Boolean
        @Composable get() = LocalIsDarkTheme.current
}

// ── Theme Composable ─────────────────────────────────────────────────

@Composable
fun ParachordTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme
    val extendedColors = if (darkTheme) DarkExtendedColors else LightExtendedColors

    CompositionLocalProvider(
        LocalParachordColors provides extendedColors,
        LocalIsDarkTheme provides darkTheme,
    ) {
        MaterialTheme(
            colorScheme = colorScheme,
            typography = ParachordTypography,
            shapes = ParachordShapes,
            content = content,
        )
    }
}
