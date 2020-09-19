
package selectionsorts;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
               Scanner input = new Scanner (System.in);
        System.out.println("Enter the size of array: ");
        int n  = input.nextInt();
        int []num = new int [n];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < num.length; i++) {
            num[i] = input.nextInt();
        }
        bubbleSort(num);
        System.out.println("Bubble sort of array: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }
       
    }
    public static void bubbleSort(int []b){
        int temp = 0;
        for (int i = 0; i < b.length-1; i++) {
            for (int j = 0; j < b.length-i-1; j++) {
                if(b[j] > b[j+1]){
                    temp = b[j];
                    b[j] = b[j+1];
                    b[j+1] = temp;
                }
            }
        }
    }
}
