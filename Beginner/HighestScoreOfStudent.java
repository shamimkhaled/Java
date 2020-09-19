
package forloops;

import java.util.*;
public class HighestScoreOfStudent {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          System.out.println("Enter the number of students: ");
          int num = input.nextInt();
         
          int max_score = 0;
          String max_name = "";
          for(int i=1;i<=num;i++){
              System.out.print("Enter no.0"+i+" Student Name and his Score: ");
              String name = input.next();
              int score = input.nextInt();
              if(max_score<score){
                  max_score = score;
                  max_name = name;
              }
              
          }
          System.out.println("Highest Score Student Name: "+max_name);
          System.out.println("Highest Score: "+max_score);
          
    }
  
}
