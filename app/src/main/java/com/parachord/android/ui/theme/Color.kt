package com.parachord.android.ui.theme

import androidx.compose.ui.graphics.Color

/**
 * Legacy color aliases now backed by the exact shared shadcn Neutral palette.
 * Names are retained temporarily for existing consumers across the app.
 * New components should use ShadcnPalette or MaterialTheme.colorScheme.
 */
// ── Legacy accent aliases (neutral shadcn primary) ──────────────────────────────────────────────
val PurpleLight = ShadcnPalette.Light.primary
val PurpleDark = ShadcnPalette.Dark.primary
val PurpleHoverLight = ShadcnPalette.Light.foreground
val PurpleHoverDark = ShadcnPalette.Dark.foreground
val PurpleSecondary = ShadcnPalette.Light.primary
val PurpleTertiary = ShadcnPalette.Light.primary
val PurpleSoft = ShadcnPalette.Light.mutedForeground
val PurpleSurface = ShadcnPalette.Light.accent

// Alpha variants of the selected shadcn primary
val PurpleAlpha06 = ShadcnPalette.Light.primary.copy(alpha = 0.06f)
val PurpleAlpha10 = ShadcnPalette.Light.primary.copy(alpha = 0.10f)
val PurpleAlpha20 = ShadcnPalette.Light.primary.copy(alpha = 0.20f)
val PurpleAlpha40 = ShadcnPalette.Light.primary.copy(alpha = 0.40f)
val PurpleAlpha60 = ShadcnPalette.Light.primary.copy(alpha = 0.60f)

// Dark theme alpha variants
val PurpleDarkAlpha10 = ShadcnPalette.Dark.primary.copy(alpha = 0.10f)
val PurpleDarkAlpha20 = ShadcnPalette.Dark.primary.copy(alpha = 0.20f)

// ── Semantic Colors ──────────────────────────────────────────────────
val Success = Color(0xFF10B981)
val Warning = Color(0xFFF59E0B)
val Error = Color(0xFFEF4444)

// ── Background Colors ────────────────────────────────────────────────
// Light theme
val BgPrimaryLight = ShadcnPalette.Light.background
val BgSecondaryLight = ShadcnPalette.Light.secondary
val BgElevatedLight = ShadcnPalette.Light.card
val BgInsetLight = ShadcnPalette.Light.muted

// Dark theme
val BgPrimaryDark = ShadcnPalette.Dark.background
val BgSecondaryDark = ShadcnPalette.Dark.secondary
val BgElevatedDark = ShadcnPalette.Dark.card
val BgInsetDark = ShadcnPalette.Dark.muted

// ── Text Colors ──────────────────────────────────────────────────────
val TextPrimaryLight = ShadcnPalette.Light.foreground
val TextSecondaryLight = ShadcnPalette.Light.mutedForeground
val TextTertiaryLight = ShadcnPalette.Light.mutedForeground

val TextPrimaryDark = ShadcnPalette.Dark.foreground
val TextSecondaryDark = ShadcnPalette.Dark.mutedForeground
val TextTertiaryDark = ShadcnPalette.Dark.mutedForeground

// ── Border Colors ────────────────────────────────────────────────────
val BorderDefaultLight = ShadcnPalette.Light.border
val BorderLightLight = ShadcnPalette.Light.input
val BorderDefaultDark = ShadcnPalette.Dark.border
val BorderLightDark = ShadcnPalette.Dark.input

// ── Card Colors ──────────────────────────────────────────────────────
val CardBgLight = ShadcnPalette.Light.card
val CardBorderLight = ShadcnPalette.Light.border
val CardBgDark = ShadcnPalette.Dark.card
val CardBorderDark = ShadcnPalette.Dark.border

// ── Always-Dark Player Surface ───────────────────────────────────────
val PlayerSurface = ShadcnPalette.Dark.background
val PlayerSurfaceElevated = ShadcnPalette.Dark.card
val PlayerTextPrimary = ShadcnPalette.Dark.foreground
val PlayerTextSecondary = ShadcnPalette.Dark.mutedForeground

// ── Resolver-Specific Colors ─────────────────────────────────────────
// Each resolver has a background (alpha-20) and text (bright) color pair.

data class ResolverColorPair(val background: Color, val text: Color)

object ResolverColors {
    val spotify = ResolverColorPair(
        background = Color(0x33059669),  // green-600/20
        text = Color(0xFF4ADE80),        // green-400
    )
    val youtube = ResolverColorPair(
        background = Color(0x33DC2626),  // red-600/20
        text = Color(0xFFF87171),        // red-400
    )
    val bandcamp = ResolverColorPair(
        background = Color(0x330891B2),  // cyan-600/20
        text = Color(0xFF22D3EE),        // cyan-400
    )
    val soundcloud = ResolverColorPair(
        background = Color(0x33EA580C),  // orange-600/20
        text = Color(0xFFFB923C),        // orange-400
    )
    val applemusic = ResolverColorPair(
        background = Color(0x33DC2626),  // red-600/20
        text = Color(0xFFF87171),        // red-400
    )
    val localfiles = ResolverColorPair(
        background = Color(0x334B5563),  // gray-600/20
        text = Color(0xFF9CA3AF),        // gray-400
    )

    fun forResolver(resolver: String?): ResolverColorPair? = when (resolver?.lowercase()) {
        "spotify" -> spotify
        "youtube" -> youtube
        "bandcamp" -> bandcamp
        "soundcloud" -> soundcloud
        "applemusic" -> applemusic
        "localfiles" -> localfiles
        else -> null
    }
}
