/**
 * Home_Work
 * Date: 6.03.20 
 * @Name: Md Rashad Tanjim ID: 1620952042
 */
package HW;
import java.util.*;


public class Employee extends People_Employee_Abstract {
    
    private String id;
    private String department;
    private double salary;
    
    Employee()
    {
        
    }
    
    @Override
    public void abs_method1() {
        System.out.println("This is Abstract Method-1 on Employee class!");
    }

    @Override
    public void abs_method2() {
        System.out.println("This is Abstract Method-2 on Employee class!");
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
