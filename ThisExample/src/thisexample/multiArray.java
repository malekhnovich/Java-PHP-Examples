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
public class multiArray {
    
    public static void main(String[] args) throws Exception {
        String[][] members = new String[2][4];

        members[0][0] = "Celeste";    // Member of the First List
        members[0][1] = "Mathurin";   // Member of the First List
        members[0][2] = "Alex";       // Member of the First List
        members[0][3] = "Germain";    // Member of the First List
        members[1][0] = "Jeremy";     // Member of the Second List
        members[1][1] = "Mathew";     // Member of the Second List
        members[1][2] = "Anselme";    // Member of the Second List
        members[1][3] = "Frederique"; // Member of the Second List
for(int i=0;i<members.length;i++){
    for(int x=0;x<members[i].length;x++){
    System.out.println(members[i][x]);
}        
    }
}
}
