/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis.logika;

import java.util.Scanner;

/**
 *
 * @author apple
 */
public class No7 {
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
        int[] bil = new int [100];
        int a = 0;
        
        System.out.print("Masukkan banyak bilangan = ");
        int in = input.nextInt();
        
        for (int i=1; i<=in;i++){
            System.out.print("Bilangan "+i+" = ");
            bil[i] = input.nextInt();
        }
        
        for (int i=1; i<=in;i++){
            for(int j=i+1;j<=in;j++){
                if(bil[i]==bil[j]){
                   a=1; 
                }
            }
        }
        
        System.out.println(" ");
        if(a==1){
            System.out.println("ada ");
        }else{
            System.out.println("Tidak ada ");
        }
        
    }
}
