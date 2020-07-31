/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;




public class input2 {
 public static void main(String[]args){
     BufferedReader dataInput = new BufferedReader(new InputStreamReader(System.in));
     String Nama = "";
     String Nim = "";
     String Alamat = "";
     String Prodi = "";
     String Absen = "";
     try {
        System.out.print("Nama Anda Adalah : "); 
        Nama = dataInput.readLine();
        System.out.print("Nim Anda Adalah : ");
        Nim = dataInput.readLine();
        System.out.print("Alamat anda ada dimana : ");
        Alamat = dataInput.readLine();
        System.out.print("Prodi anda adalah : "); 
        Prodi = dataInput.readLine();
        System.out.println("Absen anda adalah : ");
        Absen = dataInput.readLine();
         String Sekolah = dataInput.readLine();
} catch (IOException e){
}
    
}
}
        


