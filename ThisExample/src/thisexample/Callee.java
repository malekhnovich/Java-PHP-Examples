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
class Caller{
    protected int size=2;
    private int i=6;
   public static  boolean b=false;
   public Caller(){
      System.out.println("calling parent constructor"); 
   }
    public Caller(int i){
        
      //  System.out.println("Caller");
    this.i=i;
    //System.out.println("The value of i is "+i);
    }
    public boolean isBiped(){
        return false;
    }
    public int getI(){
        return i;
    }
    public static boolean isTough(){
        return false;
    }
}
public class Callee extends Caller{
   public static boolean b=true;
    public Callee(int i){   
        
//super(5);
       // System.out.println("Callee");
    }
    public boolean isBiped(){
        return true;
    }
    public static boolean isTough(){
        return true;
    }
    public static String getName(){
        return "bill";
    }

    public static void main(String[]args){
       
        //Caller c=new Callee();
        Callee c=new Callee(4);
       // Callee d=(Callee)new Caller(5);
        Caller e=new Callee(6);
        Caller f=new Caller(7);
        System.out.println(c.getName());
        System.out.println("c is: "+c.isBiped());
       // System.out.println("x equals"+getI());
    //System.out.println("d is:"+d.isBiped());
    System.out.println("e is:"+e.isBiped());
    System.out.println("f is: "+f.isBiped());
    System.out.println("is c tough? "+c.isTough());
    System.out.println("is e tough? "+e.isTough());
    System.out.println("is f tough? "+f.isTough());
    System.out.println("boolean b equals: "+b);
    System.out.println("boolean b equals: "+Caller.b);
    Object s=("good");
    Object x=("good");
    StringBuilder s1=new StringBuilder("good");
    String s23=null;
    if(s.equals((Object)s1)){
        System.out.println("equals worked");
    }
    if(s.equals(x)&&s==x){
        System.out.println("Tom cough");
    }
    if(s23==null){
        System.out.println("hASDASDADSDSADASDASDASDSA");
    }
    //if(s==s1){
      //  System.out.println("alsom == works");
    //}
   // System.out.println("boolean b equals:" +super.b);
    }
}
