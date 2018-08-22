package horas;

//Dado un numero de hora devolver sus semanas Dias y horas

public class horas {
    public static void main(String[] args) {
        
        float x=1000; // 5 semanas, 6 dias, 16 horas
        float sem,dia,hora;
        
        sem=x/168;
        dia=(sem-(int)sem)*7;
        hora=(dia-(int)dia)*24;
        
     
        System.out.print((int)sem);
        System.out.print(" semanas, ");
        System.out.print((int)dia);
        System.out.print(" dias, ");
        System.out.print((int)hora);
        System.out.print(" horas.");

        
        
        
        
    }    
}
