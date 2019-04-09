/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sesion_2;
import java.util.Scanner;

/**
 *
 * @author Eduar
 */
public class Scan {
    public static void main(String[] args) {

        String Palabra_1 = "";
        String Palabra_2 = "";
        String Palabra_3 = "";
        Scanner scanIn = new Scanner(System.in);
        System.out.print("Ingrese primer palabra: ");
        Palabra_1 = scanIn.nextLine ();
        System.out.print("Ingrese segunda palabra: ");
        Palabra_2 = scanIn.nextLine ();
        System.out.print("Ingrese tercer palabra: ");
        Palabra_3 = scanIn.nextLine ();

        System.out.println(Palabra_1 + " " + Palabra_2+ " " + Palabra_3);
    }
}
