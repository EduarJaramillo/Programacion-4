package raiz;

//raiz

public class raiz {
    public static void main(String[] args) {
        
        double a = 1;
        double b = -3;
        double c = 2;
        
        double x1 = ((-1*b)+ Math.sqrt((b*b)-4*a*c))/(2*a);
        double x2 = ((-1*b)- Math.sqrt((b*b)-4*a*c))/(2*a);
        
        System.out.print("Raiz 1 = ");
        System.out.println(x1);
        System.out.print("Raiz 2 = ");
        System.out.println(x2);
    }
}