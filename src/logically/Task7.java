/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logically;

/**
 *
 * @author Elia Sari
 */
public class Task7 {
    static boolean cp(int array[], int n){
       
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                
                if(array[i] == array[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main (String[]args){
        int array[] = {4,3,6,7,1};
        int n = array.length;
        
        if(cp(array,n)){
            System.out.println("ADA");
        }else{
            System.out.println("TIDAK ADA");
        }
        
     
    }
}
