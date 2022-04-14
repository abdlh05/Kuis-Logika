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
public class No4 {
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner input = new Scanner (System.in);
        System.out.print("Masukkan bilangan : ");
        int bil = input.nextInt();
        
        Random random = new Random();
        for(int i=1; i<=bil;i++){
            int out = random.nextInt(bil);
            System.out.print(out);
            
            if (out%2==0){
                System.out.print(" Genap, ");
            }else{
                System.out.print(" Ganjil, ");
            }
        }
    }
    
}
