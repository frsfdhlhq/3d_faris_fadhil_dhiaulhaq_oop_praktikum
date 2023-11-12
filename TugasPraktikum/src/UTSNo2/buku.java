/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTSNo2;

/**
 *
 * @author Rissfdh
 */
// buku.java
public class buku {
    String judul;
    String penulis;
    String genre;

    public buku(String judul, String penulis, String genre) {
        this.judul = judul;
        this.penulis = penulis;
        this.genre = genre;
    }

    public void tampilInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Genre: " + genre);
    }

    public String getGenre() {
        return genre;
    }
}
