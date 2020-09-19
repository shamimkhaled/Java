
package problem_06;

import java.util.Date;

public class Staff extends Employee{
    private String staffTitle;
    Staff(){
        super();
    }
    Staff(String name, String address, String phoneNumber, String emailAddress, int employeeOffice, 
            double employeeSalary,Date dateHired, String staffTitle){
        
        super(name, address, phoneNumber, emailAddress, employeeOffice, employeeSalary, dateHired);
        this.staffTitle = staffTitle;
    }
    public void setStaffTitle(){
        this.staffTitle = staffTitle;
    }
    public String getStaffTitle(){
       return this.staffTitle;
    }
    public String toString(){
       return super.toString()+" Title: "+this.staffTitle;
    }
    
}
