
package problem_07;

import java.util.Date;

public class CheckingAccount extends Account{
    private int overdraftLimit;
    CheckingAccount(){
        super();
    }
    CheckingAccount(int accountId, double accountBalance, double annualInterestRate, Date dateCreated, int overdraftLimit){
        super(accountId, accountBalance, annualInterestRate, dateCreated);
        this.overdraftLimit = overdraftLimit;
    }

    public void setOverdraftLimit(){
        this.overdraftLimit = overdraftLimit;
    }
    public int getOverdraftLimit(){
        return this.overdraftLimit;
    }
    public double getWithdraw(double amount){
        if(amount < this.getAccountBalance() - amount){
            return this.getAccountBalance() - amount;
        }else{
            return 0;
        }
    }
    public double getDeposit(double amount){
       return this.getAccountBalance() + amount;   
    }
    public String toString(){
        return super.toString()+" Overdraft Limit: "+this.overdraftLimit;
    }
}
