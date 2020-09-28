/**
 * Assignment: 3
 *
 * @Name: Md Rashad Tanjim ID: 1620952042
 */
package spring20;
import java.util.*;


public class Faculty extends Employee{
    private String initial;
    private String rank;
    
    
    Faculty()
    {
        
    }
    
    Faculty(String name, String gender,int age, String id, String department, double salary,  String initial, String rank)
    {
        super();
        this.initial = initial;
        this.rank = rank;
    }
    
    public void setInitial(String initial)
    {
        this.initial = initial;
    }
    public void setRank(String rank)
    {
        this.rank = rank;
    }
    
    public String getInitial()
    {
        return initial;
    }
     public String getRank()
    {
        return rank;
    }
    
    @Override
    public String toString()
    {
        return "Name: " + getName() + " Age: " + getAge() + " Salary: " + getSalary() + " Initial: " + getInitial(); 
    }
}
