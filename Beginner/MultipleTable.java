
package factors;

import java.util.Scanner;

public class MultipleTable {
    public static void main(String args[]){
        Scanner input =  new Scanner(System.in);
       
        for(int i=1;i<=10;i++){
            if(i%3==0){
                continue;
            }
            for(int j=1;j<=4;j++){
              System.out.println(" "+i+"^"+j+" = "+(int)Math.pow(i, j));
              
            }
            System.out.println();
        }
        
    }
    
}
