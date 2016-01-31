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
public class OCPequals2 {
    private int idNumber;
    private int age;
    private String name;
    public OCPequals2(int idNumber, int age, String name){
        this.idNumber=idNumber;
        this.age=age;
        this.name=name;
    }
    @Override public boolean equals(Object obj){
        if(!(obj instanceof OCPequals2)){
            return false;
        }
        OCPequals2 other=(OCPequals2)obj;
        return this.idNumber==other.idNumber;
    }
    public static void main(String[]args){
        OCPequals2 o=new OCPequals2(4,5,"steve");
        //ONLY CHECKS TO SEE IF THEY HAVE THE SAME ID NUMBER AND RETURNS TRUE IF THEY DO
        OCPequals2 a=new OCPequals2(5,6,"shlomo");
        boolean b=o.equals(a);
        System.out.println(b);
    }
}
