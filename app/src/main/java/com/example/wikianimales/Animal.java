package com.example.wikianimales;

public class Animal {

    private int animal; //foto del animal (le asignaremos el id del recurso)
    private String nombre;
    private String descripcion;

    public Animal(int animal, String nombre, String descripcion) {
        this.animal = animal;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getAnimal() {
        return animal;
    }

    public void setAnimal(int animal) {
        this.animal = animal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
