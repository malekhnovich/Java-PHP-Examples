/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maxrenet
 */
public class Example8{
   static int Var1=77; //Static integer variable
   static String Var2;//non-static string variable

   public  static  void main(String args[])
   {
    int x=23;
    
       Example8 ob1 = new Example8();
      Example8 ob2 = new Example8();
      ob1.Var1=88;
      ob1.Var2="I'm Object1";
      ob2.Var2="I'm Object2";
      x=Var1;
      ob2.Var1=33;
      double primitive=Integer.parseInt("123");
      int i=(int)primitive;
      double xd=i;
      Double xs=xd;
      
      System.out.println(primitive);
      System.out.println("ob1 integer:"+ob1.Var1);
      System.out.println("ob1 String:"+ob1.Var2);
      System.out.println("ob2 integer:"+ob2.Var1);
      System.out.println("ob2 STring:"+ob2.Var2);
   System.out.println("x is "+x);
   }
}