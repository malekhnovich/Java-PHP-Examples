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
public class staticExample {
    int rollno;
    String name;
    static String college="NJIT";
    String color="white";
     
    staticExample(int r, String n){
        rollno=r;
        name=n;
    }
    public void display(){
        System.out.println("rollno: "+rollno+"name: "+name+"college: "+college);
    }
    public static void main(String[]args){
        staticExample person1=new staticExample(111,"get  87");
        staticExample person2=new staticExample(112,"get 100");
        person1.display();
        
        person1.college="FCU";
      //college="NJIT";
        this(red,blue);
        person2.display();
//does not output because you cant call an instance variable using a static method        
//System.out.println("The color is "+color);
    }
}
