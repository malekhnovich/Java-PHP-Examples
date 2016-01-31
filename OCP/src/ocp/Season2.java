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
public enum Season2{
    //SEMICOLON IS REQUIRED IF THERE IS SOMETHING IN THE ENUM BESIDES THE VALUES
    WINTER("Low"),SPRING("Medium"),SUMMER("High"),FALL("Medium");
    private String expectedVisitors;
    private Season2(expectedVisitors){
        this.expectedVisitors=expectedVisitors;
    }
    public void printExpectedVisitors(){
        System.out.println(expectedVisitors);
    }
}

