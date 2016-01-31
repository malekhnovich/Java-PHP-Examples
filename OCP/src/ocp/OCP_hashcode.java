/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocp;

/**
 *DECK OF CARDS
 * @author maxrenet
 */
public class OCP_hashcode {
    private String rank;
    private String suit;
    //MAKING SURE NEITHER INSTANCE VARIABLE IS NULL
    public OCP_hashcode(String r, String s){
        if(r==null||s==null){
            throw new IllegalArgumentException();
            
        }
        rank=r;
        suit=s;
    }
    public boolean equals(Object obj){
        if(!(obj instanceof OCP_hashcode)){
            return false;
        }
        OCP_hashcode c=(OCP_hashcode)obj;
        return rank.equals(c.rank)&&suit.equals(c.suit);
    }
    //ASKS THE RANK FOR THE HASHCODE AND USES THAT
    public int hashCode(){
        return rank.hashCode();
    }
}
