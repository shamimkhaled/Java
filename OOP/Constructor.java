
package constructor2;


public class Constructor2 {

   
    public static void main(String[] args) {
        Person p1 = new Person("Khaled",20,"USA");
        
        p1.setNames("Shamim");
        p1.setAges(19);
        p1.setNationality("Bangladesh");
        
        p1.Speak();
    }
    
}
