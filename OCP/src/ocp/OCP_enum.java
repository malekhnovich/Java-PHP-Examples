/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocp;

/**
 *
 * @author maxrenet
 */
 enum Season{
    WINTER, SPRING,SUMMER,FALL
}
public class OCP_enum {
static Season s =Season.SUMMER;
static String summer_season=Season.SUMMER.toString();


public static void main(String[]args){
   // System.out.println(s.toString());
//System.out.println(""+summer_season);
//System.out.println(s==Season.SUMMER);
for (Season season: Season.values()) {
   // System.out.println(season.name()+" "+season.ordinal());
}
Season summer=Season.SUMMER;
switch(summer){
    case WINTER:
        System.out.println("Get out the sleds!");
        break;
    case SPRING:
        System.out.println("Get out the raincoat!");
        break;
    case SUMMER:
        System.out.println("Time to go to the pool");
        break;
    default:
        System.out.println("Is it summer yet?");
}


}
}
