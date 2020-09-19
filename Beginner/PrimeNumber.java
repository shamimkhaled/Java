
package factors;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num = input.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();
        int count = 0,i,j;
        
        for(i=num;i<=num2;i++){
            for(j=2;j<=i-1;j++){
                if(i%j==0){
                    count++;
                    break;
                }
            }
          if(count==0){
              System.out.print(" "+i);
          }
           count=0;
         
    }
    
}
}
