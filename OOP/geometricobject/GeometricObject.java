
package geometricobject;

import java.util.Date;

public abstract class GeometricObject {
protected String color;
protected boolean fill;
protected java.util.Date date;

    public GeometricObject(String color, boolean fill, Date date) {
        this.color = color;
        this.fill = fill;
        this.date = new java.util.Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFill() {
        return fill;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }

    public java.util.Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return " " + color + " " + fill + " " + date;
    }
    
    public abstract double getArea();
    public abstract double getPerimeter();

    
}
