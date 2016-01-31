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
public class breakPractice {
public static void main(String[]args){
    int [][]list={{1,2,3},{2,3,13},{2,13,2}};
    int searchValue=13;
    int positionX=-1;
    int positionY=-1;
    PARENT_LOOP: for(int i=0;i<list.length;i++){
        MIDDLE_LOOP:for(int j=0;j<list[i].length;j++){
                if(list[i][j]==searchValue){
                    positionX=i;
                    positionY=j;
                   break MIDDLE_LOOP;
                }
            }
    }
    if(positionX==-1||positionY==-1){
        System.out.println("Value"+searchValue+" not found");
        
    }else{
        System.out.println("Value "+searchValue+" found at: "+"("+positionX+","+positionY+")");
    }
}    
}
