/**
 * Home_Work
 * Date: 6.03.20 
 * @Name: Md Rashad Tanjim ID: 1620952042
 */
package HW;
import java.util.*;


public class PartTimeEmployee extends Part_full_Time_Abstract{
    
    private double hours;
    private double rate;
    
    public void abs_method1() {
        System.out.println("This is method 1 for Full-time Employee!");
    };

    public void abs_method2() {
        System.out.println("This is method 2 for Full-time Employee!");
    };
    
    PartTimeEmployee()
    {
        
    }
    
    PartTimeEmployee(String name, String address,int age, String designation, String department, double hours, double rate)
    {
        super();
        this.hours = hours;
        this.rate = rate;
    }
    
    public void setHours(double hours)
    {
        this.hours = hours;
    }
    public void setRate(double rate)
    {
        this.rate = rate;
    }
    
    public double getHours()
    {
        return hours;
    }
    public double getRate()
    {
        return rate;
    }
    
    public double salary()
    {
        return 0;
    }
    
    @Override
    public String toString()
    {
        return "Part Time Employee Salary: " + (getRate() * getHours());
    }
    
    
}
