
package inhiretence;

public class Account {
    private int accountNumber;
    private double accountBalence;
    
    Account(){
        this.accountNumber = -1;
        this.accountBalence = 0.0;
    }
    Account(int accountNumber, double accountBalence){
        this.accountNumber = accountNumber;
        this.accountBalence = accountBalence;      
    }
    public String toString(){
        return "accountNumber: "+this.accountNumber+" accountBalence: "+this.accountBalence;
    }
    public void setNumber(){
        this.accountNumber = accountNumber;
    }
    public int getNumber(){
        return this.accountNumber;
    }
     public void setBalence(){
        this.accountBalence = accountBalence;
    }
    public double getBalence(){
        return this.accountBalence;
    } 
}
