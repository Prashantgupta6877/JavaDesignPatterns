package com.prashu.javadesignpatterns

import com.prashu.javadesignpatterns.interfaces.DriveStrategy

class SportVehicle(driveStrategy: DriveStrategy) : Vehicle(driveStrategy) {


}