
package problem_01;


public class Rectangle {
      private double width = 1; 
      private double height = 1;
    
    Rectangle(){
       
    }
    Rectangle(double width, double height){
       this.width = width;
       this.height = height;
    }
    public double getWidth(){
        return this.width;
    }
    public double getHeight(){
        return this.height;
    }
    public double getArea(){
        return this.width*this.height;
    }
    
    public double getPerimeter(){
       return 2*(this.width+this.height);
    }
}
