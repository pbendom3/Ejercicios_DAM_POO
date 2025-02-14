package org.example.herencia_festival;

public class Concierto {
    public static void main(String[] args) {

        Asistente a1 = new Asistente("Carlos", 25, "VIP");
        Artista art1 = new Artista("Dua Lipa", 28, "Pop");

        System.out.println("Información del asistente:");
        a1.mostrarInfo();

        System.out.println();

        System.out.println("Información del artista:");
        art1.mostrarInfo();

        System.out.println();
        System.out.println("Información de la organizadora:");
        Organizador org = new Organizador("Vero",45,"Directora");
        org.mostrarInfo();

        Persona asistente = new Asistente("Pepe",30,"General");
        
        Persona[] personas = {
                new Asistente("Lucas", 18, "VIP"),
                new Artista("Sofía", 25, "Rock Alternativo"),
                new Organizador("Martín", 30, "Producción")
        };

        for (Persona p : personas) {
            p.mostrarInfo(); //se ejecuta la versión sobrescrita de cada subclase
        }

        Persona artista = new Artista("Sofía", 25, "Rock Alternativo");
        Persona asistente2 = new Asistente("Lucas", 18, "VIP");
        Persona organizador = new Organizador("Martín", 30, "Producción");

        //usamos el método con polimorfismo
        mostrarAcceso(artista);      //Accediendo como Artista: Preparando el show.
        mostrarAcceso(asistente2);    //Accediendo como Asistente: Buscando su asiento.
        mostrarAcceso(organizador);  //Accediendo como Organizador: Coordinando el evento.

    }



    public static void mostrarAcceso(Persona persona){
        persona.accederEvento();
    }

}
