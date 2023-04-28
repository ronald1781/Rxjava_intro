package com.nttdata.introrxjava.postpresentacion;

import io.reactivex.Observable;

import java.util.ArrayList;
import java.util.List;

public class MyFlatMap {
    public static void main(String[] args) {
        List<String> phrase = new ArrayList<>();
        phrase.add("Reactivex! RxJava!");
        phrase.add("Programacion Reactiva consiste");
        phrase.add("en usar la programación funcional");
        phrase.add("de forma asíncrona (reactiva).");

        Observable.fromIterable(phrase)
                .flatMap(s -> Observable.fromArray(s.split(" ")))
                .blockingSubscribe(System.out::println);
    }
}
