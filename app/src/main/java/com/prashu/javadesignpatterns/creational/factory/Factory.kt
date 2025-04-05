package com.prashu.javadesignpatterns.creational.factory

class Factory {

    fun getDriveType(driveType: DriveType): DriveInterface {
        return when (driveType) {
            DriveType.NORMAL -> {
                NormalVehicleDrive()
            }

            DriveType.SPORT -> {
                SportVehicleDriveImpl()
            }
        }
    }

    enum class DriveType {
        SPORT, NORMAL
    }
}