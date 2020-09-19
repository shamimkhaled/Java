
package inhiretence;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account a1 = new Account(1001, 93500);
        System.out.println("Account Info: ");
        int no = input.nextInt();
        double bal = input.nextDouble();
        Account a2 = new Account(no, bal);
        
        System.out.println("Client Info: ");
        int id = input.nextInt();
        String name = input.next();
        String address = input.next();
        Client c1 =  new Client(id, name, address);
        System.out.println(c1.toString());
        System.out.println(c1.toStrings());
        
        
        c1.addAccount(a1);
        System.out.print(" ");
        c1.addAccount(a2);
        System.out.print(c1.toStrings());
    }
}
