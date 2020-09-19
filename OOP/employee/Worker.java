
package employee;

public class Worker extends Employee{
    private int wId;
    private String wName;
    private double wSalary;
    Worker(){
        super();
    }
    Worker(int id, String name, double salary, int wId, String wName, double wSalary){
        super(id,name,salary);
        this.wId = wId;
        this.wName = wName;
        this.wSalary = wSalary;
    }
      public int getWId(){
        return this.wId;
    }
    public String getWName(){
        return this.wName;
    }
  
    public double getWSalary(){
        return this.wSalary;
    }
    public String toString(){
     return  super.toString()+"\nWorker Infoo: \n"+this.wId+" "+this.wName+" "+this.wSalary;
   }
   public boolean equals (Worker obj){
       return this.wSalary == obj.wSalary;
   }
}
