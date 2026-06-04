package com.daniil.ridefareestimator

enum class RideType {
    STANDARD,
    XL,
    LUXURY
}

fun mapRideTypePrice(rideType: RideType): Double {
    return when(rideType) {
        RideType.STANDARD -> 1.0
        RideType.XL -> 2.0
        RideType.LUXURY -> 4.0
    }
}

fun mapTextToRideType(text: String): RideType {
    return when(text) {
        "Standard" -> RideType.STANDARD
        "XL" -> RideType.XL
        else -> { RideType.LUXURY }
    }


}