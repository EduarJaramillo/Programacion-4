
package Clases;

public class Disco extends Multimedia{
    
    private String genero;
    
    public Disco(){
    }
    
    public Disco(String titulo,String autor){
        super(titulo,autor,null,0);
    }
    
    public Disco(String titulo, String autor, Formato formato, int duracion, String genero) {
        super(titulo, autor, formato, duracion);
        this.genero = genero;
    }  
    
    public String getgenero(){
        return genero;
    }
    
    public void setgenero(String genero){
        this.genero = genero;
    }
    
    public String toString() {
        return super.toString() + ", Genero: " + genero;
    }
}