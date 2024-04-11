/**
 * QUESTION: 
   The formula for calculating the area of ​​a circle is: area = π. radius2. Considering for this problem that π = 3.14159:

- Calculate the area, squaring the radius value and multiplying by π.

Prohibited
The input contains a floating point value (double precision), in this case, the variable radius.

Exit
Display the message "A=" followed by the value of the area variable, as per the example below, with 4 places after the decimal point. Use double precision variables. 
Like all problems, don't forget to print the end of line after the result, otherwise you will get "Presentation Error"
 */

import java.io.IOException;
import java.util.Scanner;
 

public class Main {
    

    
    public static void main(String[] args) throws IOException 
    {
    
        Scanner scanner = new Scanner(System.in);
        double raio = scanner.nextDouble();
        Calcular area = new Calcular();
        
        double resultado = area.calcularArea(raio);
        System.out.printf("A=%.4f\n", resultado);
          
        scanner.close();
    }
}

class Calcular
{
    private static double n = 3.14159;
    private double area;
    
    public double calcularArea(double raio){
    
        this.area = this.n * (raio*raio);    
    
        return this.area;
    }
    
}
