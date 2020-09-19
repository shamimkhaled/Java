
package midquestionsummar;
import java.util.*;
public class ArrayAveragewithMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.println("Enter the size of array: ");
        int n = input.nextInt();
        int []num = new int[n];      
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < num.length; i++) {
             num[i]  = input.nextInt();          
        }
        
        System.out.println("The average is "+(Average(num)));
    }
    public static int Average(int []b){
        int sum = 0;
        for (int i = 0; i < b.length; i++) {
            sum = sum + b[i];
        }
        return (sum/b.length);
    }
    public static double Average(double []b){
        double sum = 0.0;
        for (int i = 0; i < b.length; i++) {
            sum = sum + b[i];
        }
        return (sum/b.length);
    }
}
