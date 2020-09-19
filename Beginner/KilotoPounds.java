
package forloops;

import java.util.Scanner;

public class KilotoPounds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = input.nextInt();
        int i;
        double pound = 2.2,pounds; 
        System.out.println("Kilo     Pounds");
        for( i=1;i<=n;i++){
            if(i%2==0){
                continue;
            }
             pounds = i*pound;
             System.out.println(" "+i+"       "+pounds);
        }
       
      
       
    }
}
