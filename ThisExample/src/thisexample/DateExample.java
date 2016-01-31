/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thisexample;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import static thisexample.DateExample.two;

/**
 *
 * @author maxrenet
 */
public class DateExample {

    static LocalDate one=LocalDate.now();
    static LocalDateTime two=LocalDateTime.now();
    static LocalTime three=LocalTime.now();
   static String dateOne=one.format(DateTimeFormatter.ISO_DATE);
   static String dateTwo=two.format(DateTimeFormatter.ISO_DATE);
   static String dateThree=two.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
   static String dateFour=two.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
   static String dateFive=two.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
   // static String timeThree=three.format(DateTimeFormatter.ISO_LOCAL_TIME);
   public static void main(String[]args){
   System.out.println(two);
   System.out.println("ISODATE returns "+dateTwo);
   System.out.println("Short date returns "+dateThree);
   System.out.println("Medium date returns: "+dateFour);
   System.out.println("Long date returns: "+dateFive);
    }
}

