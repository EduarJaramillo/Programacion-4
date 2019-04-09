/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sesion_2;

/**
 *
 * @author Eduar
 */
public class Operaciones {
    public static void main(int[] args) {
        int suma= args[0] + args[1];
        int resta= args[0] - args[1];
        int multiplicacion= args[0]*args[1];
        int dividir= args[0] / args[1];
        int modulo= args[0] % args[1];

        System.out.println("Suma: " + suma );
        System.out.println("Resta: " + resta );
        System.out.println("Multiplicacion: " + multiplicacion );
        System.out.println("Division: " + dividir );
        System.out.println("Modulo: " + modulo);

    }
}
