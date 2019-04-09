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
public class Random {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numero = 0;
        int flag = 0;
        int adivina = new java.util.Random().nextInt(15);
        
        System.out.println("Introduce un numero el 1 al 15");
        
        do {
            numero = reader.nextInt();
            if(numero == adivina){
                System.out.println("!!!ADIVINASTE¡¡¡");
                flag = 1;
            }else{
                if(numero < adivina){
                    System.out.println("Es mayor al ingresado");
                }else{
                    System.out.println("Es menor al ingresado");
                }
            }
        }while(flag != 1);  
    }
    
}
