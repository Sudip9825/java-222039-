

public class Employee {
    private String name;
    private String department;
    private double salary;
    private String id;
    public Employee(String name , String id , String department , double Salary){
        this.name = name;
        this.department = department;
        this.id = id;
        this.salary = Salary;
    }
    public String getName(){
        return name;
    }
   public String setId(){
        return id;
    }
    public String getDepartment(){
        return department;
    }
}