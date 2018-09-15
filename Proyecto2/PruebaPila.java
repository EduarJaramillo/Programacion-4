
package Clases;

public class PruebaPila{

    public static void llenar(ColeccionInterfaz Nuevo){
        for(int i=0;i<=10;i++){
            Nuevo.añadir(i);
        }
    }
    
    public static void imprimirYVaciar(ColeccionInterfaz coleccion) {
        while (!coleccion.estaVacia()) {
            System.out.println(coleccion.extraer());
        }
    }
    
    
    public static void main(String[] args) {
        Pila p1 = new Pila(10);
        llenar(p1);
        System.out.println("La pila: " + p1);
        imprimirYVaciar(p1);
        System.out.println("Ahora la pila es: " + p1);
    }
}
