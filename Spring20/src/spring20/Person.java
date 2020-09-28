/**
 * Assignment: 3
 *
 * @Name: Md Rashad Tanjim ID: 1620952042
 */
package spring20;
import java.util.*;


public class Person {
    private String name;
    private String gender;
    private int age;
    
    Person()
    {
        
    }
    Person(String name, String gender, int age)
    {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    public void setGender(String gender)
    {
        this.gender = gender;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    
    public String getName()
    {
        return name;
    }
     public String getGender()
    {
        return gender;
    }
      public int getAge()
    {
        return age;
    }
    
}
