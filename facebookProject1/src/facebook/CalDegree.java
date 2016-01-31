
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facebook;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author mla
 */
public class CalDegree {
    
    ArrayList nodeName = new ArrayList();
    int[][] relationship = new int[1][1];
    double[] degree;
    
    private void loadInformation(String filename) throws FileNotFoundException, IOException {
        
        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);
        String line;
        Boolean getNodeInformation = false;
        Boolean getRelationshipInformation = false;

        //begin read information
        while ((line = br.readLine()) != null) {
            if (line.startsWith("*")) {// change the control parameter
                if (line.startsWith("*Vertices")) {
                    getNodeInformation = true;
                    getRelationshipInformation = false;
                }
                if (line.startsWith("*Edges")) {
                    getNodeInformation = false;
                    getRelationshipInformation = true;
                    relationship = 
                            new int[nodeName.size()][nodeName.size()];
                }
            } else {//update the related parameter
                if (getNodeInformation) {
                    String name = 
                            line.substring(line.indexOf(" ") + 1);
                    nodeName.add(name);
                }
                if (getRelationshipInformation) {
                    String[] index = line.split(" ");
                    relationship[Integer.parseInt(index[0]) - 1]
                            [Integer.parseInt(index[1]) - 1] = 1;
                    relationship[Integer.parseInt(index[1]) - 1]
                            [Integer.parseInt(index[0]) - 1] = 1;
                }
            }
        }
        //end read information 
/*
        for (int i = 0; i < nodeName.size(); i++) {
            System.out.print("," + nodeName.get(i));
        }
        System.out.print("\n");

        for (int i = 0; i < nodeName.size(); i++) {
            System.out.print(nodeName.get(i).toString());
            for (int j = 0; j < nodeName.size(); j++) {
                System.out.print(","+relationship[i][j]);
            }
            System.out.print("\n");
        }
        */
    }
    
    private void cal_degree() {
        degree = new double[nodeName.size()];
        for (int i = 0; i < nodeName.size(); i++) {
            for (int j = 0; j < nodeName.size(); j++) {
                degree[i] = degree[i] + relationship[i][j];
            }
        }

        //output result
        //for (int i = 0; i < nodeName.size(); i++) {
         //   System.out.println
           //         (nodeName.get(i) + ": " + degree[i]);
       // }
    }
    
    
    private int[] sort(double[] original_data) {
        double[] sorted_data = original_data.clone();
        int[] sorted_index = new int[sorted_data.length];
        for (int i = 0; i < sorted_data.length; i++) {
            sorted_index[i] = i;
        }
        for (int i = 0; i < sorted_data.length; i++) {
            double temp_value = sorted_data[i];
            int temp_index = sorted_index[i];
            for (int j = i + 1; j < sorted_data.length; j++) {
                if (temp_value < sorted_data[j]) {
                    //do the switch
                    sorted_data[i] = sorted_data[j];
                    sorted_index[i] = sorted_index[j];
                    sorted_data[j] = temp_value;
                    sorted_index[j] = temp_index;
                    temp_value = sorted_data[i];
                    temp_index = sorted_index[i];
                }
            }
        }
        
        return sorted_index;
    }
private double []sorted(double[] original_data){
  double[] sorted_data = original_data.clone();
        int[] sorted_index = new int[sorted_data.length];
        for (int i = 0; i < sorted_data.length; i++) {
            sorted_index[i] = i;
        }
        for (int i = 0; i < sorted_data.length; i++) {
            double temp_value = sorted_data[i];
            int temp_index = sorted_index[i];
            for (int j = i + 1; j < sorted_data.length; j++) {
                if (temp_value < sorted_data[j]) {
                    //do the switch
                    sorted_data[i] = sorted_data[j];
                    sorted_index[i] = sorted_index[j];
                    sorted_data[j] = temp_value;
                    sorted_index[j] = temp_index;
                    temp_value = sorted_data[i];
                    temp_index = sorted_index[i];
                }
            }
        }
        return sorted_data;
}

    private void showtop() {
        int[] sorted_index = sort(degree);
        double[]sorted_data=sorted(degree);
//  int max=sorted_index[0];
        System.out.println("------------------------------------");
        for (int i = 0; i <10; i++) {
            double temp_value=sorted_data[i];
        for(int j=i+1;j<sorted_data.length;j++) {
            if(temp_value < sorted_data[j]){
                sorted_data[i]=sorted_data[j];
                sorted_data[j]=temp_value;
                temp_value=sorted_data[i];
            }
        }
        
        //    for(int j=0;j<10;j++){
         //   if(sorted_index[i]>max){
          //      max=sorted_index[i];
          //      System.out.println(max);
           // }
        
            
            System.out.println(nodeName.get( sorted_index[i])+", "+sorted_data[i]);
            //System.out.println(sorted_index[i]+","+nodeName.get(sorted_index[i]));
        }
        }
        
          
   // }
        
    

    public static void main(String[] args) throws IOException {
        CalDegree newInstance = new CalDegree();
        newInstance.loadInformation("/Users/maxrenet/Documents/Friendship.net");
        newInstance.cal_degree();
        newInstance.showtop();
    }
    }



//"/Users/maxrenet/Documents/Friendship.net"

//"/Users/maxrenet/Documents/Friendship.net"
       /*
      Properties p = System.getProperties();
      Set<Object> keys = p.keySet(); 
      for(Object obj : keys) {
          String key = (String) obj;
          System.out.println("Key: " + key + " value: " + p.getProperty(key));
      }
      */
      /*
       System.out.println("classpath: " + System.getProperty("java.class.path", null));
      */
       
     
       
/*       
// find file on classpath
       InputStream in = calDegree1.getClass().getClassLoader().getResourceAsStream("Friendship.net");  
       // read file
       BufferedReader reader = new BufferedReader(new InputStreamReader(in));
       String line = reader.readLine();
       while(line != null){
         System.out.println(line);
         line = reader.readLine();
       }         
*/
       
       
//
       
       
    //   calDegree1.cal_degree();
   

