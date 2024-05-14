package com.vicksanchez.melodyfy.principal;

import com.vicksanchez.melodyfy.modelos.Cancion;
import com.vicksanchez.melodyfy.modelos.MisFavoritos;
import com.vicksanchez.melodyfy.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {

        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Viernes de Webeo");
        miCancion.setArtista("Panteon Rococo");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("La Cotorrisa");
        miPodcast.setDescripcion("Comedia hilarante");
        miPodcast.setTitulo("5° Aniversario");

        for (int i = 0; i < 100; i++) {
            miCancion.darMegusta();
        }

        for (int i = 0; i < 2000; i++) {
            miCancion.reproducir();
        }

        for (int i = 0; i < 100; i++) {
            miPodcast.darMegusta();
        }

        for (int i = 0; i < 8000; i++) {
            miPodcast.reproducir();
        }

        System.out.println("Reproducciones de Canción "+ miCancion.getTitulo() + " = " + miCancion.getTotalReproducciones());
        System.out.println(miCancion.getTotalMeGusta() + " Me Gusta");

        System.out.println("Reproducciones de Podcast "+ miPodcast.getTitulo() + " = " + miPodcast.getTotalReproducciones());
        System.out.println(miPodcast.getTotalMeGusta() + " Me Gusta");

        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adiciona(miCancion);
        favoritos.adiciona(miPodcast);


    }
}
