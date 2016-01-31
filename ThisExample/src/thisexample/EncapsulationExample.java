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
public class EncapsulationExample {
    private int ssn;
    private String empName;
    private int empAge;
    
    //getter and setter methods
    public int getEmpSSN(){
        return ssn;
    }
    public String getEmpName(){
        return empName;
    }
    public int getEmpAge(){
        return empAge;
    }
    public void setEmpSSN(int newVal){
        ssn=newVal;
    }
    public void setEmpName(String newVal){
        empName=newVal;
    }
    public void setAge(int value){
        empAge=value;
    }
    public static void main(String[]args){
        EncapsulationExample bill=new EncapsulationExample();
        bill.setEmpName("Mr.Fred");
        bill.setEmpSSN(122213213);
        bill.setAge(35);
        System.out.println("bill's age is: "+bill.getEmpAge());
        System.out.
    
    }
    
}
