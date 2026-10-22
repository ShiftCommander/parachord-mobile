package com.parachord.android.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

/**
 * Rhea style from shadcn preset b6W2kHjuVs.
 * 0.625rem = 10px base radius; Compose shapes follow the shadcn scale.
 */
val ParachordShapes = Shapes(
    extraSmall = RoundedCornerShape(6.dp),
    small = RoundedCornerShape(8.dp),
    medium = RoundedCornerShape(10.dp),
    large = RoundedCornerShape(14.dp),
    extraLarge = RoundedCornerShape(18.dp),
)
