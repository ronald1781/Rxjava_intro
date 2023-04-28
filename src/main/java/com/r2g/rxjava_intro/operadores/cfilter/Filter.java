package com.nttdata.introrxjava.operadores.cfilter;

import io.reactivex.Observable;

public class Filter {
    public static void main(String[] args) {
        String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i"};
        final StringBuilder result = new StringBuilder();
        Observable<String> observable = Observable.fromArray(letters);
        observable.take(2).subscribe(letter -> result.append(letter));
        System.out.println(result);
    }
}
