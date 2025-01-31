package org.example.casa;

public class AppCasa {

    public static void main(String[] args) {

        Casa casa = new Casa("Calle Mayor 123");
        System.out.println(casa);

        casa.agregarHabitacion("Dormitorio",40);
        casa.agregarHabitacion("Cocina",65);
        casa.agregarHabitacion("Baño",10);

        casa.mostrarHabitaciones();
        System.out.println(casa.getHabitacionMasGrande());

        casa.agregarHabitacion("Baño",20);
        casa.agregarHabitacion("Garaje",20);
        casa.mostrarHabitaciones();

        casa.eliminarHabitacion("Cocina");
        casa.mostrarHabitaciones();





    }
}
