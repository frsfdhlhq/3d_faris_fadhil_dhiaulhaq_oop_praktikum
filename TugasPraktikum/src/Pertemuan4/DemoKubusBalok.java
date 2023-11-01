/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author Rissfdh
 */
public class DemoKubusBalok {
    public static void main(String[] args) {
        Perhitungan kubus = new Perhitungan(5);
        System.out.println("Volume Kubus: " + kubus.Volume());
        System.out.println("Luas Permukaan Kubus: " + kubus.LuasPermukaan());

        Balok balok = new Balok(4, 3, 2);
        System.out.println("Volume Balok: " + balok.Volume());
        System.out.println("Luas Permukaan Balok: " + balok.LuasPermukaan());
    }
}
