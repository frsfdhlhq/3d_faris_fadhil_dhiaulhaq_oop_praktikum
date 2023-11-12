/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTSNo1;

/**
 *
 * @author Rissfdh
 */
public class Kucing extends Hewan{
    String jenisSuara = "Meong";
    
    @Override
    public void bersuara(){
        System.out.println(jenisSuara);
    }

    @Override
    public boolean Mamalia() {
        return true;
    }
}