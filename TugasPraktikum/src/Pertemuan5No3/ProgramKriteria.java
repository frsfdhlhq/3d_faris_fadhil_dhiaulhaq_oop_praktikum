/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5No3;

/**
 *
 * @author Rissfdh
 */
import java.util.Scanner;

public class ProgramKriteria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan berat badan (kg) : ");
        double bb = input.nextDouble();
        System.out.print("Masukkan tinggi badan (m) : ");
        double tb = input.nextDouble();

        double rumusIMT = bb / (tb * tb);

        String kriteria;
        if (rumusIMT <= 18.4) {
            kriteria = "Berat Badan Kurang";
        } else if (rumusIMT <= 24.9) {
            kriteria = "Berat Badan Ideal";
        } else if (rumusIMT < 29.9) {
            kriteria = "Berat Badan Lebih";
        } else if (rumusIMT <= 39.9){
            kriteria = "Gemuk";
        } else {
            kriteria = "Sangat Gemuk";
        }

        // Tampilan Output
        System.out.println("IMT : " + rumusIMT);
        System.out.println("Kriteria : " + kriteria);
    }
}

