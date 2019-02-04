package com.coddinginflow.dagger2example.dagger;

import com.coddinginflow.dagger2example.ShaActivity;
import com.coddinginflow.dagger2example.dagger.module.DieselEngineModule;
import com.coddinginflow.dagger2example.dagger.module.WheelsModule;

import dagger.Component;

@Component (modules = {WheelsModule.class, DieselEngineModule.class})
public interface CarComponent {

//    Car getCar();

    void inject(ShaActivity shaActivity);
}
