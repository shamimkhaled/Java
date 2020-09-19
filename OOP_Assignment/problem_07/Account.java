
package problem_07;

import java.util.Date;

public class Account {
    private int accountId = 0;
    double accountBalance = 0.0;
    private double annualInterestRate = 0.0;
    private Date dateCreated;
    Account(){
        
    }
    Account(int accountId, double accountBalance, double annualInterestRate, Date dateCreated){
        this.accountId = accountId;
        this.accountBalance = accountBalance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = dateCreated;
    }
    public void setAccountId(){
        this.accountId = accountId;
    }
    public void setAccountBalance(){
        this.accountBalance = accountBalance;
    }
    public void setAnnualInterestRate(){
        this.annualInterestRate = annualInterestRate;
    }
    public int getAccountId(){
        return this.accountId;
    }
    public double getAccountBalance(){
        return this.accountBalance;
    }
    public double getAnnualInterestRate(){
        return this.annualInterestRate;
    }
    public String getDateCreated(){
        return this.getDateCreated().toString();
    }
    public double getMonthlyInterestRate(){
        return (annualInterestRate/100)/12;
    }
    public double getMonthlyInterest(){
        return accountBalance*getMonthlyInterestRate();
    }
    public double getWithdraw(double amount){
        this.accountBalance = this.accountBalance - amount;
        return this.accountBalance;
    }
    public double getDeposit(double amount){
        this.accountBalance = this.accountBalance + amount;;
        return this.accountBalance;
    }
}

