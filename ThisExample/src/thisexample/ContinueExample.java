/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thisexample;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;

/**
 *
 * @author maxrenet
 */
public class ContinueExample {
String color="blue";
    public ContinueExample(String color){
    this.color=color;
}
    public static void main(String[] args) {
ContinueExample n=new ContinueExample("red");
System.out.println(n.color);
        String s="good day";
        s.substring(4,8);
        System.out.println(s);
        StringBuilder sb=new StringBuilder("good day");
        boolean b=s.equals(sb);
               System.out.println(b);
               s=sb.substring(4);
               System.out.println(s);
               Integer x=25;
               String xs=25+"";
               xs=x.toString();
              xs=xs+"hello";
               System.out.println(xs);
               List<String> list=new ArrayList<>();
               list.add("robin");
               list.add("hawk");
        String[] stringarray=list.toArray(new String[0]);
        System.out.println(stringarray.length);
        LocalDate d=LocalDate.now();
        System.out.println("The date is "+d);
        d=d.plusMonths(1);
        System.out.println( d);
        String name="bill";
       name=speak(name);
       System.out.println(name);
}
    public static String speak(String name){
        name="sparky";
        return name;
                
    }
}

