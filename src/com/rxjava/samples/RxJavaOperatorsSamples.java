package com.rxjava.samples;

import java.util.concurrent.TimeUnit;

import rx.Observable;

public class RxJavaOperatorsSamples {

    public static void main(String[] args) {
        Observable.just("demo of map transformation operator").map(samplemap -> samplemap + " with map() method in RxJava").subscribe(samplemap -> System.out.println(samplemap));
        Observable.just("Debounce will delay the message emitting by provided number of milliseconds").debounce(500, TimeUnit.MILLISECONDS).subscribe(samplemap -> System.out.println(samplemap));
        Observable.just("Filter will filter the conditions that doesnot satisfy the provided condition").filter(title -> title != null).subscribe(samplemap -> System.out.println(samplemap));
    }

}
