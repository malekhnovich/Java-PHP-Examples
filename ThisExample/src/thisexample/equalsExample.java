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
public class equalsExample {
    String name;
    double d1=0; 
//doesnt compile properly    
//double d1,d2=0;
    //doesnt compile
 //   double d, int x=0;
   int i1;
   int i2;
   boolean b1, b2;
  

   
   
 //NOT COMPILE  boolean b1,boolean b2;
    public equalsExample(){
        
    }
        public String getName(){
            return name;
        }
        public void setName(String newName){
            newName=name;
        }
    public static void main(String[]args){
        String s="hello";
        StringBuilder sb=new StringBuilder("hello");
        
        
        String s1=new String("hello");
        String s2=new String("hello");
        String s3="hello";
//cant be used to reference Strings and strinbuilders       
// if(s==sb){
        //    System.out.println("The == returned :"+);
      //  }
        int counter=0;
        
        int dayOfWeek=5;
        switch(dayOfWeek){
            default:
                System.out.println("Weekday");
                break;
            case 0:
                System.out.println("Sunday");
                break;
            case 6:
                System.out.println("Monday");
                break;
        }
     int [][] list={{1,13,5},{2,1,3},{4,2,1}};
   int searchValue=2;
   int positionX=2;
   int positionY=1;
   PARENT_LOOP: for(int i=0;i<list.length;i++){
    for(int j=0;j<list[i].length;j++){
        if(list[i][j]==searchValue){
            positionX=i;
            positionY=j;
            break PARENT_LOOP;
        }
    }    
        
    /*
        System.out.println("counter : "+counter);
        System.out.println("++counter: "+""+ ++counter);
        System.out.println("counter is :"+counter);
        System.out.println("counter-- :"+counter--);
        
        System.out.println(s.equals(sb));
        System.out.println("Checking with equals method on "+s.equals(s1));
        System.out.println("Checking with == on two strings"+s==s1);
        System.out.println("Checking with == on two  new strings"+s==s2);
        System.out.println("*******"+s2==s3);
        System.out.println(s==s3);
    */
            }
   if(positionX==-1||positionY==-1){
       System.out.println("Value "+searchValue+ " not found");
   }else{
       System.out.println("Value "+searchValue+"found at: "+"( "+positionX+", "+positionY);
   }
    }
}
