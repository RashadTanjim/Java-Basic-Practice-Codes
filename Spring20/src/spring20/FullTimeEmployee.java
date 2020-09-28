/**
 * Assignment: 3
 *
 * @Name: Md Rashad Tanjim ID: 1620952042
 */
package spring20;

import java.util.*;


public class FullTimeEmployee extends Employee2{
    
    private double basic = 15000;
    private double allowance = 25;
    
    FullTimeEmployee()
    {
        
    }
    
    FullTimeEmployee(String name, String address,int age, String designation, 
            String department, double basic, double allowance)
    {
        super();
        this.basic = basic;
        this.allowance = allowance;
    }
    
    public void setBasic(double basic)
    {
        this.basic = basic;
    }
    public void setAllowance(double allowance)
    {
        this.allowance = allowance;
    }
    
    public double getBasic()
    {
        return basic;
    }
    public double getAllowance()
    {
        return allowance;
    }
    
    public double salary()
    {
        return basic + ((allowance * basic)/100);
    }
    
    @Override
    public String toString()
    {
        return ("Full Time Employee Salary = " + getBasic() + " + " 
                + getAllowance() + "% of " + getBasic() + " = " + salary());
    }
    
    
}
