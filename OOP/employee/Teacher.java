
package employee;

public class Teacher extends Employee{
    private int tId;
    private String tName;
    private String tFaculty;
    private double tsalary;
    Teacher(){
        super();
    }
    Teacher(int id, String name, double salary, int tId, String tName, String tFaculty, double tsalary){
        super(id,name,salary);
        this.tId = tId;
        this.tName = tName;
        this.tFaculty = tFaculty;
        this.tsalary = tsalary;
    }
    public int getId(){
        return this.tId;
    }
    public String getName(){
        return this.tName;
    }
    public String getFaculty(){
        return this.tFaculty;
    }
    public double getSalary(){
        return this.tsalary;
    }
    public String  toString(){
       return super.toString()+" \nTeacher Info: \n"+this.tId+" "+this.tName+" "+this.tFaculty+" "+this.tsalary; 
    }
}
