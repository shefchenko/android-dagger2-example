package com.coddinginflow.dagger2example.dagger.module;

import com.coddinginflow.dagger2example.car.some_library.Rims;
import com.coddinginflow.dagger2example.car.some_library.Tires;
import com.coddinginflow.dagger2example.car.some_library.Wheels;

import dagger.Module;
import dagger.Provides;

// Use modules for third party libraries, because we can't modify them and can't add @Inject into the constructor.!
@Module
public class WheelsModule {

    @Provides
    static Rims provideRims() {
        return new Rims();
    }

    @Provides
    static Tires provideTires() {
        Tires tires = new Tires();
        // We can modify the object before it's injected
        tires.inflate();
        return tires;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires) {
        return new Wheels(rims, tires);
    }

}
