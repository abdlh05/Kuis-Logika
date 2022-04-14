/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis.logika;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apple
 */
public class No5 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int[] bil = new int [100];
        int max=0;
        
        System.out.print("Masukkan banyak bilangan = ");
        int in = input.nextInt();
        
        for (int i=1; i<=in;i++){
            System.out.print("Bilangan "+i+" = ");
            bil[i] = input.nextInt();
            
            
            if(bil[i]>max){
                max = bil[i];
            }
        }
        System.out.println(" ");
        for (int i=1; i<=in;i++){
        System.out.print(bil[i]+" ");
        }
        System.out.println(" ");
        System.out.println("Bilangan Tertinggi = "+max);
        
        
        
        
        
        
  
    }
}
