/**
 * Home_Work
 * Date: 6.03.20 
 * @Name: Md Rashad Tanjim ID: 1620952042
 */
package HW;
import java.util.*;

public class Person extends People_Employee_Abstract {

    private String name;
    private String gender;
    private int age;

    Person() {

    }

    Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public void abs_method1() {
        System.out.println("This is Abstract Method-1 !");
    }

    @Override
    public void abs_method2() {
        System.out.println("This is Abstract Method-2 !");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

}
