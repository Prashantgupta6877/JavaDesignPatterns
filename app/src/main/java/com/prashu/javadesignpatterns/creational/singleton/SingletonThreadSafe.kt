package com.prashu.javadesignpatterns.creational.singleton

class SingletonThreadSafe {

    private constructor() {
    }

    companion object {
        private var instance: SingletonThreadSafe? = null

        @Synchronized
        fun getInstance(): SingletonThreadSafe {
            return instance?.let {
                return it
            } ?: run {
                instance = SingletonThreadSafe()
                instance as SingletonThreadSafe
            }
        }
    }

    fun showText(){
        println("Singleton Thread Safe Design Pattern")
    }
}