
package geometricobjects;

public class GeometricObjects {
    protected String color;
    protected boolean filled;
    GeometricObjects(){
        
    }
    GeometricObjects(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    //Method Override
    public String toString(){
        return "Color: "+this.color+" Filled: "+this.filled;
    }
    public boolean equals(GeometricObjects obj){
        return this.color == obj.color && this.filled == filled;
    }
    
}
