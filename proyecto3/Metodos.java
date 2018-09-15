
package proyecto3;

public class Metodos {
    public static int cuentaPrestados(Object[] lista) {
        int C = 0;
        
        for (Object obj : lista) {
            if (obj instanceof Prestable && ((Prestable) obj).prestado()) {
                C++;
            }
        }
        return C;
    }
    
     public static int publicacionesAnterioresA(Biblioteca[] lista, int AñoPublicacion) {
        int C = 0;
        for (Biblioteca p : lista) {
            if (p.getPublicacion() < AñoPublicacion) {
                C++;
            }
        }
        return C;
    }
    
}

