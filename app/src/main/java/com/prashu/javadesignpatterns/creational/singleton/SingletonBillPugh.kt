package com.prashu.javadesignpatterns.creational.singleton

class SingletonBillPugh {

    private constructor(){}

    companion object{
        private  class SingletonHelper{
            companion object{
                val instance = SingletonBillPugh()
            }
        }

        fun getInstance() = SingletonHelper.instance
    }

    fun showText(){
        println("Singleton Bill Pugh Design Pattern")
    }
}