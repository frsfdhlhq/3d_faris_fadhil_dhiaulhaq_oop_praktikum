/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTSNo2;

/**
 *
 * @author Rissfdh
 */

import java.util.ArrayList;
import java.util.Scanner;

public class user extends pengguna {
    public user() {
        super("user");
    }

    @Override
    public void tindakan(ArrayList<buku> daftarBuku) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nPilihan Tindakan User:");
            System.out.println("1. Lihat Daftar Buku");
            System.out.println("2. Logout");
            System.out.println("3. Keluar Program");
            System.out.print("Masukkan nomor tindakan yang diinginkan: ");

            int pilihanUser = scanner.nextInt();
            scanner.nextLine();  // Membuang karakter newline setelah nextInt()

            switch (pilihanUser) {
                case 1:
                    // User dapat melihat daftar buku
                    lihatDaftarBuku(daftarBuku);
                    break;

                case 2:
                    System.out.println("Logout dari user.");
                    return;
                    
                case 3:
                    System.out.println("Keluar dari program.");
                    System.exit(0);

                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
    }

    public void lihatDaftarBuku(ArrayList<buku> daftarBuku) {
        System.out.println("Daftar Buku:");
        for (buku buku : daftarBuku) {
            buku.tampilInfo();
            System.out.println("_______________");
        }
    }
}
