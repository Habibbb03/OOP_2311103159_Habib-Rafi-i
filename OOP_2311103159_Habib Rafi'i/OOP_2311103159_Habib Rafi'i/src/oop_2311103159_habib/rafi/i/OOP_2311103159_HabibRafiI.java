/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop_2311103159_habib.rafi.i;

import java.util.Scanner;

/**
 *
 * @author asus 
 */
public class OOP_2311103159_HabibRafiI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KomputerVIP komputerVIP = new KomputerVIP(20, "PitoyoNet", 5000);
        
        System.out.print("Masukkan username: ");
        String username = scanner.nextLine();

        System.out.print("Apakah Anda Member VIP? (true/false): ");
        boolean isVip = scanner.nextBoolean();
        
        komputerVIP.login(username, isVip);
        System.out.print("Masukkan durasi bermain (jam): ");
        int jam = scanner.nextInt();

        System.out.print("Masukkan tambahan waktu billing (jam): ");
        int tambahanJam = scanner.nextInt();

        System.out.print("Masukkan tambahan waktu billing (menit): ");
        int tambahanMenit = scanner.nextInt();

        komputerVIP.bermain(jam);
        komputerVIP.bermain(tambahanJam, tambahanMenit);

        System.out.println("\n========================================");
        komputerVIP.informasi();
        
        KomputerPremium komputerPremium = new KomputerPremium(10, "PitoyoNet", 10000);
        System.out.print("\nApakah Anda ingin memesan ruangan premium? (true/false): ");
        boolean isPremium = scanner.nextBoolean();
        
        komputerPremium.pesanRuang(isPremium);

        System.out.println("\n========================================");
        komputerPremium.informasi();

        scanner.close();
    }
}
