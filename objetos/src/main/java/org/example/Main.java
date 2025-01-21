package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

       Paciente paciente_fit = new Paciente("Llados",40,'M', 130.10F, 1.70F);
       paciente_fit.mostrarInfoPaciente();
       Paciente paciente1 = new Paciente();
       paciente1.mostrarInfoPaciente();
       Paciente paciente2 =  new Paciente("Boix",18,'H');
       paciente2.mostrarInfoPaciente();



    }
}