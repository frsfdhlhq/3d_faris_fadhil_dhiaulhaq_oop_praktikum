/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTSNo2;

/**
 *
 * @author Rissfdh
 */
import java.util.Scanner;
import java.util.ArrayList;

public class admin extends pengguna {
    public admin() {
        super("admin");
    }

    @Override
    public void tindakan(ArrayList<buku> daftarBuku) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nPilihan Tindakan Admin:");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Lihat Daftar Buku");
            System.out.println("3. Hapus Buku");
            System.out.println("4. Logout");
            System.out.println("5. Keluar Program");
            System.out.print("Masukkan nomor tindakan yang diinginkan: ");

            int pilihanAdmin = scanner.nextInt();
            scanner.nextLine();  // Membuang karakter newline setelah nextInt()

            switch (pilihanAdmin) {
                case 1:
                    // Meminta input jenis genre (Fiksi/Non-Fiksi)
                    while(true){
                        System.out.print("Masukkan jenis genre (1. Fiksi / 2. Non-Fiksi): ");
                        int pilihanGenre = scanner.nextInt();
                        scanner.nextLine();  // Membuang karakter newline setelah nextInt() agar menghindari error

                        if (pilihanGenre == 1|| pilihanGenre == 2){
                                System.out.print("Masukkan judul buku: ");
                                String judul = scanner.nextLine();
                                System.out.print("Masukkan penulis buku: ");
                                String penulis = scanner.nextLine();
                                
                                String jenisGenre;
                                if (pilihanGenre == 1) {
                                    jenisGenre = "Fiksi";
                                } else {
                                    jenisGenre = "Non-Fiksi";
                                }

                                buku buku = new buku(judul, penulis, jenisGenre);
                                
                                tambahBuku(buku, daftarBuku);
                                break;
                        }else{
                            System.out.println("Pilihan Genre tidak sesuai");
                            break;
                        }
                    }
                    break;

                case 2:
                    // Admin dapat melihat daftar buku
                    lihatDaftarBuku(daftarBuku);
                    break;

                case 3:
                    // Meminta input judul buku yang ingin dihapus
                    System.out.print("Masukkan judul buku yang ingin dihapus: ");
                    String judulBuku = scanner.nextLine();

                    // Admin dapat menghapus buku
                    hapusBuku(judulBuku, daftarBuku);
                    break;

                case 4:
                    System.out.println("Kembali ke menu login.");
                    return;
                    
                case 5:
                    System.out.println("Keluar dari program.");
                    System.exit(0);

                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
    }

    public void tambahBuku(buku buku, ArrayList<buku> daftarBuku) {
        daftarBuku.add(buku);
        System.out.println("Buku berhasil ditambahkan.");
    }

    public void hapusBuku(String judul, ArrayList<buku> daftarBuku) {
        for (buku buku : daftarBuku) {
            if (buku.judul.equals(judul)) {
                daftarBuku.remove(buku);
                System.out.println("Buku berhasil dihapus.");
                return;
            }
        }
        System.out.println("Buku tidak ditemukan.");
    }

    public void lihatDaftarBuku(ArrayList<buku> daftarBuku) {
        System.out.println("Daftar Buku:");
        for (buku buku : daftarBuku) {
            buku.tampilInfo();
            System.out.println("_______________");
        }
    }
}
