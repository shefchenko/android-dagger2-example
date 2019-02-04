package com.coddinginflow.dagger2example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.coddinginflow.dagger2example.car.Car;
import com.coddinginflow.dagger2example.dagger.CarComponent;
import com.coddinginflow.dagger2example.dagger.DaggerCarComponent;
import com.mindorks.example.android_dagger2_example.R;

import javax.inject.Inject;

public class ShaActivity extends AppCompatActivity {

    @Inject public Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_sha);

//        String userName = dataManager.getUser(1L).getName();
//        TextView tvUserName = (TextView) findViewById(R.id.tvUserName);
//        tvUserName.setText(userName);

        CarComponent component = DaggerCarComponent.create();
        component.inject(this);

        car.drive();

    }
}
