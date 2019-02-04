package com.coddinginflow.dagger2example.car.some_library;

import android.util.Log;

// We don't own this class so we can't annotate it with @Inject
public class Tires {

    private static final String TAG = "ShaCar";

    public void inflate() {
        Log.d(TAG, "Tires inflated");
    }
}
