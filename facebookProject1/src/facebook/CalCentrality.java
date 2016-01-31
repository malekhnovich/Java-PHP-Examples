/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facebook;

/**
 *
 * @author maxrenet
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Arrays.sort;

/**
 *
 * @author mla23
 */
public class CalCentrality {
    
    ArrayList nodeName = new ArrayList();
    int[][] relationship = new int[1][1];
    double[] degree;
    int[][] shortestLength;
    double[] closeness;
    
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

        for (int i = 0; i < nodeName.size(); i++) {
            System.out.print("," + nodeName.get(i));
        }
        System.out.print("\n");

        for (int i = 0; i < nodeName.size(); i++) {
         //   System.out.print(nodeName.get(i).toString());
            for (int j = 0; j < nodeName.size(); j++) {
         //       System.out.print(","+relationship[i][j]);
            }
            System.out.print("\n");
        }
    }
    
    private void cal_degree() {
        degree = new double[nodeName.size()];
        for (int i = 0; i < nodeName.size(); i++) {
            for (int j = 0; j < nodeName.size(); j++) {
                degree[i] = degree[i] + relationship[i][j];
            }
        }

        //output result
        for (int i = 0; i < nodeName.size(); i++) {
          //  System.out.println
             //       (nodeName.get(i) + ": " + degree[i]);
        }
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

    private void showtop() {
        int[] sorted_index = sort(degree);
        System.out.println("--------------------------");
        for(int i=0;i<10;i++){
            int temp=sorted_index[i];
        
        for(int j=i+1;j<sorted_index.length;j++){
            if(temp>sorted_index[j]){
                sorted_index[i]=sorted_index[j];
                sorted_index[j]=temp;
                temp=sorted_index[j];
                
            }
        }
         // System.out.println(nodeName.get(sorted_index[i])+","+degree[sorted_index[i]]);
    }
        //for (int i = 0; i < nodeName.size(); i++) {
          
       // }
    }
    
    private int[][] searchShortestPath(int[][] relationship) {
        int[][] length = new int[nodeName.size()][nodeName.size()];
        for (int i = 0; i < nodeName.size(); i++) {
            for (int j = 0; j < nodeName.size(); j++) {
                if (i == j) {
                    length[i][j] = 0;
                } else {
                    length[i][j] = nodeName.size() * nodeName.size();
                }
            }
        }
        
        Boolean continueLoop = true;
        //int count = 0;
        while (continueLoop) {
            //System.out.println("The "+count+++"th round");
            continueLoop = false;
            for (int p = 0; p < nodeName.size(); p++) {
                for (int q = 0; q < nodeName.size(); q++) {
                    if (relationship[p][q] == 1) {
                        //propogate p-th information to update q
                        for (int r = 0; r < nodeName.size(); r++) {
                            if (length[p][r] + 1 < length[q][r]) {
                                //update the q's path to r
                                continueLoop = true;
                                length[q][r] = length[p][r] + 1;
                            }
                        }
                    }
                }
            }
        }
        
        //output
       // System.out.println("Matrix of shortest path:");
        for (int i = 0; i < nodeName.size(); i++){
            for (int j = 0; j < nodeName.size(); j++) {
          //      System.out.print(length[i][j] + ",");
            }
            System.out.print("\n");
        }
        return length;
    }

    private void cal_closeness() {
        
          closeness = new double[nodeName.size()];
        for (int i = 0; i < nodeName.size(); i++) {
            for (int j = 0; j < nodeName.size(); j++) {
                closeness[i] = closeness[i] + shortestLength[i][j];
            }
        }
for (int i = 0; i <10; i++) {
            double temp_value = closeness[i];
            int temp_index = (int) closeness[i];
            for (int j = i + 1; j < closeness.length; j++) {
                if (temp_value > closeness[j]) {
                    //do the switch
                    closeness[i] = closeness[j];
                    closeness[j] = temp_value;
                    temp_value= closeness[i];
                    
            
        }
        }
            System.out.println(nodeName.get(i)+""+closeness[i]);
        }
   
    }
          
            
    
    
    public static void main(String[] args) throws IOException {
        CalCentrality newInstance = new CalCentrality();
        newInstance.loadInformation("/Users/maxrenet/Documents/Friendship.net");
       // newInstance.cal_degree();
        //newInstance.showtop();
        newInstance.shortestLength = newInstance.searchShortestPath(newInstance.relationship);
        newInstance.cal_closeness();
        
    }
    }

        
    

