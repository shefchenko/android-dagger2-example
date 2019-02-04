package com.coddinginflow.dagger2example.car.some_library;

// We don't own this class so we can't annotate it with @Inject
public class Wheels {

    private Rims rims;
    private Tires tires;

    public Wheels(Rims rims, Tires tires){
        this.rims = rims;
        this.tires = tires;
    }
}
