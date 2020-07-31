/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas.mingguan;

import java.util.Scanner;


public class array_satu_dimensi {
     public static void main(String[]args){
    String[] nilai = new String[4];
    Scanner scan = new Scanner(System.in);
    for( int i = 0; i < nilai.length; i++){
        System.out.print("Nilai nya masuk kategori - " + i + ": "); 
        nilai[i] = scan.nextLine();
    }
        System.out.println("--------------------------------------------------");
        for( String b : nilai){
        System.out.println(b);
        }
    }
}
