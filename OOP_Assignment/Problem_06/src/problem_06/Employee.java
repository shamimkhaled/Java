
package problem_06;
import java.util.Date;
public class Employee extends Person {
    protected int employeeOffice;
    protected double employeeSalary;
    protected Date dateHired;
    Employee(){
        super();
    }
    Employee(String name, String address, String phoneNumber, String emailAddress, int employeeOffice, double employeeSalary, Date dateHired){
        super(name, address, phoneNumber, emailAddress);
        this.employeeOffice = employeeOffice;
        this.employeeSalary = employeeSalary;
        this.dateHired = dateHired;
    }
    public void setEmployeeOffice(){
        this.employeeOffice = employeeOffice;
    }
    public int getEmployeeOffice(){
        return this.employeeOffice;
    }
     public void setEmployeeSalary(){
        this.employeeSalary = employeeSalary;
    }
    public double getEmployeeSalary(){
        return this.employeeSalary;
    }
    public void setDate(){
        this.dateHired = dateHired;
    }
    public Date getDate(){
        return this.dateHired;
    }
    public String toString(){
        return super.toString()+" Office: "+this.employeeOffice+" Salary: "+this.employeeSalary+" Date: "+this.dateHired;
    }
}
