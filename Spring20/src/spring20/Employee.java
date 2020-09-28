/**
 * Assignment: 3
 *
 * @Name: Md Rashad Tanjim ID: 1620952042
 */
package spring20;
import java.util.*;


public class Employee extends Person{
    
    private String id;
    private String department;
    private double salary;
    
    Employee()
    {
        
    }
    
    Employee(String name, String gender,int age, String id, String department, double salary)
    {
        super();
        this.id = id;
        this.department = department;
        this.salary = salary;
    }
    
    public void setId(String id)
    {
        this.id = id;
    }
    public void setDepartment(String department)
    {
        this.department = department;
    }
    public void setSalary(double salary)
    {
        this.salary = salary;
    }
    
    public String getId()
    {
        return id;
    }
     public String getDepartment()
    {
        return department;
    }
      public double getSalary()
    {
        return salary;
    }
    
}
