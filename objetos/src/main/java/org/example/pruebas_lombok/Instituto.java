package org.example.pruebas_lombok;

import lombok.*;

import java.util.Objects;
@AllArgsConstructor
@Data
public class Instituto {

    @NonNull
    private String nombre;
    private final String poblacion;
    private String direccion;

//    public Instituto(String nombre){
//
//        this.nombre = Objects.requireNonNull(nombre);
////        if(nombre==null){
////            System.out.println("El nombre no puede ser nulo");
////        }else{
////            this.nombre=nombre;
////        }
//
//    }

}
