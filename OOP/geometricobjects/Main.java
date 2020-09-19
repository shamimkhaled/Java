
package geometricobjects;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("First Rectangle Info: ");
        Rectangle r1 = new Rectangle("Black", true, 8, 4);
        System.out.println(r1.toString());
        System.out.println("first rectangle area: "+r1.getArea());
        System.out.println("Second Rectangle Info: ");
        //input by user
        String colour = input.next();
        boolean fill = input.nextBoolean();
        double width = input.nextDouble();
        double height = input.nextDouble();
        Rectangle r2 = new Rectangle(colour, fill, width, height);
        System.out.println(r2.toString());
        System.out.println("second rectangle area: "+r2.getArea());
        ///first and second rectangle are equal or not. Output: true or false.
        System.out.println(r1.equals(r2));//false
        System.out.println();
        System.out.println("First Circle Info:");
        Circle c1 = new Circle("White", false, 5);
        System.out.println(c1.toString());
        System.out.println("first circle area: "+c1.getArea());
        System.out.println("Second Circle Info:");
        Circle c2 = new Circle("Green", true, 5);
        System.out.println(c2.toString());
        System.out.println("second circle area: "+c2.getArea());
        ///first and second circle are equal or not. Output: true or false.
        System.out.println(c1.equals(c2));//true
        System.out.println();
    }
}
