package com.prashu.javadesignpatterns.behavioral.strategy.interfaceimpl

import com.prashu.javadesignpatterns.behavioral.strategy.interfaces.DriveStrategy

class SportDriveStrategyImpl : DriveStrategy {

    override fun drive() {
        println("Sport Drive Strategy Impl")
    }
}