package com.example.marin.tripver;

public class Boleto {

    private String fotoPerfil;
    private String zona;
    private String ruta;
    private String lugares;

    public Boleto(String fotoPerfil, String zona, String ruta, String lugares) {
        this.fotoPerfil = fotoPerfil;
        this.zona = zona;
        this.ruta = ruta;
        this.lugares = lugares;
    }

    public String getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getLugares() {
        return lugares;
    }

    public void setLugares(String lugares) {
        this.lugares = lugares;
    }
}
