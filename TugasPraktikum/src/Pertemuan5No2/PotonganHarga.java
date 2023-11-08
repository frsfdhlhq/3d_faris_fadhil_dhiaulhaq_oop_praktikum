/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5No2;

/**
 *
 * @author Rissfdh
 */
import java.util.Scanner;
public class PotonganHarga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Total pembelian Rp. = ");
        double total = input.nextDouble();
        
        double potongan;
        if (total < 50000) {
            potongan = total * 0.05;
        } else {
            potongan = total * 0.20;
        }

        double bayar = total - potongan;

        System.out.println("Besarnya potongan Rp. " + potongan);
        System.out.println("Jumlah yang harus dibayarkan Rp. " + bayar);
    }
}
