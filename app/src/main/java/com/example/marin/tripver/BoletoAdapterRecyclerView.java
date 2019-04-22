package com.example.marin.tripver;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.widget.RecyclerView;
import android.transition.Explode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class BoletoAdapterRecyclerView extends RecyclerView.Adapter<BoletoAdapterRecyclerView.BoletoViewHolder>{

    private ArrayList<Boleto> boletos;
    private int resource;
    private Activity activity;

    public BoletoAdapterRecyclerView(ArrayList<Boleto> boletos, int resource, Activity activity) {
        this.boletos = boletos;
        this.resource = resource;
        this.activity = activity;
    }

    @Override
    public BoletoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(resource, parent, false);
        return new BoletoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(BoletoViewHolder holder, int position) {
        Boleto boleto = boletos.get(position);
        holder.zona.setText(boleto.getZona());
        holder.ruta.setText(boleto.getRuta());
        holder.lugares.setText(boleto.getLugares());

        holder.fotoPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity, PerfilActivity.class);
                activity.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return boletos.size();
    }

    public class BoletoViewHolder extends RecyclerView.ViewHolder {

        private ImageView fotoPerfil;
        private TextView zona;
        private TextView ruta;
        private TextView lugares;

        public BoletoViewHolder(View itemView) {
            super(itemView);

            fotoPerfil = (ImageView) itemView.findViewById(R.id.fotoPerfil);
            zona = (TextView) itemView.findViewById(R.id.zona);
            ruta = (TextView) itemView.findViewById(R.id.ruta);
            lugares = (TextView) itemView.findViewById(R.id.lugares);
        }
    }
}
