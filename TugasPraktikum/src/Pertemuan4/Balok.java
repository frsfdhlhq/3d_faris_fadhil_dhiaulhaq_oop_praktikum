/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author Rissfdh
 */

public class Balok extends Perhitungan{
    private double p, l, t;

    public Balok(double p, double l, double t) {
        this.p = p;
        this.l = l;
        this.t = t;
    }

    @Override
    public double Volume() {
        //rumus volume balok = p*l*t
        return p * l * t;
    }

    @Override
    public double LuasPermukaan() {
        //rumus luas permukaan balok = 2*(p*l + p*t + l*t)
        return 2 * (p * l + p * t + l * t);
    }
}
