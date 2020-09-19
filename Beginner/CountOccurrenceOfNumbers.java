
package midquestionsummar;

import java.util.Scanner;

public class CountOccurrenceOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = input.nextInt();
        int []num = new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<num.length;i++){
            num[i] = input.nextInt();
        }
        int count = 0;
        for(int j=0;j<100;j++){
            count = 0;
            for(int i=0;i<num.length;i++){
                if(num[i]==j){
                    count++;
                 
                }             
            }
            if(count>1){
                   System.out.println(j+" occurs "+count+" times");
            }
            else if(count!=0){
                 System.out.println(j+" occurs "+count+" times");
            }
        }
    }
}
