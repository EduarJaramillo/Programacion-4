
package proyecto3;

public class Revista extends Biblioteca {
    private int numero;

    public Revista(String codigo, String titulo, int publicacion, int numero) {
    super(codigo, titulo, publicacion);
    this.numero = numero;
    }

    public String toString() {
    return super.toString() + "Numero: " + numero;
    }
}
