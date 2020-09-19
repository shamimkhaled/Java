
package problem_08;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date d1 = new Date();
        Account a1 = new Account("Khaled", 181, 1000, 1.5, d1);
        a1.getDeposit(30);
        a1.getDeposit(40);
        a1.getDeposit(50);
        a1.getWithdraw(5);
        a1.getWithdraw(4);
        a1.getWithdraw(2);
        System.out.println("Account Name: "+a1.getName());
        System.out.println("Account Id: "+a1.getId());
        System.out.println("Account Balance: "+a1.getBalance());
        System.out.println("Interest: "+a1.getAnnualInterestRate());       
        System.out.println("Date: "+a1.getDate());
        System.out.println("ArrayList Info: ");
        for (int i = 0; i < a1.getTransaction().size(); i++) {
            System.out.println("Date: "+a1.getTransaction().get(i).getDate());
            System.out.println("Type: "+a1.getTransaction().get(i).getType());
            System.out.println("Amount: "+a1.getTransaction().get(i).getAmount());
            System.out.println("Balance: "+a1.getTransaction().get(i).getBalance());
            System.out.println("Description: "+a1.getTransaction().get(i).getDescription());
        }
    }
}
