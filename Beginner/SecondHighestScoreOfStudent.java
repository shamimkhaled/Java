
package forloops;
import java.util.*;
public class SecondHighestScoreOfStudent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of student: ");
        int num = input.nextInt();
        int max = 0;
        int second_max = 0;
        String second_max_name = "" ;
        String max_name = "" ;
        for(int i=1;i<=num;i++){
            System.out.println("Enter no."+i+" Student Name and his Score: ");
            String name = input.next();
            int score = input.nextInt();
            if(score>max){
                max = score;
                max_name = name;
            }
            else if(score>second_max){
                second_max = score;
                second_max_name = name;
            }
        }
        
          System.out.println("Highest Score Student Name: "+max_name);
          System.out.println("Highest Score: "+max);
          System.out.println(" 2nd Highest Score Student Name: "+second_max_name);
          System.out.println(" 2nd Highest Score: "+second_max);
    }
}
