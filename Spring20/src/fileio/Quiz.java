package fileio;

import java.io.*;
import java.util.*;

/**
 * Md Rashad Tanjim -- ID: 1620952042 -- File IO
 */
public class Quiz {

    private String id;
    private float mark;

    public Quiz() {

    }

    public Quiz(String id, float mark) {
        this.id = id;
        this.mark = mark;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public String getId() {
        return id;
    }

    public float getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return "ID: " + id + " " + "Mark: " + mark;
    }

}
