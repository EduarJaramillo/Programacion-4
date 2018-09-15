

package Clases;


public class Pelicula extends Multimedia{
    public String actor;
    public String actriz;

    public Pelicula(){
        super();
    }

    public String getactor(){
        return actor;
    }

    public String getactriz(){
        return actriz;
    }

    public Pelicula(String titulo,String autor,Formato formato,int duracion,String actor,String actriz){
        super(titulo,autor,formato,duracion);
        this.actor = actor;
        this.actriz = actriz;
    }

    public String toString(){
        return "Titulo: "+titulo + 
                ", Autor: "+autor + 
                ", Formato: "+formato + 
                ", Duracion: "+duracion+
                " min." +
                ", Actor:" + actor +
                ", Actriz: " + actriz;
    }
}