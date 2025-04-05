package com.prashu.javadesignpatterns.creational.singleton

class SingleTonEagerInitialization {

    private constructor() {}

    companion object {
        private val instance = SingleTonEagerInitialization()

        fun getInstance() = instance
    }

    fun showText(){
        println("Singleton Eager Initialization Design Pattern")
    }
}
