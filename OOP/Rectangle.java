
package constructor;

public class Rectagle {
    
    int length, breadth;
    
    Rectagle(){
        System.out.println("Empty constructor parameter");
    }
    Rectagle(int l, int w){
        System.out.println("Constructor Parameterized ");
        length = l;
        breadth = w;
    }
    
    public void getArea(){
        System.out.println("Rectangle Area is: "+(length*breadth));
    }
    
    public void getPerimeter(){
        System.out.println("Rectangle Perimeter is: "+(2*(length+breadth)));
    }
}
