package com.daniil.ridefareestimator

data class FareEstimate(
    var baseFare: Double,
    var distanceFare: Double,
    var rideTypeAdjustment: Double,
    var surgeAdjustment: Double,
    var total: Double
)