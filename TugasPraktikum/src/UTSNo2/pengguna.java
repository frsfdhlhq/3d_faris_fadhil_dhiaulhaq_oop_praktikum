/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTSNo2;

/**
 *
 * @author Rissfdh
 */

import java.util.ArrayList;

public abstract class pengguna {
    String jenis;

    public pengguna(String jenis) {
        this.jenis = jenis;
    }

    public abstract void tindakan(ArrayList<buku> daftarBuku);
}
