/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3No1;

/**
 *
 * @author Rissfdh
 */
public class MatematikaInheritance {
    public static void main(String[] args) {
        
        Matematika2 matematika = new Matematika2();

        int a = 20;
        int b = 10;

        matematika.pertambahan(a, b);
        matematika.pengurangan(10,5);
        matematika.perkalian(10, 3);
        matematika.pembagian(21, 2);
        matematika.modulus(a, b);
    }
}
