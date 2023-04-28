package com.nttdata.introrxjava.presentacion;

import io.reactivex.Observable;
import io.reactivex.Observer;

import java.util.LinkedList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class MyObservable extends Observable<String> {
    private List<Observer<? super String>> myobservadors = new LinkedList<>();
    private String message;

    public MyObservable(String message) {
        this.message = message;
    }

    @Override
    protected void subscribeActual(Observer<? super String> observer) {
        myobservadors.add(observer);
    }
    public void sendMessage(){
        Timer timerMessage=new Timer();
        timerMessage.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                myobservadors.forEach(obser -> obser.onNext(message));
                myobservadors.forEach(obser -> obser.onComplete());
                timerMessage.cancel();
            }
        },3000,1);
    }
}
