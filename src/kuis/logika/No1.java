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
public class No1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan bilangan pertama : ");
        int bil1 = input.nextInt();
         System.out.print("Masukkan bilangan kedua : ");
        int bil2 = input.nextInt();
        
        int terbesar =(bil1>bil2)?bil1:bil2;
        
        System.out.println("bilangan terbesar dari angka " + bil1+" & "+bil2 + " adalah " + terbesar);
                
        
        
    }
    
}
