
package problem_06;

public class Person {
    protected String name;
    protected String address;
    protected String phoneNumber;
    protected String emailAddress;
    Person(){    
}
    Person(String name, String address, String phoneNumber, String emailAddress){ 
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
}
      public void setName(){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setAddress(){
        this.address = address;
    }
    public String getAddress(){
        return this.address;
    }
    public void setPhoneNumber(){
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public void setEmail(){
        this.emailAddress = emailAddress;
    }
    public String getEmail(){
        return this.emailAddress;
    }
    public String toString(){
        return "Name: "+this.name+" Address: "+this.address+" Phone Number: "
                +this.phoneNumber+" Email: "+this.emailAddress;
    }
    
}
