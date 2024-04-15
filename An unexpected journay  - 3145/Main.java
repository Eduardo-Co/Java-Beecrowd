import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        int n;
        float x; 
        Scanner scanner = new Scanner(System.in);
        
        n = scanner.nextInt();
        x = scanner.nextFloat();
        scanner.close();
        
        calcularDias(n,x);
    }
    
    public static void calcularDias(int n, float x)
    {
        float dias;
        n = n+2;
        dias = x/n;
        System.out.printf("%.2f\n", dias); 
    }
    
}