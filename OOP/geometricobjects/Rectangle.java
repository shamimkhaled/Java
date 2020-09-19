
package geometricobjects;

public class Rectangle extends GeometricObjects{
    private double width;
    private double height;
    Rectangle(){
        super();
    }
    Rectangle(String color, boolean filled, double width, double height){
        super(color, filled);
        this.width = width;
        this.height = height;
    }
    public String toString(){
        return super.toString()+" Width: "+this.width+" Height: "+this.height;
    }
    public double getArea(){
        return this.width*this.height;
    }
    public boolean equals(Rectangle obj){
        return this.width == obj.width && this.height == obj.height;
    }
}
