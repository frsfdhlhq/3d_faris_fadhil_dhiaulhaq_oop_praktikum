/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan2No2;

/**
 *
 * @author Rissfdh
 */

public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika math = new Matematika();

        System.out.println("Pertambahan : " + 20 + " + " + 10 + "  = " + math.pertambahan(20,10));
        System.out.println("Pengurangan : " + 10 + " - " + 5  + "   = " + math.pengurangan(10,5));
        System.out.println("Perkalian   : " + 10 + " * " + 3  + "   = " + math.perkalian(10,3));
        System.out.println("Pembagian   : " + 21 + " / " + 2  + "   = " + math.pembagian(21,2));
    }
}