/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocp;

import java.util.ArrayList;
import java.util.List;

/**
 *IMMUTABLE STRATEGY
 * ANIMAL class page 84
 * @author maxrenet
 */
public class OCP_immutableStrategy {
    //MAKING A CLASS IMMUTABLE
        //1. ALL FIELDS MUST BE MARKED PRIVATAE AND FINAL
        //2. CLASS IS MARKED FINAL AND THERE ARE NO SETTER METHODS, SO THE METHODS CANT BE OVERRIDEN BY SUBCLASSES
        //3. ALTHOUGH THE CLASS CONTAINS A MUTABLE OBJECT, LIST, THERE IS NO REFERENCES TO THE OBJECT PUBLICLY AVAILABLE
        
    private final String species;
    private final int age;
    private final List<String> favoriteFoods;
    
    public OCP_immutableStrategy(String species, int age, List<String> favoriteFoods){
        this.species=species;
        this.age=age;
        if(favoriteFoods==null){
            throw new RuntimeException("favorite foods is required");
        }
        this.favoriteFoods=new ArrayList<String>(favoriteFoods);
    }
    public String getSpecies(){
        return species;
    }
    public int getAge(){
        return age;
    }
    public int getFavoriteFoodsCount(){
        return favoriteFoods.size();
    }
    public String getFavoriteFood(int index){
        return favoriteFoods.get(index);
    }
}
