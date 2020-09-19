
package problem_07;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date d1 = new Date();
        
        Account a1 = new Account(181597,93500,4.5,d1);
        a1.getWithdraw(18000);
        a1.getDeposit(12000);
        System.out.println("Account Id: "+a1.getAccountId());
        System.out.println("Account Balance:$ "+a1.getAccountBalance());
        System.out.println("Monthly Interest:$ "+a1.getMonthlyInterest());
        System.out.println("Date: "+d1);
        SavingAccount sa1 = new  SavingAccount(173, 70000, 6, d1);
        sa1.getWithdraw(5000);
        sa1.getDeposit(3700);
        System.out.println(sa1.toString());
        CheckingAccount ca1 = new CheckingAccount(172, 84000, 5, d1, -15);
        ca1.getWithdraw(3000);
        ca1.getDeposit(4700);
        System.out.println(ca1.toString());
    }
}
