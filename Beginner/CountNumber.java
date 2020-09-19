
package forloops;

import java.util.Scanner;

public class CountNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = input.nextInt();
        int positive=0, negative=0, total=0, zero=0, sum=0;;
        int [] num = new int[n];
        
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++){
            num[i] = input.nextInt();
        }
        for(int i=0;i<n;i++){
            total++;
            
            sum = sum+num[i];
           
        }
         double avg = (double)sum/n;
        
        for(int i=0;i<n;i++){
           if(num[i]>0){
               positive++;
           } 
           else if(num[i]<0){
               negative++;
           }
           else if(num[i]==0){
               zero++;
           }
        }
        System.out.println("Positive Number: "+positive);
        System.out.println("Negative Number: "+negative);
        System.out.println("Zero: "+zero);
        System.out.println("Total Number: "+total);
        System.out.println("Average: "+avg);
        
    }
    
}
