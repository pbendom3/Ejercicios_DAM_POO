package org.example.prueba_enums;

public enum Semaforo {

    ROJO,VERDE,AMARILLO;

    public Semaforo siguiente(Semaforo actual){

        switch (actual){
            case ROJO:
                return Semaforo.VERDE;
            case VERDE:
                return Semaforo.AMARILLO;
            case AMARILLO:
                return Semaforo.ROJO;
            default:
                return Semaforo.ROJO;
        }

    }


}
