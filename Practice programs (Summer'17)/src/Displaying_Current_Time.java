/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arnob
 */
public class Displaying_Current_Time {

    public static void main(String[] args) {
        // Obtain the total milliseconds since midnight, Jan 1, 1970 
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = (int) (totalSeconds % 60); // Obtain the total minutes 
        long totalMinutes = totalSeconds / 60; // Compute the current minute in the hour 
        long currentMinute = (int) (totalMinutes % 60); // Obtain the total hours 
        long totalHours = totalMinutes / 60; // Compute the current hour 
        long currentHour = (int) (totalHours % 24); // Display results 
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT ");
    }
}

