/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocp;

/**
 * Penguin class
 * @author maxrenet
 */
public class OCP_composition {
    private final Flippers flippers;
    private final webbedFeet webbedFeet;
  public OCP_composition(){
      this.flippers=flippers;
      this.webbedFeet=webbedFeet;
  }
  public void flap(){
      this.flippers.flap();
      
  }
  public void kick(){
      this.webbedFeet.kick();
  }
}
