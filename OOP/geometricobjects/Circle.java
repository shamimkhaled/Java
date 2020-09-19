
package geometricobjects;

public class Circle extends GeometricObjects{
    private double radius;
    Circle(){
        super();
    }
    Circle(String color, boolean filled, double radius){
        super(color, filled);
        this.radius = radius;
    }
    public String toString(){
        return super.toString()+"  Radius: "+this.radius;
    }
    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }
    public boolean equals(Circle obj){
        return this.radius == obj.radius;
    }
}
