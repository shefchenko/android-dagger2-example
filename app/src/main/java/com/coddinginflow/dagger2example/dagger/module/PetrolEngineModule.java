package com.coddinginflow.dagger2example.dagger.module;

import com.coddinginflow.dagger2example.car.Engine;
import com.coddinginflow.dagger2example.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

//    @Provides
//    Engine provideEngine(PetrolEngine engine) {
//        return engine;
//    }

    // Another better way of providing
    // When we want to bind an implementation to interface - then use bind methods!
    @Binds
    abstract Engine bindEngine(PetrolEngine engine);


}
