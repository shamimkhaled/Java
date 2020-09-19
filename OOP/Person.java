
 
package constructor2;

public class Person {
    private String name;
    private int age;
    private String nationality;
    
    Person(){
        System.out.println("Empty constructor parameter");
    }
    Person(String n, int a, String nation){
        this.name = n;
        this.age = a;
        this.nationality = nation;
    }
    
     public void setNames(String na){
        this.name = na;
    }
     public String getNames(){
         return this.name;
     }
     
      public void setAges(int ag){
       this. age = ag;
    }
     public int getAges(){
         return this.age;
     }
      public void setNationality(String nat){
       this. nationality = nat;
    }
     public String getNationality(){
         return this.nationality;
     }
     
     public void Speak(){
         System.out.println("Name = "+name);
         System.out.println("Age = "+age);
         System.out.println("Nationality = "+nationality);
     }
    
}
