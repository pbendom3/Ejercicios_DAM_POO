package org.example.equipos;

import java.util.ArrayList;

public class Equipo {

    private String nombre;
    private ArrayList<Persona> componentes;

    public Equipo(String nombre){
        this.nombre=nombre;
        componentes=new ArrayList<>();
    }

    public void anyadirComponente(Persona persona){
        componentes.add(persona);
        System.out.println(componentes);
    }

    public void eliminarComponente(Persona persona){
        componentes.remove(persona);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Persona> getComponentes() {
        return componentes;
    }

    public void setComponentes(ArrayList<Persona> componentes) {
        this.componentes = componentes;
    }

    @Override
    public String toString(){
        return "Equipo : [ nombre=" + getNombre() + " componentes=" + getComponentes() + " ]";
    }


}
