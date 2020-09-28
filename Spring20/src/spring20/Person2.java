/**
 * Assignment: 3
 *
 * @Name: Md Rashad Tanjim ID: 1620952042
 */
package spring20;
import java.util.*;


public class Person2 {
    private String name;
    private String address;
    private int age;
    
    Person2()
    {
        
    }
    Person2(String name, String address, int age)
    {
        this.name = name;
        this.address = address;
        this.age = age;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    
    public String getName()
    {
        return name;
    }
     public String getAddress()
    {
        return address;
    }
      public int getAge()
    {
        return age;
    }
    
}
