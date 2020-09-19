
package problem_01;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 40);
        Rectangle r2 = new Rectangle(3.5, 35.9);
        System.out.println("First Rectangle Info: ");
        System.out.println("First Rectangle Width and Height: "+r1.getWidth()+" "+r1.getHeight());
        System.out.println("Area of the first rectangle: "+r1.getArea());
        System.out.println("Area of the first perimeter: "+r1.getPerimeter());
        System.out.println();
        System.out.println("Second Rectangle Info: ");
        System.out.println("First Rectangle Width and Height: "+r2.getWidth()+" "+r2.getHeight());
        System.out.println("Area of the second rectangle: "+r2.getArea());
        System.out.println("Area of the second perimeter: "+r2.getPerimeter());
    }
}
