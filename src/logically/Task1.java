/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logically;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int angka1, angka2 = 0;
      
        System.out.println("Masukkan nilai 1 = ");
        angka1 = input.nextInt();
        System.out.println("Masukkan nilai 2 = ");
        angka1 = input.nextInt();
        
        if(angka1>angka2){
            System.out.println("Nilai Terbesar : " + angka1);
        }else{
            System.out.println("Nilai Terbesar : " + angka2);
        }
        
    }
}
