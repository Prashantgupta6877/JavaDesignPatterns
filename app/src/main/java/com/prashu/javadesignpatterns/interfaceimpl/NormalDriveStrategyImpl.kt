package com.prashu.javadesignpatterns.interfaceimpl

import com.prashu.javadesignpatterns.interfaces.DriveStrategy

class NormalDriveStrategyImpl : DriveStrategy {

    override fun drive() {
        println("Normal DRive Strategy Impl")
    }
}