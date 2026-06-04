package com.daniil.ridefareestimator

data class FareEstimateInput(
    val distanceKm: Double,
    val rideType: RideType,
    val surgeMultiplier: Double
)