
package teacherandstudent;

public class Teacher {
    private int tId;
    private String tName;
    private String tFaculty;
    Teacher(){
        
    }
    Teacher(int tId, String tName, String tFaculty){
        this.tId = tId;
        this.tName = tName;
        this.tFaculty = tFaculty;
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
    public String  toString(){
       return " Teacher Info:\n "+this.tId+" "+this.tName+" "+this.tFaculty; 
    }
}
