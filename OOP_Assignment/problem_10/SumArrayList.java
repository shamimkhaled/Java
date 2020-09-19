
package problem_10;
import java.util.ArrayList;

public class SumArrayList {
    public static void main(String[] args) {
        
        ArrayList<Double> number = new ArrayList<>();
        number.add(7.0);
        number.add(2.1);
        number.add(12.1);
        number.add(4.0);
        number.add(9.9);
        double sum = 0.0;
        for(double i : number){
            sum = sum + i;
        }
        System.out.println("Summation of ArraList: "+sum);
    }  
}
