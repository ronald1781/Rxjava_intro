package com.nttdata.introrxjava.presentacion;

public class MainObserver {
    public static void main(String[] args) {
        String message = "Hola, Estamos en la escuela de Microservicios NTTDATA-CENTERS";
        MyObservable myObs = new MyObservable(message);
        myObs.subscribe(msg -> {
            System.out.println(msg);
        });
        myObs.sendMessage();
        OterProces();
        System.out.println("Expecting then process pending");
    }

    private static void OterProces() {
        int z = 0;
        for (int j = 0; j < 200000; j++) {
            z += j;
        }
    }
}
