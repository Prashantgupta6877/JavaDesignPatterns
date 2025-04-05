package com.prashu.javadesignpatterns.behavioral.observer.observable.impl

import com.prashu.javadesignpatterns.behavioral.observer.observable.StockObservable
import com.prashu.javadesignpatterns.behavioral.observer.observer.NotificationAlertObserver

class StockObservableImpl : StockObservable {

    private val subscribers = mutableListOf<NotificationAlertObserver>()
    private var newStock = 0

    override fun addSubscriber(subscriber: NotificationAlertObserver) {
        subscribers.add(subscriber)
    }

    override fun removeSubscriber(subscriber: NotificationAlertObserver) {
        subscribers.remove(subscriber)
    }

    override fun notifySubscriber() {
        for (subscriber: NotificationAlertObserver in subscribers) {
            subscriber.update()
        }
    }

    override fun setStockCount(newStock: Int) {
        if (this.newStock == 0) {
            this.newStock += newStock
            notifySubscriber()
        }
    }

    override fun getStockCount() = newStock
}