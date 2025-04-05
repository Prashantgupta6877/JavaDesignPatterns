package com.prashu.javadesignpatterns.interfaceimpl

import com.prashu.javadesignpatterns.interfaces.DriveStrategy

class SportDriveStrategyImpl : DriveStrategy {

    override fun drive() {
        println("Sport Drive Strategy Impl")
    }
}