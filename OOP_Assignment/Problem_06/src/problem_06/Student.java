
package problem_06;

public class Student extends Person {
    public String studentStatus;
    public static String freshman = "Fresman";
    public static String junior = "Junior";
    public static String senior = "Senior";
    public static String sophomore = "Sophomore";
    
    Student(){
        super();
    }
    Student(String name, String address, String phoneNumber, String emailAddress, String studentStatus){
        
        super(name, address, phoneNumber, emailAddress);
        this.studentStatus = studentStatus; 
    }
    public void setStudentStatus(){
        this.studentStatus = studentStatus;
    }
     public String getStudentStatus(){
        switch (studentStatus) {
            case "Fresman":
                return "FRESHMAN";
            case "Junior":
                return "JUNIOR";
            case "Senior":
                return "SENIOR";
            case "Sophomore":
                return "SOPHOMORE";
            default:
                return "null";
        }
        
        
    }
    public String toString(){
        return super.toString()+"Student Status: "+this.getStudentStatus();
    }
}
