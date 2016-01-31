/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thisexample;

import static thisexample.blue.x;

/**
 *
 * @author maxrenet
 */ 
interface blue{
    int x=3;
    void goHome(int z);
    
}
public class orderOfInitialization implements blue{
   // x=4;
    private static int COUNT=0;
    public void goHome(int x){
        return;
    }
    static{
     System.out.println(COUNT);
    }
    private static String name="jack";
    {System.out.println(name);}
    
    {COUNT++; System.out.println(COUNT);}
   public orderOfInitialization(){
       System.out.println("constructor");
   }
   
   public static void main(String[]args){
       System.out.println("name: "+name);
       System.out.println("printing");
       new orderOfInitialization();
       System.out.println("print now");
   }
    }

