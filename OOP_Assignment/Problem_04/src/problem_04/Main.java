
package problem_04;

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
        
    }
}
