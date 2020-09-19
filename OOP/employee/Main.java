
package employee;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "James", 45000);
        Employee e2 = new Employee(102, "Alice", 42000);
        Teacher t1 = new Teacher(103, "Clark", 25000,181, "Jeson", "ECE", 60000);
        Worker w1 = new Worker(104, "Root", 20000, 201, "Joe",12000);
        Worker w2 = new Worker(105, "Hodge", 22000, 202, "Taylor",12000);
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e1.equals(e2));
        System.out.println(" ");
        System.out.println(t1.toString());
        System.out.println(" ");
        System.out.println(w1.toString());
        System.out.println(w2.toString());
        System.out.println(w1.equals(w2));
        Employee []object = new Employee[3];
        object[0] = new Employee(106, "Jay", 26500);
        object[1] = new Teacher(107, "Roy", 23500, 182, "Willy", "ETE", 50000);
        object[2] = new Worker(108, "Tye", 28000, 203, "Forest",10000);
        for (int i = 0; i < object.length; i++) {
            System.out.println(object[i].toString()+"\n");
        }
    }
}
