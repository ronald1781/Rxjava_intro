package com.nttdata.introrxjava.operadores.econditional;

import io.reactivex.Observable;

public class Conditional {
    public static void main(String[] args) {
        final StringBuilder result = new StringBuilder();
        Observable.empty().defaultIfEmpty("No Data").subscribe(s -> result.append(s));
        System.out.println(result);
        String[] letters = {"a", "b", "c", "d", "e", "f", "g", "f", "g"};
        final StringBuilder result1 = new StringBuilder();
        Observable.fromArray(letters).firstElement().defaultIfEmpty("No data").subscribe(s -> result1.append(s));
        System.out.println(result1);
    }
}
