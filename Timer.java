/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Timer.java
 * @author: Duc Ta
 * @author: <First Name> <Last Name>
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.TimeZone;

public class Timer {

    //
    // Static Data Fields
    //
    private final static DateFormat dateFormat= new SimpleDateFormat("yyyy/MM/dd hh:mm:ss aa z");
    private static String timeZone;
    //
    // Instance Data Fields
    //

    //
    // Constructors
    //
    public Timer() {
    }
    public Timer(String timeZone,DateFormat dateFormat){

    }
    public static Timer setTimeZonePreference() {
        Scanner input = new Scanner(System.in);
        timeZone=input.next();
        Timer timer = new Timer(timeZone,dateFormat);
        switch (timeZone){
            case "Pacific Standard Time in Day Light Saving":dateFormat.setTimeZone(TimeZone.getTimeZone("America/"+
                    "Los_Angeles"));
            case "Central Standard Time in Day Light Saving":dateFormat.setTimeZone(TimeZone.getTimeZone("America/"+
                    "Chicago"));
            case "Eastern Standard Time not in Day Light Saving":dateFormat.setTimeZone(TimeZone.getTimeZone(
                    "America/"+ "New York"));
        }

        return timer;
    }

    public Object getTimeZoneFormatted() {
        return null;
    }

    //
    // Static Methods
    //

    //
    // Additional Static Methods
    //

    //
    // Instance Methods
    //

    //
    // Additional Instance Methods
    //

    //
    // Language
    //
}