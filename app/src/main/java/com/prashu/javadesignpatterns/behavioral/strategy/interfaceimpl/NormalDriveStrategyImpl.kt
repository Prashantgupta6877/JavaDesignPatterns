package com.prashu.javadesignpatterns.behavioral.strategy.interfaceimpl

import com.prashu.javadesignpatterns.behavioral.strategy.interfaces.DriveStrategy

class NormalDriveStrategyImpl : DriveStrategy {

    override fun drive() {
        println("Normal DRive Strategy Impl")
    }
}