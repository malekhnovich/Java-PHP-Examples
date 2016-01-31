/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thisexample2;

/**
 *
 * @author maxrenet
 */
public class thisExample2 {

int id;
String name;

public thisExample2(int id, String name){
this.id=id;
this.name=name;
}
void display(){
    System.out.println(id+": "+name);
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
thisExample2 example=new thisExample2(111,"bill");
example.display();
    }
    
}
