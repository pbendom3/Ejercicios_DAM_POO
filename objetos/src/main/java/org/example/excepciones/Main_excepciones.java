package org.example.excepciones;

public class Main_excepciones {

    public static void main(String[] args) throws NivelValidoException {

        int nivel = 150;

            if (nivel>100 && nivel < 0){
                throw new NivelValidoException();
            }




    }
}
