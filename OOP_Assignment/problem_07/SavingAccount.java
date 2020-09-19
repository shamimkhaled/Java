
package problem_07;

import java.util.Date;

public class SavingAccount extends Account{
    
    SavingAccount(){
        super();
    }
    SavingAccount(int accountId, double accountBalance, double annualInterestRate, Date dateCreated){
        super(accountId, accountBalance, annualInterestRate, dateCreated );
    }
    public double getWithdraw(double amount){
        if(amount < this.getAccountBalance()){
            return this.getAccountBalance() - amount;
        }else{
            return 0;
        }
    }
    public double getDeposit(double amount){
       return this.getAccountBalance() + amount;   
    }


}
