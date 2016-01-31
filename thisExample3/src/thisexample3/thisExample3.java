/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thisexample3;

/**
 *
 * @author maxrenet
 */
public class thisExample3 {
    int id;
String name;

public thisExample3(int i, String n){
id=i;
name=n;
}
void display(){
    System.out.println(id+": "+name);
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
thisExample3 example=new thisExample3(111,"bill");
example.display();
    }
    
}

   
    

