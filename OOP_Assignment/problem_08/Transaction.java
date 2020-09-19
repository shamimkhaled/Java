
package problem_08;

import java.util.Date;

public class Transaction {
    private java.util.Date date;
    //Date d1 = new Date();
    private char type;
    private double amount;
    private double balance;
    private String description;
    Transaction(char type, double amount, double balance, String description){
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }
    public void setType(){
        this.type = type;
    }
    public void setAmount(){
        this.amount = amount;
    }
    public void setBalance(){
        this.balance = balance;
    }
    public void setDate(){
        this.date = date;
    }
    public Date getDate(){
        return this.date;
    }
    public char getType(){
        return this.type;
    }
    public double getAmount(){
        return this.amount;
    }
    public double getBalance(){
        return this.balance;
    }
    public String getDescription(){
        return this.description;
    }

}
