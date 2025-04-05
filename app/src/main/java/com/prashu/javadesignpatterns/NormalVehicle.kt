package com.prashu.javadesignpatterns

import com.prashu.javadesignpatterns.interfaces.DriveStrategy

class NormalVehicle(driveStrategy: DriveStrategy) : Vehicle(driveStrategy) {

}