package org.example;

import org.example.biblioteca.Editorial;
import org.example.biblioteca.Estudiante;
import org.example.biblioteca.Libro;
import org.example.biblioteca.Prestamo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

//Estudiante estudiante1 = new Estudiante("Pepe");
//Estudiante estudiante2 = new Estudiante("Pepa","1ºESO","prueba@noseque");
//
//        System.out.println(estudiante1);
//        System.out.println(estudiante2);
//        System.out.println(Estudiante.contadorEstudiantes);
//        System.out.println(Estudiante.obtenerTotalEstudiantes());

        Estudiante estudiante1 = new Estudiante("Manuel","2ºASIR","noseque@alu.edu.gva.es");

        Editorial editorial = new Editorial("Freelance","España");
        System.out.println(editorial);
        Libro libro1 = new Libro("La novia de Pol","Laura P.",editorial);
        System.out.println(editorial);
        Libro libro2 = new Libro("La novia de Pol segunda saga","Laura P.",editorial);
        System.out.println(editorial);

        System.out.println(libro1);
        System.out.println(libro2);
        Prestamo prestamo1 = libro1.prestar(estudiante1);
        System.out.println(libro1);
        System.out.println(estudiante1);

        Prestamo prestamo2 = libro2.prestar(estudiante1);
        System.out.println(estudiante1);


        System.out.println(Libro.getLibrosDisponibles());
        libro1.devolver(estudiante1);
        System.out.println(libro1);
        System.out.println(estudiante1);

        System.out.println(Libro.getLibrosDisponibles());
        libro1.devolver(estudiante1);
        libro2.devolver(estudiante1);
        System.out.println(estudiante1);


    }


}