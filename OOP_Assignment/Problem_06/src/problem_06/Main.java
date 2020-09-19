
package problem_06;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date d1 = new Date();
        
        Person p1 = new Person("Shamim", "128/3 Kawran Bazar", "01624462456", "iamsk84@gmail.com");
        Student s1 = new Student("Suma", "115 Plot B NSU", "01623456788", "suma@gmail.com", Student.senior);
        Employee e1 = new Employee("Khaled", "Mirpur-10", "01624462475", "iamkhaled2494@gmail.com", 101, 93100, d1);
        Faculty f1 = new Faculty("Isha", "Tejgaon-1215", "0198765432", "isha@gmail.com", 102, 70000, d1, "10am to 4pm", "Professor");
        Staff staff = new Staff("Fatema", "Farmgate", "0198766392", "disha@gmail.com", 104, 70000, d1, "Sub-Executive");
        System.out.println(p1.toString());
        System.out.println(s1.toString());
        System.out.println(e1.toString());
        System.out.println(f1.toString());
        System.out.println(staff.toString());
    }
  
}
