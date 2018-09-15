
package proyecto3;

public class Libro extends Biblioteca implements Prestable {
    
    private boolean prestado;
    
    public Libro(String codigo, String titulo, int publicacion) {
        super(codigo, titulo, publicacion);
        prestado = false;
    }

    public void prestar() {
    prestado = true;      
    }

    public void devolver() {
    prestado = false;    
    }

    public boolean prestado() {
        return prestado;
    }
    
    public String toString() {
        return super.toString()+ "Libro [prestado=" + prestado + "]";
    }
    
}
