/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percabangan;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class percabangan_switch_case {
     public static void main(String[] args) {
        //membuat scanner
        Scanner input = new Scanner(System.in);

        System.out.println("nilai anda");
        int nilai = input.nextInt();

        //percabangan swithc case
        switch (nilai) {
            case 10:
                System.out.println("nilai anda adalah A+");
                break;
            case 9:
                System.out.println("nilai anda adalah A");
                break;
            case 8:
                System.out.println("nilai anda adalah B+");
                break;
            case 7:
                System.out.println("nilai anda adalah B");
                break;
            case 6:
                System.out.println("nilai anda adalah C+");
                break;
            case 5:
                System.out.println("nilai anda adalah C");
                break;
            case 4:
                System.out.println("nilai anda adalah D+");
                break;
            default:
                System.out.println("nilai anda adalah D");
            

        }
    }

}
