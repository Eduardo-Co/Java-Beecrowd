import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
   *Read a value of floating point with two decimal places. 
   * This represents a monetary value. After this, calculate the smallest possible number of notes 
   * and coins on which the value can be decomposed. 
   * The considered notes are of 100, 50, 20, 10, 5, 2. The possible coins are of 1, 0.50, 0.25, 0.10, 0.05 and 0.01. 
   * Print the message “NOTAS:” followed by the list of notes and the message “MOEDAS:” followed by the list of coins.

Input
 */
public class Main {
    public static void main(String[] args) throws IOException {
        
        Scanner scanner = new Scanner(System.in);
        Calculate calculate = new Calculate();
        float value;
        value = scanner.nextFloat();
       
        calculate.calculateNotas(value);
        
    }
 
}

class Calculate
{
    private int notas; 
    
    public void calculateNotas(float value)
    {
        value = value * 100;
        int notas[] = {10000,5000,2000,1000,500,200};
        float moedas[] = {100,50,25,10,5,1};
        
        System.out.print("NOTAS:\n");
        for(int i = 0; i<6; i++)
        {
            this.notas = (int)(value/notas[i]);
            value %= notas[i];
            System.out.printf("%d nota(s) de R$ %.2f\n", this.notas, (double) notas[i]/100);
        }
        System.out.print("MOEDAS:\n");
        for(int i = 0; i<6; i++)
        {
            this.notas = (int)(value/moedas[i]);
            value %= moedas[i];
            System.out.printf("%d moeda(s) de R$ %.2f\n", this.notas, (double) moedas[i]/100);
        }
    }
    
  
}