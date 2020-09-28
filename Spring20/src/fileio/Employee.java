package fileio;

import java.io.*;
import java.util.*;

/**
 * Md Rashad Tanjim -- ID: 1620952042 -- File IO
 */
public class Employee implements Serializable {

    public String name;
    public String id;

    public Employee() {

    }

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Name: " + name + " " + "ID: " + id;
    }

}
