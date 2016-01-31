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
 abstract class abstractExample{
    
}
public class thisExample {
    public abstractExample(){
        
    }
public thisExample(){
    
    
}

    int id;
String name;

public thisExample(int id, String name){
id=id;
name=name;
}
void display(){
    System.out.println(id+": "+name);
}
public static int sum(int x,int y){
   return x+y+10;
   
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//thisExample example1=new thisExample(111,"bill");
//example1.display();
   int sum=  sum(10,20);
    System.out.println(sum);
    }
    
}
