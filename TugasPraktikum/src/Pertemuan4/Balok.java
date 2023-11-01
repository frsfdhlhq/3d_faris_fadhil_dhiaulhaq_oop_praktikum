/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author Rissfdh
 */
class Balok extends Perhitungan {
    public Balok(double p, double l, double t) {
        super(p, l, t);
    }

    @Override
    public double Volume() {
        //Volume balok
        return p*l*t;
    }

    @Override
    public double LuasPermukaan() {
        //Luas Permukaan balok
        return 2*(p*l+p*t+l*t);
    }
}