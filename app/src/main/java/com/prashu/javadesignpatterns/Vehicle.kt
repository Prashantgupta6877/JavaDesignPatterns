package com.prashu.javadesignpatterns

import com.prashu.javadesignpatterns.interfaces.DriveStrategy

abstract class Vehicle(val driveStrategy: DriveStrategy) {

    fun drive(){
        driveStrategy.drive()
    }
}