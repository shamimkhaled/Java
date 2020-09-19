
package midquestionsummar;

import java.util.*;

public class ArrayEqualZeroReturnTrue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = input.nextInt();
        int num [] = new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<num.length;i++){
            num[i] = input.nextInt();
        }
        boolean result = FindingZero(num);
        System.out.println(result);
        
    }
    public static boolean FindingZero(int []b){
        boolean found = false;
        for(int i=0;i<b.length;i++){
            if(b[i]<=0){
                found = true;
                return true;
            }
        }
        return false;
    }
}
