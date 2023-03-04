import javax.swing.JOptionPane;

import java.util.Scanner;
public class Ejercicio {
    public static void main(String[] args) {
               
        Scanner entrada = new Scanner(System.in);
        int numero;

        String texto;

        System.out.println("Introduzca su peso(kg): ");
        numero = entrada.nextInt();

        texto = (numero > 80) ? "Es usted obeso" : (numero > 45 && numero < 80 ) ? "Su peso es normal" : "Es usted delgado";

        System.out.println(texto);
    }
    
}
