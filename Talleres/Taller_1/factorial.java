package factorial;

//factorial

public class factorial {
    public static void main(String[] args) {
        
    int n=6;
    int aux=1;
    for(int i=n;i>1;i--){
        aux*=i;
    }
    System.out.println(aux);
    }
}