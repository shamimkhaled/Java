
package problem_08;

import java.util.ArrayList;
import java.util.Date;

public class Account {
    private String aName;
    private int aId;
    private double balance;
    private double annualInterestRate;
    private Date date;
    private ArrayList<Transaction> transaction ;
    //private double balance;
    
    Account(String aName){
        this.aName = aName;
    }
    Account(String aName,int aId, double balance, double annualInterestRate, Date date ){
        this(aName);
        this.aId = aId;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.date = date;
        transaction = new ArrayList<>();
    }
     public String getName(){
        return this.aName;
    }
    public int getId(){
        return this.aId;
    }
    public double getBalance(){
        return this.balance;
    }
    public double getAnnualInterestRate(){
        return this.annualInterestRate;
    }
    public Date getDate(){
        return this.date;
    }
    public void setName(){
        this.aName = aName;
    }
    public void setBalance(){
        this.balance = balance;
    }
    public void setAnnualInterestRate(){
        this.annualInterestRate = annualInterestRate;
    }
    public void setDate(){
        this.date = date;
    }
    
     public double getMonthlyInterestRate(){
        return (annualInterestRate/100)/12;
    }
    public double getMonthlyInterest(){
        return balance*getMonthlyInterestRate();
    }
    public void getWithdraw(double amount){
        this.balance = this.balance - amount;
        transaction.add(new Transaction('W', amount, balance, "Withdraw to account"));
    }
    public void getDeposit(double amount){
        this.balance = this.balance + amount;;
        transaction.add(new Transaction('D', amount, balance, "Deposit to account"));
    }
    public ArrayList<Transaction> getTransaction(){
        return transaction;
    }
}
