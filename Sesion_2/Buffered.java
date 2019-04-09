/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sesion_2;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author Eduar
 */
public class Buffered {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        String Palabra_1 = "";
        System.out.println("Ingrese la primer palabra: ");

        try {
            Palabra_1 = dataIn.readLine ();
        } catch (IOException e) {
            System.out.println ("Error al obtener la entrada");
        }

        String Palabra_2= "";
        System.out.println("Ingrese la segunda palabra: ");

        try {
            Palabra_2 = dataIn.readLine ();
        } catch (IOException e) {
            System.out.println ("Error al obtener la entrada");
        }

        String Palabra_3= "";
        System.out.println("Ingrese la tercer palabra: ");

        try {
            Palabra_3 = dataIn.readLine ();
        } catch (IOException e) {
            System.out.println ("Error al obtener la entrada");
        }

        System.out.println(Palabra_1 + " " + Palabra_2+ " " + Palabra_3);
    }
}
