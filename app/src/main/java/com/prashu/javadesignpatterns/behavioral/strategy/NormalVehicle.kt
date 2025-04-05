package com.prashu.javadesignpatterns.behavioral.strategy

import com.prashu.javadesignpatterns.behavioral.strategy.interfaces.DriveStrategy

class NormalVehicle(driveStrategy: DriveStrategy) : Vehicle(driveStrategy) {

}