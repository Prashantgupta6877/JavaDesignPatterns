package com.prashu.javadesignpatterns.behavioral.strategy

import com.prashu.javadesignpatterns.behavioral.strategy.interfaceimpl.SportDriveStrategyImpl

fun main() {
    val vehicle = SportVehicle(SportDriveStrategyImpl())
    vehicle.drive()
}