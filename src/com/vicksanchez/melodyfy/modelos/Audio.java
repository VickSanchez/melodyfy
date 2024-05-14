package com.vicksanchez.melodyfy.modelos;

public class Audio {

    private String titulo;
    private int duracionEnSegundos;
    private int totalReproducciones;
    private int totalMeGusta;
    private int clasificacion;

    public void darMegusta() {
        this.totalMeGusta++;
    }
    public void reproducir() {
        this.totalReproducciones++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracionEnSegundos() {
        return duracionEnSegundos;
    }

    public void setDuracionEnSegundos(int duracionEnSegundos) {
        this.duracionEnSegundos = duracionEnSegundos;
    }

    public int getTotalReproducciones() {
        return totalReproducciones;
    }

    public void setTotalReproducciones(int totalReproducciones) {
        this.totalReproducciones = totalReproducciones;
    }

    public int getTotalMeGusta() {
        return totalMeGusta;
    }

    public void setTotalMeGusta(int totalMeGusta) {
        this.totalMeGusta = totalMeGusta;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }
}
