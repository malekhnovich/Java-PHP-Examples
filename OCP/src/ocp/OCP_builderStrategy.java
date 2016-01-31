/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocp;

import java.util.List;

/**
 *BUILDER STRATEGY
 * FIXES ISSUE OF HAVING A CONSTRUCTOR THAT TAKES TOO MANY VALUES WHEN INITIALIZED
 * @author maxrenet
 */
//ANIMALBUILDER CLASS ON PAGE 87 BUILDER_PATTERN
public class OCP_builderStrategy {
    private String species;
    private int age;
    private List<String> favoriteFoods;

    private OCP_builderStrategy(String species, int age, List<String> favoriteFoods) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public OCP_builderStrategy setAge(int age){
        this.age=age;
        return this;
    }
    public OCP_builderStrategy setSpecies(String species){
        this.species=species;
        return this;
    }
    public OCP_builderStrategy setFavoriteFoods(List<String> favoriteFoods){
        this.favoriteFoods=favoriteFoods;
        return this;
    }
    public OCP_builderStrategy build(){
    return new OCP_builderStrategy(species,age,favoriteFoods);
}
}
