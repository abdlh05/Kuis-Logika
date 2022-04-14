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
public class No6 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int[] bil = new int [100];
        int a = 0;
        System.out.print("Masukkan target bilangan = ");
        int k = input.nextInt();
        
        System.out.print("Masukkan banyak bilangan = ");
        int in = input.nextInt();
        
        for (int i=1; i<=in;i++){
            System.out.print("Bilangan "+i+" = ");
            bil[i] = input.nextInt();
        }
        
        for (int i=1; i<=in;i++){
            for(int j=1;j<=in;j++){
                if(bil[i]+bil[j]==k){
                   a=1; 
                }
            }
        }
        
        System.out.println(" ");
        if(a==1){
            System.out.print("Bisa ");
        }else{
            System.out.print("Tidak Bisa ");
        }
    }
}
