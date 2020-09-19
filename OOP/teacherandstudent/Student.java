/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teacherandstudent;

/**
 *
 * @Khaled
 */
public class Student {
    private int sId;
    private String sName;
    private String sDept;
    private Teacher []teach;
    private int count;
    Student(){ };
    Student(int sId, String sName, String sDept){
        this.sId = sId;
        this.sName = sName;
        this.sDept = sDept;
        this.teach = new Teacher [5];
        this.count = 0;
    }
    public String toString(){
        return "Student Infoo:\n "+this.sId+" "+this.sName+" "+this.sDept;
    }
    public StringBuilder toString1(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.sId);
        sb.append(" ");
        sb.append(this.sName);
        sb.append(" ");
        sb.append(this.sDept);
        sb.append(" ");
        for (int i = 0; i < count; i++) {
            sb.append(this.teach[i].getId());
            sb.append(" ");
            sb.append(this.teach[i].getName());
            sb.append(" ");
            sb.append(this.teach[i].getFaculty());
        }
        return sb;
    }
    public void addTeacher(Teacher t){
        this.teach[count] = t;
        count++;
    }
}
