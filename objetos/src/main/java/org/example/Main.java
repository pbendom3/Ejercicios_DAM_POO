package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Persona persona1 = new Persona("Pepe", "Sánchez", "12345678A", 80, 30);
        Persona persona2 = new Persona();

        persona1.imprimirInfoPersona();
        persona2.imprimirInfoPersona();
        System.out.println(persona1.concatenar());

        System.out.println("Antes:" + persona1.getNombre());
        persona1.setNombre("Pepa");
        System.out.println("Después:" + persona1.getNombre());
        persona1.setNombre("messi");
        System.out.println("Madrit:" + persona1.getNombre());

    }
}