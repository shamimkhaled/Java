
package problem_06;

import java.util.Date;

public class Faculty extends Employee{
    private String facultyOfficeHour;
    private String facultyRank;
    Faculty(){
        super();
    }
    Faculty(String name, String address, String phoneNumber, String emailAddress, int employeeOffice, 
            double employeeSalary,Date dateHired, String facultyOfficeHour, String facultyRank){
       
        super(name, address, phoneNumber, emailAddress, employeeOffice, employeeSalary, dateHired);
        this.facultyOfficeHour = facultyOfficeHour;
        this.facultyRank = facultyRank;
    
    }

    public String getFacultyOfficeHour(){
        return this.facultyOfficeHour;
    }
    public String getFacultyRank(){
        return this.facultyRank;
    }
    public String toString(){
        return super.toString()+"Office Hour: "+this.facultyOfficeHour+" Rank: "+this.facultyRank;
    }
}
