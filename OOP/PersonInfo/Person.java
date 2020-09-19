
package oop;

public class Person {
    private int id;
    private String name;
    private int age;
    private double weight;
    private double height;
    static int count = 0;
    
    Person(){
        this.id = -1;
        this.name = "NULL";
        this.age = 0;
        this.weight = 0.0;
        this.height = 0.0;
        count++;
    }
    Person(int id, String name, int age, double weight, double height){
        this.id = id;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        count++;
    }
    public String toString(){
        return "The object has ID: "+this.id+" Name: "+this.name+" Age: "+this.age+" Weight: "+this.weight+" Height: "+this.height;
    }
    public double calculateBMI(){
        double BMI = this.weight/(this.height*this.height);
        return BMI;
    }
    public boolean toComparePerson(Person P){
        if(this.calculateBMI() > P.calculateBMI()){
            return true;
        }else{
            return false;
        }
    
    }
    public static int getCount(){
        return count;
    }
}
