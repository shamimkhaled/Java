
package forloops;

import java.util.Scanner;

public class LargestInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        while(Math.pow(i+1,3)<12000){
            i++;
        }
        System.out.println("Largest Integer: "+i);
    }
}
