package com.nttdata.introrxjava.operadores.dcombination;

import io.reactivex.Observable;

public class Combination {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i"};
        final StringBuilder result = new StringBuilder();
        Observable<String> observable1 = Observable.fromArray(letters);
        Observable<Integer> observable2 = Observable.fromArray(numbers);
        Observable.combineLatest(observable1, observable2, (a, b) -> a + b).subscribe(letter -> result.append(letter));
        System.out.println(result);
    }
}
