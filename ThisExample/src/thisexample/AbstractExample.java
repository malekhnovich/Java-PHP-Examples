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
 
    
    abstract class Abstraction{
        private String name;
        private String address;
        private int number;
        public Abstraction(String name, String address,int number){
        System.out.println("Constructing an employee");
            this.name=name;
            this.address=address;
            this.number=number;
        
        }
        public double computePay(){
            System.out.println("Inside employee computePay");
            return 0.0;
        }
        public void mailCheck(){
            System.out.println("Mailing a check to "+this.name+" "+this.address);
        }
        public String toString(){
            return name+" "+address+" "+number;
        }
        public String getName(){
            return name;
        }
        public String getAddress(){
            return address;
        }
        //cant instantiate an abstract class directly
        //public static void main(String[]args){
            
        }
    
        
        
    public class AbstractExample extends Abstraction{
        private double salary;
    public AbstractExample(String name, String address, int number) {
        super(name, address, number);
        setSalary(500);
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double newSalary){
        salary=newSalary;
    }
    
    
        
}
