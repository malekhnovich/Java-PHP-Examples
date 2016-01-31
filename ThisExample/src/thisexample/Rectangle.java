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
public class Rectangle {
    private int x=32;
    private int y;
   public Integer xi=x;
   String s1=xi.toString();
   StringBuilder s2=new StringBuilder("32");
   
    
    private int width=77;
    private int height;
        
    public Rectangle() {
        //this(5, 0, 1, 1);
    }
    public Rectangle(int width, int height) {
        this(5, 0, width, height);
        this.width=width;
    }
    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
public static void main(String[]args){
    Rectangle r=new Rectangle(15,23,43,12);
   // r.x=25;
    r.y=24;
    System.out.println(r.x);
    System.out.println(r.y);
    r=new Rectangle();
    System.out.println(r.width);
    //System.out.println(r.width);
    //System.out.println(r.height);
   Rectangle z=r;
   z.x=13;
   z=new Rectangle(2093,22);
  
   //System.out.println(r.x);
   
    //System.out.println(z.x);
    
   System.out.println(r.x);
   System.out.println(z.width);
   //System.out.println(b1);
}
}    


