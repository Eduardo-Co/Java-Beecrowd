import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
    Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno. 
    A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e a 
    nota C tem peso 5. 
    Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        
        Scanner scanner = new Scanner(System.in);
        Average average = new Average();
        float value1, value2, value3, result;
        
        value1 = scanner.nextFloat();
        value2 = scanner.nextFloat();
        value3 = scanner.nextFloat();
    
        result = average.calculateAverage(value1,value2,value3);
        
        System.out.printf("MEDIA = %.1f\n", result);
    }
 
}

class Average
{
    private float average;
    
    public float calculateAverage(float a, float b, float c)
    {
        this.average = (a*2 + b*3 + c*5)/10;
        return this.average;
    }
    
}