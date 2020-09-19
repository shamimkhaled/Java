
package geometricobject;

import java.util.Date;

public class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon>{
private double side;
    public Octagon(String color, boolean fill, Date date,double side) {
        super(color, fill, date);
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }
     
    @Override
    public double getArea() {
        return 2+4/Math.sqrt(2)*side*side;
    }

    @Override
    public double getPerimeter() {
        return 8*side;
    }

    @Override
    public int compareTo(Octagon o) {
        if(this.getArea() > o.getArea()){
            return 1;
        }else if(this.getArea() > o.getArea()){
            return -1;
        }else{
            return 0;
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); 
    }

    @Override
    public String toString() {
        return super.toString()+" "+this.side+"\n "+this.getArea()+" "+this.getPerimeter();
    }
   
    
}
