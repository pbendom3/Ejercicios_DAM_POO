package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

Estudiante estudiante1 = new Estudiante("Pepe");
Estudiante estudiante2 = new Estudiante("Pepa","1ºESO","prueba@noseque");

        System.out.println(estudiante1);
        System.out.println(estudiante2);
        System.out.println(Estudiante.contadorEstudiantes);
        System.out.println(Estudiante.obtenerTotalEstudiantes());


    }


}