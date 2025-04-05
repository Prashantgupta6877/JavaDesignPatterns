package com.prashu.javadesignpatterns.behavioral.strategy

import com.prashu.javadesignpatterns.behavioral.observer.observable.impl.StockObservableImpl
import com.prashu.javadesignpatterns.behavioral.observer.observer.impl.EmailAlertSubscriberImpl
import com.prashu.javadesignpatterns.behavioral.observer.observer.impl.MobileAlertSubscriberImpl
import com.prashu.javadesignpatterns.behavioral.observer.observer.NotificationAlertObserver
import com.prashu.javadesignpatterns.behavioral.strategy.interfaceimpl.SportDriveStrategyImpl

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
}