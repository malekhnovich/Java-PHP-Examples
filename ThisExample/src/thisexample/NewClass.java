/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thisexample;

/**
 *
 * @author maxrenet
 */

    //void shrink();
    
    interface big{
        
        
       public default void grow(int i){
            
        }
        void shrink();
    }
public abstract class NewClass {
    abstract void turnRed();
   static void shrink(){
        System.out.println("shrunk");
    }
    static void grow(int i){
        System.out.println(i);
    }
public static void main(String[]args){
    System.out.println("fred");
    shrink();
    grow(2);

}    
}
 class main{
    
}