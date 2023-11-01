/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author Rissfdh
 */

public class Kubus extends Perhitungan{
    private double s;

    public Kubus(double s) {
        this.s = s;
    }

    @Override
    public double Volume() {
        //rumus volume kubus = sisi^3
        return s*s*s;
    }

    @Override
    public double LuasPermukaan() {
        //rumus luas permukaan kubus adalah 6*sisi^2
        return 6 * s * s;
    }
}
