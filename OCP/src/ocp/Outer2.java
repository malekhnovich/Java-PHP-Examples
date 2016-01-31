/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocp;

/**
 *
 * @author maxrenet
 */
public class Outer2 {
private int length=5;
public void calculate(){
    final int width=20;
    class Inner{
        public void multiply(){
            System.out.println(length*width);
        }
    }
    Inner inner=new Inner();
    inner.multiply();
}
public static void main(String[]args){
    Outer2 outer=new Outer2();
    outer.calculate();
    Integer x=0;
    Object y=0;
    
}
}
