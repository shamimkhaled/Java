
package midquestionsummar;
import java.util.*;
public class LinearSearch {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.print("Enter array length: ");
       int n = input.nextInt();
       int [] num = new int[n];
       System.out.println("array elements: ");
       for(int i=0;i<num.length;i++){
           num[i] = input.nextInt();
       }
       System.out.println("Searching Elements: ");
       int check = input.nextInt();
       boolean result = Linearsearch(num,check);
       System.out.println("Result: "+result);
    }
    public static boolean Linearsearch(int []b, int key){
        int position = 0;
        boolean found = false;
        for(int i=0;i<b.length;i++){
            if(key==b[i]){
                found = true;
                return found;
               
            }
            
        }
        return false;
    } 
}
