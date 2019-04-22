package com.example.marin.tripver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void goCrearCuenta(View view) {
        Intent intent = new Intent(this, CrearCuentaActivity.class);
        startActivity(intent);
    }

    public void goTripsActivity(View view) {
        Intent intentT = new Intent(this, TripsActivity.class);
        startActivity(intentT);
    }
}
