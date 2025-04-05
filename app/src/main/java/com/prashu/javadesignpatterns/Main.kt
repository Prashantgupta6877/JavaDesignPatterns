package com.prashu.javadesignpatterns

import com.prashu.javadesignpatterns.behavioral.observer.observable.impl.StockObservableImpl
import com.prashu.javadesignpatterns.behavioral.observer.observer.impl.EmailAlertSubscriberImpl
import com.prashu.javadesignpatterns.behavioral.observer.observer.impl.MobileAlertSubscriberImpl
import com.prashu.javadesignpatterns.behavioral.observer.observer.NotificationAlertObserver
import com.prashu.javadesignpatterns.behavioral.strategy.SportVehicle
import com.prashu.javadesignpatterns.behavioral.strategy.interfaceimpl.SportDriveStrategyImpl
import com.prashu.javadesignpatterns.creational.singleton.SingleTonDesignPattern
import com.prashu.javadesignpatterns.creational.singleton.SingleTonEagerInitialization
import com.prashu.javadesignpatterns.creational.singleton.SingletonBillPugh
import com.prashu.javadesignpatterns.creational.singleton.SingletonThreadSafe

fun main() {

    // Strategy Pattern
    val vehicle = SportVehicle(SportDriveStrategyImpl())
    vehicle.drive()

    // Observable Pattern
    val stockObservable = StockObservableImpl()

    val subscriber1: NotificationAlertObserver =
        MobileAlertSubscriberImpl("9875xxxxxx", stockObservable)

    val subscriber2: NotificationAlertObserver =
        MobileAlertSubscriberImpl("9873xxxxxx", stockObservable)

    val subscriber3: NotificationAlertObserver =
        EmailAlertSubscriberImpl("abc@gmail.com", stockObservable)

    stockObservable.addSubscriber(subscriber1)
    stockObservable.addSubscriber(subscriber2)
    stockObservable.addSubscriber(subscriber3)

    stockObservable.setStockCount(10)

    // Singleton
    val singleTonDesignPattern = SingleTonDesignPattern.getInstance()
    singleTonDesignPattern.showText()

    //Eager initialization Singleton
    val singleTonDesignPattern1 = SingleTonEagerInitialization.getInstance()
    singleTonDesignPattern1.showText()

    //Thread Safe Singleton
    val singleTonDesignPattern2 = SingletonThreadSafe.getInstance()
    singleTonDesignPattern2.showText()

    //Bill Pugh SingleTon
    val singleTonDesignPattern3 = SingletonBillPugh.getInstance()
    singleTonDesignPattern3.showText()

}