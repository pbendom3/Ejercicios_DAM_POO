package org.example;

public class Libro {

    private static int cantidadLibros = 0;
    private static int librosDisponibles =0;
    final static String LIB = "LIB";

    private String titulo;
    private String autor;
    private String id;
    private boolean disponible;

    public Libro (String titulo, String autor){
        this.titulo=titulo;
        this.autor=autor;
        cantidadLibros++;
        librosDisponibles++;
        id=LIB+calcularId(cantidadLibros);
        disponible=true;
    }

    public String calcularId(int cantidadLibros){

//        if(cantidadLibros<10) {
//            return "00"+cantidadLibros++;
//        } else if(cantidadLibros<100) {
//            return "0"+cantidadLibros++;
//        } else {
//            return ""+cantidadLibros++;
//        }

        return String.format("%03d",cantidadLibros);

    }

    public void prestar(){

        if(disponible){
            disponible=false;
            System.out.println("El libro " + getTitulo() +  " ha sido prestado con éxito.");
            librosDisponibles--;
        }else{
            System.out.println("El libro " + getTitulo() + " no se puede prestar (no disponible).");
        }

    }

    public void devolver(){

        if(!disponible){
            disponible=true;
            System.out.println("El libro " + getTitulo() +  " ha sido devuelto con éxito.");
            librosDisponibles++;
        }else{
            System.out.println("El libro " + getTitulo() + " no se puede devolver (está disponible).");
        }

    }

    public static int getCantidadLibros() {
        return cantidadLibros;
    }

    public static int getLibrosDisponibles() {
        return librosDisponibles;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getId() {
        return id;
    }

    public boolean getDisponible() {
        return disponible;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString(){
        return "Libro : [ titulo=" + getTitulo() + " autor=" + getAutor() + " id=" + getId() + " disponible=" + getDisponible() + " ]";
    }






}
