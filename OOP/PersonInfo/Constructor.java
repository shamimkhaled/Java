
package oop;

public class Constructor {
    public static void main(String[] args) {
        Person p1 = new Person(1813597,"Shamim",19,50,1.61);
        Person p2 = new Person(1811242,"Khaled",20,62,1.73);
        System.out.println(" "+p1.toString()+" BMI: "+p1.calculateBMI());
        System.out.println(" "+p2.toString()+" BMI: "+p2.calculateBMI());
        System.out.println(" "+p2.toComparePerson(p1));
        System.out.println(" "+p1.toComparePerson(p2));
        
        Person []p3 = new Person[10];
        for(int i =0;i<10;i++){
            p3[i] = new Person(i*1+10, "Isha",  (int)(18+Math.random()*7), 45+Math.random()*55, 1.5+Math.random()*0.4);
            System.out.println(" "+p3[i].toString()+" BMI: "+p3[i].calculateBMI());
            
            
        }
        System.out.println("Number of persons: "+Person.getCount());
    }
}
