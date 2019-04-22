package com.example.marin.tripver;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

public class TripsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trips);
        showToolbar(getResources().getString(R.string.toolbar_trips), false);

        RecyclerView tripsRecycler = (RecyclerView) findViewById(R.id.tripsRecycler);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        tripsRecycler.setLayoutManager(linearLayoutManager);

        BoletoAdapterRecyclerView boletoAdapterRecyclerView = new BoletoAdapterRecyclerView(buildBoletos(), R.layout.cardview_trip, this);
        tripsRecycler.setAdapter(boletoAdapterRecyclerView);
    }

    public ArrayList<Boleto> buildBoletos() {
        ArrayList<Boleto> boletos = new ArrayList<>();
        boletos.add(new Boleto("", "ZONA NORTE", getResources().getString(R.string.lorem), "4"));
        boletos.add(new Boleto("", "ZONA SUR", getResources().getString(R.string.lorem), "3"));
        boletos.add(new Boleto("", "ZONA ESTE", getResources().getString(R.string.lorem), "2"));
        boletos.add(new Boleto("", "ZONA OESTE", getResources().getString(R.string.lorem), "1"));
        boletos.add(new Boleto("", "ZONA CENTRO", getResources().getString(R.string.lorem), "0"));
        boletos.add(new Boleto("", "BOCA DEL RIO", getResources().getString(R.string.lorem), "44"));
        boletos.add(new Boleto("", "TAMSA", getResources().getString(R.string.lorem), "5"));
        return boletos;
    }

    public void showToolbar(String tittle, boolean upButton) {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(tittle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }
}
