package com.prashu.javadesignpatterns

import com.prashu.javadesignpatterns.interfaceimpl.SportDriveStrategyImpl

fun main() {
    val vehicle = SportVehicle(SportDriveStrategyImpl())
    vehicle.drive()
}