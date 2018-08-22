package primo;

//verificar si un numero es primo

public class primo {
    public static void main(String[] args) {
        
        int flag=1;
        int x=2;
        int i=2;
        
        while(flag==1 && i<x){
            if(x%i==0){
                flag=0; 
                
            }else{
                i++;
            }
        }
        if(flag==1){
            System.out.println("Primo");
        }else{
            System.out.println("No primo");
        }
    }
}
