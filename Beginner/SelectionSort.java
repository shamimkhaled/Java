
package lab;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
          System.out.println("Enter the size of array: ");
          int n = input.nextInt();
          int []num = new int[n];
          System.out.println("Enter the elements of array: ");
          for (int i = 0; i < num.length; i++) {
            num[i] = input.nextInt();                  
             
        }
          Selection(num);
          System.out.println("Selection Sort: ");
           for (int i:num) {
                  System.out.print(i+" ");
              }
    }
    public static void Selection(int []b){
       
        for (int i = 0; i < b.length-1; i++) {
            int current_min = b[i];
            int current_min_index = i;
            for (int j = i+1; j < b.length; j++) {
                if(current_min>b[j]){
                    current_min = b[j];
                    current_min_index = j;
                }
            }
            if(current_min_index!=i){
                b[current_min_index] = b[i];
                b[i] = current_min;
            }
        }
    }
 
}
