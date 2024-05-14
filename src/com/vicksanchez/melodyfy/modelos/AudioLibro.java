package com.vicksanchez.melodyfy.modelos;

public class AudioLibro extends Audio{

    private String editorial;
    private String autor;

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
