package com.prashu.javadesignpatterns.behavioral.observer.observer.impl

import com.prashu.javadesignpatterns.behavioral.observer.observable.StockObservable
import com.prashu.javadesignpatterns.behavioral.observer.observer.NotificationAlertObserver

class EmailAlertSubscriberImpl(
    private val emailId: String, private val stockObservable: StockObservable
) : NotificationAlertObserver {

    override fun update() {
        println("Email Address - $emailId and Stock Count - ${stockObservable.getStockCount()}")
    }
}