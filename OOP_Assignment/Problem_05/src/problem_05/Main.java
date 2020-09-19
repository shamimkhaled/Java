
package problem_05;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Location locate;
        System.out.println("Enter the numbers of row and column: ");
        int row = input.nextInt();
        int column = input.nextInt();
        System.out.println("Enter the element of array: ");
        double [][]arr = new double[row][column];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextDouble();
            }
        }
        
       locate = locateLargest(arr);
        System.out.println("Maximum Value: "+locate.maxValue);
        System.out.println("Maximum Value Index Number:( "+locate.row+","+locate.column+")");
        
    }
    public static Location locateLargest(double [][]b){
        Location locate = new Location();
        locate.maxValue = b[0][0];
        locate.row = -1;
        locate.column = -1;
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                if(locate.maxValue<b[i][j]){
                    locate.maxValue = b[i][j];
                    locate.row = i;
                    locate.column = j;
                }
            }     
        }
        return locate;
 }
}
