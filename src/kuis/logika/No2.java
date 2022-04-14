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
public class No2 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan bilangan : ");
        int bil = input.nextInt();
        
        if(bil%2==0){
            System.out.println("angka "+bil+" itu GENAP");
        }else{
            System.out.println("angka "+bil+" itu GANJIL");
        }
        
                
        
        
    }
}
