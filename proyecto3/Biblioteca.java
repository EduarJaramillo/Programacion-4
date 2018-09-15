
package proyecto3;

public class Biblioteca {

    private String codigo;
    private String titulo;
    private int AñodePublicacion;

    public Biblioteca(String codigo, String titulo, int añodepublicacion) {

    this.codigo = codigo;
    this.titulo = titulo;
    this.AñodePublicacion = añodepublicacion;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
     public int getPublicacion() {
        return AñodePublicacion;
    }

    public void setPublicacion(int añodepublicacion) {
        this.AñodePublicacion = añodepublicacion;
    }
    @Override
    public String toString() {
        return "Publicacion {codigo=" + codigo + ", titulo=" + titulo + ", año de publicacion=" + AñodePublicacion + "}";
    }
    
    public static void main(String[] args) {
        Biblioteca[] PasilloA = { 
                new Libro("AAA", "Don Quijote",1959),
                new Revista("ABC", "Motor",1998,1234), 
                new Libro("DFR", "Diario de Ana Frank",1999),
                new Revista("RRR","Semana",1989,12345) 
        };
        
        Libro Nuevo = (Libro) PasilloA[0];
        Nuevo.prestar();
        
        for (Biblioteca p : PasilloA) {
            System.out.println(p);
        }
        
        System.out.println(Metodos.publicacionesAnterioresA(PasilloA,1990));
        System.out.println(Metodos.cuentaPrestados(PasilloA));
    }
    
}
