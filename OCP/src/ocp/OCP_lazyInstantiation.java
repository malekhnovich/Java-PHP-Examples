/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocp;

/**
 * LAZY INSTANTIATION 
 * VisitorTicketTracker class page 79
 * @author maxrenet
 */
public class OCP_lazyInstantiation {
    //SINGLETON VARIABLES are declared as private static
    private static OCP_lazyInstantiation instance;
    //SINGLETON CONSTRUCTORS ARE MARKED PRIVATE
    //THIS IS DONE TO ENSURE THAT NO OTHER CLASS IS CAPABLE OF INSTANTIATING ANOTHER VERSION OF THE CLASS
    private OCP_lazyInstantiation(){
        
    }
    public static OCP_lazyInstantiation getInstance(){
       if(instance==null){
           instance=new OCP_lazyInstantiation(); //NOT THREADSAFE
       }
       return instance;
    }
    //data acess methods
}

