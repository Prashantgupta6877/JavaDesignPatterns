package com.prashu.javadesignpatterns.behavioral.strategy

import com.prashu.javadesignpatterns.behavioral.strategy.interfaces.DriveStrategy

class SportVehicle(driveStrategy: DriveStrategy) : Vehicle(driveStrategy) {


}