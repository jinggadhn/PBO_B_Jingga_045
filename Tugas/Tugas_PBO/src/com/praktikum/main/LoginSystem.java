package com.praktikum.main;

import com.praktikum.users.Admin;
import com.praktikum.users.Mahasiswa;
import com.praktikum.users.User;

import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Admin admin = new Admin("Jingga", "045", "Admin045", "Password045");
        Mahasiswa mahasiswa = new Mahasiswa("Jingga", "202410370110045");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih login: ");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.println("3. Keluar");
        System.out.print("Masukkan pilihan: ");
        int pilih = scanner.nextInt();
        scanner.nextLine();

        User user = null;
        if (pilih == 1) {
            System.out.print("Masukkan username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan password: ");
            String pass = scanner.nextLine();
            if (admin.login(username, pass)) {
                admin.displayInfo();
                user = admin;
            } else {
                System.out.println("Login gagal! Username atau Password salah.");
            }
        } else if (pilih == 2) {
            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();
            if (mahasiswa.login(nama, nim)) {
                mahasiswa.displayInfo();
                user = mahasiswa;
            } else {
                System.out.println("Login gagal! Nama atau NIM salah.");
            }
        } else if (pilih == 3){
            System.out.println("Anda telah keluar dari program...");
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        // Polimorfisme: Memanggil displayAppMenu() berdasarkan role
        if (user != null) {
            user.displayAppMenu();
        }

        scanner.close();
    }
}