
package midquestionsummar;
import java.util.*;
public class BinarySearchReturnBoolean {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = input.nextInt();
        int []num = new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<num.length;i++){
            num[i] = input.nextInt();
        }
        Arrays.sort(num);
        System.out.println("Enter the element of array you want to Search: ");
        int search = input.nextInt();
        boolean result = BinarySearch(num, search);
        System.out.println(result);
    }
    public static boolean BinarySearch(int []b, int key){
        boolean found = false;
        int low = 0;
        int high = b.length-1;
        while(high>=low){
            int mid = (high+low)/2;
            if(key<b[mid]){
                high = mid-1;
            }
            else if(key==b[mid]){
                found = true;
                return found;
            }
            else{
                low = mid+1;
            }
        }
        return false;
    }
}
