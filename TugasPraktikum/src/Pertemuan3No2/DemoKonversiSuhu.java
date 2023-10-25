/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3No2;

/**
 *
 * @author Rissfdh
 */
public class DemoKonversiSuhu {
    public static void main(String[] args) {
        
    KonversiSuhu2 Konversi = new KonversiSuhu2();
    
    double Celcius = 20;
    Konversi.celciusToFahrenheit(Celcius);
    Konversi.celciusToReamur(Celcius);
    
    double Fahrenheit = 20;
    Konversi.fahrenheitToReamur(Fahrenheit);
    
    }
}
