/**
 * Assignment: 3
 *
 * @Name: Md Rashad Tanjim ID: 1620952042
 */
package HW;

import java.util.*;

public class FullTimeEmployee extends Part_full_Time_Abstract {

    private double basic = 15000;
    private double allowance = 25;


    public void abs_method1() {
        System.out.println("This is method 1 for Full-time Employee!");
    };

    public void abs_method2() {
        System.out.println("This is method 2 for Full-time Employee!");
    };
    
    FullTimeEmployee() {

    }

    FullTimeEmployee(String name, String address, int age, String designation,
            String department, double basic, double allowance) {
        super();
        this.basic = basic;
        this.allowance = allowance;
    }

    public void setBasic(double basic) {
        this.basic = basic;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public double getBasic() {
        return basic;
    }

    public double getAllowance() {
        return allowance;
    }

    public double salary() {
        return basic + ((allowance * basic) / 100);
    }

    @Override
    public String toString() {
        return ("Full Time Employee Salary = " + getBasic() + " + "
                + getAllowance() + "% of " + getBasic() + " = " + salary());
    }

}
