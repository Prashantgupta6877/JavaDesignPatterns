package com.prashu.javadesignpatterns.behavioral.observer.observable

import com.prashu.javadesignpatterns.behavioral.observer.observer.NotificationAlertObserver

interface StockObservable {

    fun addSubscriber(subscriber: NotificationAlertObserver)

    fun removeSubscriber(subscriber: NotificationAlertObserver)

    fun notifySubscriber()

    fun setStockCount(newStock: Int)

    fun getStockCount(): Int
}