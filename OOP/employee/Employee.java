/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author Lenovo
 */
public class Employee {
    protected int id;
    protected String name;
    protected double salary;
    Employee(){};
    Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        
    }
    public String toString(){
        return "Employee Infoo: \n"+this.id+" "+this.name+" "+this.salary;
    }
    public boolean equals(Employee obj){
        return this.salary == obj.salary;
    }
  
    
}
