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
public class StringvStringBuilder {
static String s1="hello";
static String string1=s1;
static String string2=new String("hello");
static StringBuilder s2=new StringBuilder("hello");
static StringBuilder s3=s2;
static StringBuilder s4=new StringBuilder("hello");

    public static void main(String[]args){
System.out.println("s2.equals(s3) :"+s2.equals(s3));
System.out.println("s1==string1"+s1==string1);
System.out.println("s1.equals(string1)"+s1.equals(string1));
System.out.println("s1.equals(string2)"+s1.equals(string2));
System.out.println("s1==s2"+s1==string2);
System.out.println("s1.equals(s2): "+s1.equals(s2));
System.out.println("string2.equals(s2): "+string2.equals(s2));
System.out.println("s1.equals(s2.toString() :"+s1.equals(s2.toString()));
System.out.println("s1==s2.toString()"+s1==s2.toString());
System.out.println("s2.equals(s4)"+s2.equals(s4));
System.out.println(s2==s4);
System.out.println(s2==s3);
System.out.println(s3==s2);
System.out.println(s2==s4);

}    
}
