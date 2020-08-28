package com.arahansa.observer;

/**
 * 주제 :
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
