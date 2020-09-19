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
public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher(1234, " MRH1", "CSE");
        Teacher t2 = new Teacher(1245, " ZIK", "Math");
        Student s1 = new Student(181, " Khaled", "ECE");
        System.out.println(t1.toString());
        System.out.println(s1.toString());
        s1.addTeacher(t1);
        s1.addTeacher(t2);
        System.out.println(s1.toString1());
    }
}
