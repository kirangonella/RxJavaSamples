package com.rxjava.samples;

import rx.Observable;
import rx.Subscriber;

public class RxJavaGettingStarted {
    public static void main(String[] args) {

        Observable<String> sampleObservable = Observable.just("Welcome to RxJava");
        
        Subscriber<String> sampleSubscriber = new Subscriber<String>() {

            @Override
            public void onCompleted() {
                System.out.println("Emitting Complete!");
            }

            @Override
            public void onError(Throwable e) {

            }
            
            @Override
            public void onNext(String value) {
                System.out.println("onNext method: " + value);
            }

        };
        
        
        sampleObservable.subscribe(sampleSubscriber);
        
    }
}