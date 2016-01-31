/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author maxrenet
 */
public class JavaApplication5 {
final int speedLimit=90;
final void run(){
   speedLimit=300;
}
class Car extends JavaApplication5{
 //cant declare a constructor as final
 
}
class Bike extends JavaApplication5{
    //does not work because you cant redeclare a final variable
    /*final void run(){
        System.out.println("This should not work");
      */  
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      //  Bike ducati=new Bike();
//ducati.run(); 
        Car Maserati=new Car();
        Maserati.run();
        
    }
    
}
