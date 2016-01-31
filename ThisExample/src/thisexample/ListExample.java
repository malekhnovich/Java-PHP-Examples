/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thisexample;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maxrenet
 */
public class ListExample {
    public static void main(String[]args){
        LocalDate d=LocalDate.of(2020,Month.JANUARY,20);
        System.out.println(d.getDayOfMonth());
        System.out.println(d.getDayOfWeek());
        System.out.println(d.getDayOfYear());
        
        List <String> list=new ArrayList();
        list.add("hawk");
        list.add("robin");
        Object[]objectArray=list.toArray();
        System.out.println(objectArray.length);
    }
    //String [] stringArray=list.toArray(new String[0]);
  //  System.out.println(stringArray.length);
    
}
