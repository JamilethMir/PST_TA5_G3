package com.example.amst3;

import android.graphics.drawable.Drawable;

public class Personaje {

    private String id;
    private String nombre;
    private String actor;
    private String descripcion;
    private String creador;
    private Drawable imagen;

    public Personaje(String id, String nombre, String actor, String descripcion, String creador, Drawable imagen) {
        this.id = id;
        this.nombre = nombre;
        this.actor = actor;
        this.descripcion = descripcion;
        this.creador = creador;
        this.imagen = imagen;

    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getActor() {
        return actor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getCreador() {
        return creador;
    }

    public Drawable getImagen() {
        return imagen;
    }
}
