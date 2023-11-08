/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5No1;

/**
 *
 * @author Rissfdh
 */

import java.util.Scanner;
public class TampilMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("NPM               : ");
        String npm = input.nextLine();
        
        System.out.print("Nama Mahasiswa    : ");
        String nama = input.nextLine();
        
        System.out.print("Nilai Kehadiran   : ");
        double nilHadir = input.nextDouble();
        
        System.out.print("Nilai Tugas       : ");
        double nilTugas = input.nextDouble();
        
        System.out.print("Nilai UTS         : ");
        double nilUTS = input.nextDouble();
        
        System.out.print("Nilai UAS         : ");
        double nilUAS = input.nextDouble();
     
        double nilAkhir = (0.10 * nilHadir) + (0.20 * nilTugas) + (0.30 * nilUTS) + (0.40 * nilUAS);

        String grade, keterangan;
        if (nilAkhir >= 76) {
            grade = "A";
            keterangan = "ISTIMEWA";
        } else if (nilAkhir >= 66) {
            grade = "B";
            keterangan = "BAIK";
        } else if (nilAkhir >= 56) {
            grade = "C";
            keterangan = "CUKUP";
        } else if (nilAkhir >= 46) {
            grade = "D";
            keterangan = "KURANG";
        } else {
            grade = "E";
            keterangan = "KURANG SEKALI";
        }

        System.out.println();
        System.out.println("NPM Mahasiswa   : " + npm);
        System.out.println("Nama Mahasiswa  : " + nama);
        System.out.println("Nilai Rata-rata : " + nilAkhir);
        System.out.println("Grade           : " + grade);
        System.out.println("Keterangan      : " + keterangan);
    }
}
