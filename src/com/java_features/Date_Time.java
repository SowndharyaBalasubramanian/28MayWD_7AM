package com.java_features;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Date_Time {
    public static void main(String[] args){
        LocalDate date = LocalDate.now();
        System.out.println("Date : " + date);

        LocalTime time = LocalTime.now();
        System.out.println("Time : " + time);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println("Date and Time : " + dt);

        //custom date and time

        LocalDate myDate = LocalDate.of(2025, 7, 2);
        System.out.println(myDate);

        //Add/Subtract Days/Months/Years

        LocalDate Tomorrow = LocalDate.now().plusYears(5);
        System.out.println(Tomorrow);

        LocalDate Yesterday = LocalDate.now().minusMonths(4);
        System.out.println(Yesterday);

        //Date Format

        LocalDateTime now1 = LocalDateTime.now();
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String formatt = now1.format(format1);
        System.out.println(formatt);


        // period(Date difference)

        LocalDate d1 = LocalDate.of(1996, 4,15);
        LocalDate d2 = LocalDate.of(2025, 07, 30);
        Period p = Period.between(d1, d2);
        System.out.println(p.getYears() + " " + p.getMonths() + " " + p.getDays());
    }
}

//d
//MM
//yyyy
//H
//m
//s
//a
//E


