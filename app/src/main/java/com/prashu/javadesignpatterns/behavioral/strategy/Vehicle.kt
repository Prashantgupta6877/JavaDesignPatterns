package com.prashu.javadesignpatterns.behavioral.strategy

import com.prashu.javadesignpatterns.behavioral.strategy.interfaces.DriveStrategy

abstract class Vehicle(val driveStrategy: DriveStrategy) {

    fun drive(){
        driveStrategy.drive()
    }
}