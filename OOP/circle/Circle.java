
package circle;

public class Circle {
private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    
    
    public double getArea(){
    return this.radius*this.radius*Math.PI;
    }
    public double getPerimeter(){
    return 2*this.radius*Math.PI;
    }
   @Override
    public String toString() {
        return  "" + this.radius+" "+this.getArea()+" "+this.getPerimeter() ;
    }
    
}
