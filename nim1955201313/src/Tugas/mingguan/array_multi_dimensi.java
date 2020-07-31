/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas.mingguan;

import java.util.Scanner;


public class array_multi_dimensi {
    public static void main(String[]args){
        
        String[][] meja = new String[2][3];
        Scanner scan = new Scanner (System.in);
        
        for(int bar = 0; bar < meja.length; bar++){
            for(int kol = 0; kol < meja[bar].length; kol++){
                System.out.format("Siapa yang memilih meja (%d,%d): ", bar, kol);
                meja[bar][kol] = scan.nextLine();     
            }
        }
        System.out.println("--------------------------------------------------");
        for(int bar = 0; bar < meja.length; bar++){
            for(int kol = 0; kol < meja[bar].length; kol++){
                System.out.format("| %s | \t", meja[bar][kol]);
            }
            System.out.println("");
        }
        System.out.println("--------------------------------------------------");
        
    }
}


