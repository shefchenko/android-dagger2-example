package com.coddinginflow.dagger2example.car;

import android.util.Log;

import com.coddinginflow.dagger2example.car.some_library.Wheels;

import javax.inject.Inject;

public class Car {

    private static final String TAG = "ShaCar";

    private Engine engine;
    private Wheels wheels;

    // Field injection - invoked second
//    @Inject private Engine engine;

    // Constructor injection - invoked first
    @Inject
    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }


    // Method injection - invoked third.
    // Use only if we need to pass 'this' into the dependencies.
    @Inject
    public void enableRemote(Remote remote) {
        remote.setListener(this);

    }

    public void drive() {
        engine.start();
        Log.d(TAG, "driving...");
    }

}
