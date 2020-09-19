
package circle;

public class CircleComparable extends Circle implements Comparable <CircleComparable>{
    
    public CircleComparable(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(CircleComparable o) {
        if(this.getArea() > o.getArea()){
        return 1;
    }else if(this.getArea() < o.getArea()){
        return -1;
    }else{
        return 0;
    }
        
    }
    


    @Override
    public String toString() {
        return super.toString()+" "+this.getArea()+" "+this.getPerimeter();
    }

    
}
