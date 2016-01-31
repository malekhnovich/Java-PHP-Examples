/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocp;

/**
 *SINGLETON PATTERN 
 * 
 * public class HayStoreage localed on page 77
 * @author maxrenet
 */
public class OCP_singleton {
 private int quantity=0;
 //constructors in SINGLETON pattern are private 
 //this is done to ensure that no other class is capable of instantiating another version of the class
 private OCP_singleton(){
     
 }
 //SINGLETON variables are declared as private static
 private static final OCP_singleton instance=new OCP_singleton();

 //SINGLETON variables are accessed with a public static method often called getInstance
 public static OCP_singleton getInstance(){
     return instance;
 }
 public synchronized void addHay(int amount){
     quantity+=amount;
     
     
 }
 public synchronized boolean removeHay(int amount){
     if(quantity<amount) {return false;}
     quantity-=amount;
     return true;
 }
 public synchronized int getHayQuantity(){
     return quantity;
 }


}
