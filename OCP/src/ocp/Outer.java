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
public class Outer {
private String greeting="hello";

//NOT STATIC SO MUST BE USED WITH AN ISTANCE OF THE OUTER CLASS
protected class Inner{
    public int repeat=3;
    public void go(){
        for(int i=0;i<repeat;i++){
            System.out.println(greeting);
        }
    }
}
//INNER CLASS IS NOT STATIC SO NEEDS TO INCORPORATE METHOD WITH INSTANCE OF OUTER CLASS
public void callInner(){
    Inner inner=new Inner();
    inner.go();
}
public static void main(String[]args){
    Outer outer=new Outer();
    outer.callInner();
}
}


