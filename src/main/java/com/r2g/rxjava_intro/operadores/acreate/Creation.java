package com.nttdata.introrxjava.operadores.acreate;

import io.reactivex.Observable;

public class Creation {
    public static void main(String[] args) {
        String[] letters = {"a", "b", "c", "d", "e", "f", "g","h", "i"};
        final StringBuilder result = new StringBuilder();
        Observable<String> observable = Observable.fromArray(letters);
        observable.map(String::toUpperCase).subscribe(letter -> result.append(letter));
        System.out.println(result);
    }
}
