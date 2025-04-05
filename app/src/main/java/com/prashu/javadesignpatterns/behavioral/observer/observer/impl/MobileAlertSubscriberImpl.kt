package com.prashu.javadesignpatterns.behavioral.observer.observer.impl

import com.prashu.javadesignpatterns.behavioral.observer.observable.StockObservable
import com.prashu.javadesignpatterns.behavioral.observer.observer.NotificationAlertObserver

class MobileAlertSubscriberImpl(
    private val mobileNumber: String, private val stockObservable: StockObservable
) : NotificationAlertObserver {

    override fun update() {
        println("Mobile Number - $mobileNumber and Stock Count - ${stockObservable.getStockCount()}")
    }
}