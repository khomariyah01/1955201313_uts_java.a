/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_3;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class nim1955201313 {
     public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int ulang;
            System.out.println(" HELLO SELAMAT DATANG ");
            System.out.println("  SELAMAT BERBELANJA ");
            System.out.println("");
            System.out.println("DO HUB : 081234567899");
            System.out.println("   TOKO.SINAR ABADI ");
            System.out.println("JL. RAYA DLANGGU NO.123");
            System.out.println("-------------------------------");
            System.out.println("-------------------------------");
            System.out.println("");
            
            do
            {
                System.out.println("1. PISANG ORIGINAL");
                System.out.println("2. PISANG KEJU");
                System.out.println("3. PISANG COKLAT");
                System.out.println("4. PISANG BAKAR SPESIAL");
                System.out.println("");
          
                System.out.print("Masukan pilihan anda : ");
                int pilih = input.nextInt();
            
                
                int harga = 0;
            if (pilih == 1) 
            {
                    System.out.println("Pilihan anda : 1. PISANG ORIGINAL");
                    System.out.println("Harga        : Rp. 10000 ");
                    harga = 10000;
            }   
            else if(pilih == 2)
            {        System.out.println("Pilihan anda : 1. PISANG KEJU");
                    System.out.println("Harga        : 2. Rp. 15000");
                    harga = 15000;
            }
            else if(pilih == 3)
            {
                    System.out.println("Pilihan anda : 3. PISANG COKLAT");
                    System.out.println("Harga        : Rp. 15000");
                    harga = 10000;
            }
            else if(pilih == 4)
            {
                    System.out.println("Pilihan anda : 4. PISANG BAKAR SPESIAL");
                    System.out.println("Harga        : Rp. 20000");
                    harga = 20000;
            }
            else
            {
                    System.out.println("Pilihan tidak ada");
           
            }
                System.out.println("");
                System.out.println(("Masukan jumlah beli : "));
                int jumlahbeli = input.nextInt();
     
                
                int totalbayar = harga * jumlahbeli;
                System.out.print("Total             :"+totalbayar);
                
                System.out.println("");
                System.out.print("uang diterima          : ");
                int uang = input.nextInt();
                
                System.out.println("-----------------------------------");
                int kembalian = totalbayar - uang;
                
                System.out.println("");
                System.out.print("Apakah anda ingin mengulang ? [Y=1/N=0] ");
                ulang = input.nextInt();
                } 
                while(ulang == 1);
                System.out.println("");
                System.out.println("-----------------------------------");
                System.out.println("-----------TERIMA KASIH -----------");
            } 
}
