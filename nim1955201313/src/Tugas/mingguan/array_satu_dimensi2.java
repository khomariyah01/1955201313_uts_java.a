/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas.mingguan;

import javax.swing.JOptionPane ;

public class array_satu_dimensi2 {
    public static void main (String[]args){
    
      String namaMhs [] = new String [6]; 
       for(int i=0; i<namaMhs.length;i++){
          namaMhs[i] = JOptionPane.showInputDialog(null,"Masukkan nama mahasiswa ke " + i);
           System.out.println(namaMhs[i]);
       }
       String cariNama = JOptionPane.showInputDialog(null,"cari nama mahasiswa ");
        
        for(int i=0; i<namaMhs.length;i++){
            if (namaMhs[i].equals(cariNama)){
                JOptionPane.showMessageDialog(null,"Nama Yang Anda Cari Adalah"+cariNama + "Ketemu Pada Indeks ke " + i);
                
            }
        }     
   }
} 
