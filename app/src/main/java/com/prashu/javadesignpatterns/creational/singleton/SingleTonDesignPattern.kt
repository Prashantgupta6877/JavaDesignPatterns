package com.prashu.javadesignpatterns.creational.singleton

class SingleTonDesignPattern {

    private constructor() {

    }

    companion object {
        private var instance: SingleTonDesignPattern? = null
        fun getInstance(): SingleTonDesignPattern {
            instance?.let {
                return it
            } ?: run {
                instance = SingleTonDesignPattern()
                return instance as SingleTonDesignPattern
            }
        }
    }

    fun showText() {
        println("Singleton Design Pattern")
    }

}