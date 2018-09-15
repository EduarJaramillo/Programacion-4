
package Clases;

import java.util.LinkedList;

public class Cola implements ColeccionInterfaz {
    
    private LinkedList lista;

    public Cola(){
        lista = new LinkedList();
    }

    
    public boolean estaVacia(){
        return lista.isEmpty();
    }
    
    
    public boolean añadir(Object Lista) {
        lista.addLast(Lista);
        return true;
    }

    
    public Object primero() {
        return lista.getFirst();
    }
    
    
    public Object extraer() {
        return lista.removeFirst();
    }
}