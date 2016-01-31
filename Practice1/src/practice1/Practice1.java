/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice1;

/**
 *
 * @author maxrenet
 */
public class Practice1 {
class Bank{
    int getRateOfInterest(){
        return 0;
    }
}
   class ICIC extends Bank{
       int getRateOfInterest(){
           return 5;
       }
   }
   class Sbi extends Bank{
       int getRateOfInterest(){
           return 2;
       }
   }
   class AXIS extends Bank{
       int getRateOfInterest(){
           return 8;
       }
       
   }
   


    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Bank b1=new Bank();
        Bank b2=new AXIS();
        Bank 
    }
    
}
