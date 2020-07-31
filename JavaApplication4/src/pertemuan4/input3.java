/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class input3 {
    public static void main(String[] args){
        Scanner masukan = new Scanner(System.in);
        System.out.println("masukan Nama anda : ");
        String Nama = masukan.nextLine();
        System.out.println("nim anda : ");
        String nim = masukan.nextLine();
        System.out.println("alamat anda : ");
        String alamat = masukan.nextLine();
        System.out.println("prodi anda");
        String prodi = masukan.nextLine();
        System.out.println("absen anda");
        String absen = masukan.nextLine();
        System.out.println("Nama yang anda masukkan adalah"+ Nama);
        
        
        
}
}