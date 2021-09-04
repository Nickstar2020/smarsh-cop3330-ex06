/*
 *  UCF COP3330 Fall 2021 Assignment 6 Solution
 *  Copyright 2021 Nicholas Smarsh
 */
package org.example;
import java.util.Calendar;
import java.util.Scanner;

public class assignment6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //get the current year
        int curYear = Calendar.getInstance().get(Calendar.YEAR);

        //im just going to convert it from a string again just in case
        System.out.println("How old are you?");
        String age = scan.nextLine();
        int ageInt = Integer.parseInt(age);

        System.out.println("What age would you like to retire?");
        String retireAge = scan.nextLine();
        int retireAgeInt = Integer.parseInt(retireAge);

        //subtract retire year from age to get time frame, and print
        int timeFrame = retireAgeInt - ageInt;
        System.out.println("You have " + timeFrame + " years left until you can retire.");

        //figure out what year you retire
        int retireYear = curYear + timeFrame;
        System.out.println("It is " + curYear + ", so you can retire in " + retireYear);

    }
}
