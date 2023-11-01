/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author Rissfdh
 */
class Perhitungan {
    protected double p;
    protected double l;
    protected double t;
    protected double s;

    public Perhitungan(double p, double l, double t) {
        this.p = p;
        this.l = l;
        this.t = t;
    }

    public Perhitungan(double s) {
        this.s = s;
    }

    public double Volume() {
        //Volume kubus
        return s*s*s;
    }

    public double LuasPermukaan() {
        //Luas Permukaan kubus
        return 6*s*s;
    }
}