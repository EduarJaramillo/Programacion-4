
package Clases;


public class Multimedia {
        
    public enum Formato{
        wav, mp3, midi, avi, mov, mpg, cdAudio, dvd
    }

    public String titulo;
    public String autor;
    public Formato formato;
    public double duracion;
    
    public String toString(){
        return "Titulo: "+titulo + ", Autor: "+autor + ", Formato: "+formato + ", Duracion: "+duracion+" min.";
    }

    public Multimedia() {
    }
    
    public Multimedia(String titulo, String autor, Formato formato, double duracion) {

        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Formato getFormato() {
        return formato;
    }

    public void setFormato(Formato formato) {
        this.formato = formato;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }   

    public boolean equals(Multimedia media) {
        return titulo.equals(media.getTitulo()) && autor.equals(media.getAutor());
    }

    public static void main(String [] args){
        
        Multimedia multiejem= new Multimedia("Titanic","James Cameron",Formato.mp3,90); 

        Pelicula peliejem= new Pelicula("Titanic","James Cameron",Formato.mp3,90,"Leonardo di Caprio","Kate Winslet");
        
        

        System.out.println(multiejem);          //Punto B
        if(peliejem.getactriz().length() <= 1 && peliejem.getactor().length() <= 1){ 
            System.out.println("Debe haber al menos un actor principal.");
        }else{
            System.out.println(peliejem);
        }
        
        System.out.println("");
        
        
        
        ListaMultimedia lista1 = new ListaMultimedia(3);     //Punto B
        lista1.add(peliejem);                                //Añade un objeto tipo pelicula              
        lista1.add(multiejem);                                
        System.out.println(lista1.toString());               //Retorna el contenido de toda la lista     
        System.out.println(lista1.size());                   //Retorna el tamaño de la lista de objetos
        
        
        System.out.println("");
        
        ListaMultimedia Numeral_D = new ListaMultimedia(10);        
        Numeral_D.add(new Pelicula("Lucy","Alguien",Formato.avi,150,"","Scarlett Johansson"));
        Numeral_D.add(new Pelicula("La Monja","Corin Hardy",Formato.wav,100,"Randy Edelman","Taissa Farmiga"));
        Numeral_D.add(new Pelicula("The Others","Alejandro Amenábar",Formato.avi,250,"Randy Edelman","‎Nicole Kidman"));
        System.out.println(Numeral_D.toString());                   
        
        System.out.println("");
        
        Disco Gente = new Disco("Gente","Juanes",Formato.mp3,50,"Pop");      //Punto E
        System.out.println(Gente.toString());                                  
        
        System.out.println("");
        
        ListaMultimedia Medialist = new ListaMultimedia(20);                           //Punto F
        Medialist.add(new Disco("Bohemian Rhapsody","Queen",Formato.mp3,3,"Rock"));    
        Medialist.add(new Disco("Muerte en Hawaii","Calle 13",Formato.mp3,4,"Rap"));   
        Medialist.add(new Disco("Flaca","Andres Calamaro",Formato.cdAudio,4,"Pop"));
        System.out.println(Medialist.toString());                                      
        Medialist.add(new Disco("Andres","Queen"));                                     
        System.out.println(Medialist.toString());                                      
    }
}