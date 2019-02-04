package com.coddinginflow.dagger2example.car;

import android.util.Log;

import javax.inject.Inject;

public class Remote {

    private static final String TAG = "ShaCar";

    @Inject
    public Remote() {
    }

    void setListener(Car car){
        Log.d(TAG, "Remote connected");
    }
}
