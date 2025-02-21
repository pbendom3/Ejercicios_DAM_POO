package org.example.prueba_enums;

import java.util.Arrays;
import java.util.Scanner;

public class AppPelis {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        SagasPelis peli = SagasPelis.SHREK;
        System.out.println(peli);

        for (SagasPelis pelis : SagasPelis.values()){
            System.out.println("Peli: " + pelis + " con " + pelis.getNro_pelis() + " pelis en total");
        }

        System.out.println("Introduce una saga " + Arrays.toString(SagasPelis.values()));
        String saga = teclado.next();
        SagasPelis saga_enum = SagasPelis.valueOf(saga);
        System.out.println("La saga escogida es " + saga_enum + " con " + saga_enum.getNro_pelis() + " películas.");

        //ordinal
        int posicion = saga_enum.ordinal();
        System.out.println("La saga consultada está en la posición " + posicion);
        //name
        String saga_string = SagasPelis.CREPUSCULO.name();
        System.out.println(saga_string);

    }
}
