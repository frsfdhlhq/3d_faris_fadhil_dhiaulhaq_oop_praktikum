/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan6No1;

/**
 *
 * @author Rissfdh
 */
public class AnakAyam {
    public static void main(String[] args) {
        
        System.out.println("===  Perulangan For ===");
        for (int i = 5; i >= 1; i--) {
            System.out.println("Tek kotek kotek kotek anak ayam turun  " + i + ", mati satu tinggallah " + (i - 1));
        }
      
        System.out.println("\n===  Perulangan While ===");
        int j = 5;
        while (j >= 1) {
            System.out.println("Tek kotek kotek kotek anak ayam turun   " + j + ", mati satu tinggallah " + (j - 1));
            j--;
        }

        System.out.println("\n===  Perulangan Do-While ===");
        int k = 5;
        do {
            System.out.println("Tek kotek kotek kotek anak ayam turun  " + k + ", mati satu tinggallah " + (k - 1));
            k--;
        } while (k >= 1);
    }
}