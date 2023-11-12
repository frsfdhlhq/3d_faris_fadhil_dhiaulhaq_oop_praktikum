/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTSNo1;

/**
 *
 * @author Rissfdh
 */
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        // Deklarasi scanner agar dapat meminta inputan
        Scanner scanner = new Scanner(System.in);

        Kucing miaw = new Kucing();
        Anjing aug = new Anjing();
        
        // Meminta inputan jenis hewan
        System.out.print("Masukkan jenis hewan (Kucing/Anjing): ");
        String jenisHewan = scanner.nextLine();

        // Percabangan if-else, serta menggunakan method equalsIgnoreCase
        // agar saat membandingkan string tidak memperdulikan huruf kapital/tidak
        if ("Kucing".equalsIgnoreCase(jenisHewan)) {
            
            System.out.println("Hewan yang anda pilih adalah ["+jenisHewan+"]");      
            System.out.print(jenisHewan + " bersuara ");
            miaw.bersuara();
            
            // Memeriksa apakah Kucing adalah mamalia atau bukan dengan mengecek boolean mamalia
            // jika method boolean di class Kucing mengembalikan true, maka kucing adalah mamalia
            if (miaw.Mamalia()) {
                System.out.println(jenisHewan + " adalah mamalia.");
            } else {
                System.out.println(jenisHewan + " bukan mamalia.");
            }
            
        // Kurang lebih sama seperti sebelumnya
        } else if ("Anjing".equalsIgnoreCase(jenisHewan)) {
            
            System.out.println("Hewan yang anda pilih adalah ["+jenisHewan+"]");
            System.out.print(jenisHewan + " bersuara ");
            aug.bersuara();
            
            //Memeriksa apakah Anjing adalah mamalia atau bukan
            if (aug.Mamalia()) {
                System.out.println(jenisHewan + " adalah mamalia.");
            } else {
                System.out.println(jenisHewan + " bukan mamalia.");
            }
            
        } else {
            
            System.out.println("Pilih hewan antara Kucing/Anjing saja!.");
            
        }
    }
}