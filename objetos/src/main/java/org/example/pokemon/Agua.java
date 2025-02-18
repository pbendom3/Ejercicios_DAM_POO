package org.example.pokemon;

import org.example.equipos.Persona;

public class Agua extends Pokemon implements AtaquesAgua,CosasAgua{


    public Agua(int nivel, int ps) {
        super(nivel, ps);
    }

    @Override
    public void atacar() {
        System.out.println("PISTOLA AGUAAAAAAAAAAA, SQUERO SQUERO");
    }

    @Override
    public void hidroBomba() {
        System.out.println("BOOOOOM");
    }

    @Override
    public void surf() {
        System.out.println("COJO UNA OLAAAA");
    }

    @Override
    public void pistolaAgua() {
        System.out.println("FLUSH FLUSHHHH");
    }

    @Override
    public void salpicadura() {
        System.out.println("SALPICADURAAAAAA");
    }

    @Override
    public void aquagym() {

    }
}
