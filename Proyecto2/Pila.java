
package Clases;

public class Pila implements ColeccionInterfaz {
    
    private Object[] array;
    
    private int x;
    
    public Pila(int tamaño) {
        array = new Object[tamaño];
        x = 0;
}

    public boolean estaVacia() {
        return x == 0;        
    }

    
    public Object extraer() {
        if(estaVacia()){
            return ("El elemento no existe");
        }else{
            return array[-x];
        }
    }
    
    
    public Object primero() {
        if (estaVacia()) {
            return ("El elemento no existe");
        }else{
           return array[x-1];
        }
    }
    
    
    public boolean añadir(Object objeto) {
        if (x == array.length) {
            return false;
        }else{
            array[x] = objeto;
            x++;
            return true;
        }
    }
    
    
    public String toString() {
        String s ="";
        
        for (int i = x-1; i >= 0;i--) {
        s += array[i].toString();
        }      
        return s;
    }  
}
