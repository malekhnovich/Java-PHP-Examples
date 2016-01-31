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
class Super {
    int size=2;
}
class Sub extends Super {
    String color="blue";
  public void writeLog() {
    System.out.println("log");
}
}
public class Sup {
    public static void main(String[] args) {
      Sub b = new Sub();
      // sub type reference can be assigned to super type without casting      
      Super a = b; 
     // super type reference has to be casted before assigned to sub type
    b = (Sub)a;
   Sub c=new Sub();
    //sub c=(Super)b;
      ((Sub)a).writeLog(); // method only defined in sub type
      
      b.writeLog();
      System.out.println();
      System.out.println(b.size);
      System.out.println(a.size);
      
      
      //c.writeLog();
    }
}