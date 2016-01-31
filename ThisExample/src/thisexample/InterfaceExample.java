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
 interface Animal2 {
    default public String identifyMyself() {
        return "I am an animal.";
    }
}
 interface EggLayer extends Animal2 {
    default public String identifyMyself() {
        return "I am able to lay eggs.";
    }
}
 interface FireBreather extends Animal2 { }
public class InterfaceExample implements EggLayer, FireBreather {
    public static void main (String... args) {
        InterfaceExample myApp =  new EggLayer();
        System.out.println(myApp.identifyMyself());
    }
}