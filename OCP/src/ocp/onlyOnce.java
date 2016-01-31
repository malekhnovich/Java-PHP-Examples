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
public enum onlyOnce {
ONCE(true);
private OnlyOnce(boolean b){
    System.out.println("Constructing");
}
public static void main(String[]args){
    onlyOnce firstCall=OnlyOnce.ONCE;
    
}
}
