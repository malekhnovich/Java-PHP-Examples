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
class Animal{
int x=(int)25.2;
//public Animal(int x){
//this.x=x;
//}
public void move(){
      System.out.println("Animals can move");
   }
   public void crawl(){
       System.out.println ("Animals can crawl");
   }
   public void stand(){
      System.out.println("Animals can stand");
      
   }
}

class Dog extends Animal{

   public void move(){
      System.out.println("Dogs can walk and run");
   }
   public void bark(){
      System.out.println("Dogs can bark");
   }
   public void sit(){
       System.out.println("Dogs can sit");
   }
}
class Golden extends Dog{
public void crawl(){
    System.out.println("Golden retrievers can crawl");
}
}
class Labrador extends Animal {
    
}

public class TestDog{

   public static void main(String args[]){
      Animal a = new Animal(); // Animal reference and object
      //Animal b = new Dog(); // Animal reference but Dog object
     Golden c=new Golden();
     Animal d=new Golden();
     //Dog b=(Dog) new Animal();
     Animal a1=new Dog();
     a1.crawl();
     //Labrador xx=new Golden();
     d.crawl();
      c.crawl();
      a.crawl();
     // b.crawl();
      a.move();// runs the method in Animal class
      //b.stand();
      //b.move();//Runs the method in Dog class
      //b.bark();
   }
}