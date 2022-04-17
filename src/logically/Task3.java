package logically;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
        int bil;
        int total = 0;
        
        System.out.println("Masukkan bilangan : ");
        bil = input.nextInt();
        
        for(int i = 1; i <= bil; i++){
            if(bil == i){
                System.out.print(i);
            }else{
                System.out.print(i+" + ");
            }
            total += i;
        }
        System.out.print(" = "+total);
    }
}

