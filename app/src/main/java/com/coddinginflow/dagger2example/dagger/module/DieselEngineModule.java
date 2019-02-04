package com.coddinginflow.dagger2example.dagger.module;

import com.coddinginflow.dagger2example.car.DieselEngine;
import com.coddinginflow.dagger2example.car.Engine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DieselEngineModule {

//    @Provides
//    Engine provideEngine(Diesel engine) {
//        return engine;
//    }

    // Another better way of providing
    // When we want to bind an implementation to interface - then use bind methods!
    @Binds
    abstract Engine bindEngine(DieselEngine engine);


}
