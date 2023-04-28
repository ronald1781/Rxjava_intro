package com.nttdata.introrxjava.postpresentacion;

import io.reactivex.Observable;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MyBuffer {
    public static void main(String[] args) {

        Observable<String> generator1x2 = Observable.create(subscriber->{
            Random random=new Random();
            List<String> values= Arrays.asList("1","X","2");
            while (!subscriber.isDisposed()){
                subscriber.onNext(values.get(random.nextInt(3)));
            }
            subscriber.onComplete();
        });

        System.out.println("---------");
        generator1x2.buffer(15).take(5);
        System.out.println("---------");
    }

}
