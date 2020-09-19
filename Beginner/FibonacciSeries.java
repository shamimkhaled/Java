
package forloop;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int n,first=0,second=1,temp,c=0;
        System.out.print("Enter the positive number:");
        n = reader.nextInt();
        System.out.print("Fibonacci Series: ");
        System.out.print(first+" "+second);
        for(int i=3;i<=n;i++){
           
                temp = first+second;
                first = second;
                second = temp;
                System.out.print(" "+temp);
        }
        
        
    }
}
