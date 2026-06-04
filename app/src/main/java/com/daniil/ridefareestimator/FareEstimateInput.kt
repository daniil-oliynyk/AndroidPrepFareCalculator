package com.daniil.ridefareestimator

data class FareEstimateInput(
    var distanceKm: Double,
    var rideType: RideType,
    var surgeMultiplier: Double
)