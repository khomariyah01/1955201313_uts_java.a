/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percabangan;

/**
 *
 * @author User
 */
public class percabangan_if_else {
    public static void main(String[]args){
        
        int nilai = 5;
        if(nilai>=4){
            System.out.println("Kamu naik kelas");
        if(nilai>=9){
            System.out.println("Nilai kamu A");
        }    else if(nilai>=7){
            System.out.println("Nilai kamu B");
        }   else if(nilai>=5)  {
            System.out.println("Nilai kamu C");
        }  else {
            System.out.println("Nilai kamu D");
        }
        
        
    }   else {
            System.out.println("Kamu tidak naik kelas");
            
            }
}
}
