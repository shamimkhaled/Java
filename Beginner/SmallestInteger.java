
package forloops;

import java.util.Scanner;

public class SmallestInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //System.out.print("Enter any number: ");
        //int num = input.nextInt();
        int i = 1;
        while(Math.pow(i,2)>12000){
            i++;
        }
        System.out.println("Smallest integer: "+i);
    }
}
