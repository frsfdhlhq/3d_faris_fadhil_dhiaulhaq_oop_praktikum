/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTSNo2;

/**
 *
 * @author Rissfdh
 */

// main.java
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // Inisialisasi objek daftar buku
        ArrayList<buku> daftarBuku = new ArrayList<>();

        // Meminta input jenis pengguna (admin atau user)
        Scanner scanner = new Scanner(System.in);
       
        while (true){
            System.out.println("\nPilih Jenis Pengguna:");
            System.out.println("1. Admin");
            System.out.println("2. User");
            System.out.println("3. Keluar Program");
            System.out.print("Masukkan nomor jenis pengguna yang diinginkan: ");

            int jenisPengguna = scanner.nextInt();
            scanner.nextLine();  // Membuang karakter newline setelah nextInt()

            pengguna pengguna;

            
            switch (jenisPengguna) {
                case 1:
                    pengguna = new admin();
                    break;
                case 2:
                    pengguna = new user();
                    break;
                case 3:
                    System.out.println("Keluar dari program.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid.");
                    continue;
            }

        // Memanggil metode tindakan sesuai dengan jenis pengguna
        pengguna.tindakan(daftarBuku);
        }
    }
}
