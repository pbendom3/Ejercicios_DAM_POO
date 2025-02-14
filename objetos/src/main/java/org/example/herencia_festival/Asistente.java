package org.example.herencia_festival;

class Asistente extends Persona {
    protected String entrada; //tipo de entrada (General, VIP, etc.)

    public Asistente(String nombre, int edad, String entrada) {
        super(nombre, edad); //llamamos al constructor de la clase Persona
        this.entrada = entrada;
    }

    public void mostrarInfo() {
        super.mostrarInfo(); //llamamos al método de la clase Persona
        System.out.println("Tipo de entrada: " + entrada);
    }

    public void prueba(){

    }

    public void accederEvento(){
        System.out.println("Accediendo como Asistente: Buscando asiento.");
    }



}