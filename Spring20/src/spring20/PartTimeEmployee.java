/**
 * Assignment: 3
 *
 * @Name: Md Rashad Tanjim ID: 1620952042
 */
package spring20;
import java.util.*;


public class PartTimeEmployee extends Employee2{
    
    private double hours;
    private double rate;
    
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
