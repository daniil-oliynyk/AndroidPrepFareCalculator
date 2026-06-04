package com.daniil.ridefareestimator

data class FareEstimate(
    val baseFareCents: Int,
    val distanceFareCents: Int,
    val rideTypeAdjustmentCents: Int,
    val surgeAdjustmentCents: Int,
    val totalCents: Int
)