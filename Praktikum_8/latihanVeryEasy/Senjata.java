/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * File       : Senjata.java
 * Deskripsi  : Kelas Senjata yang merepresentasikan senjata dengan suara tembakan dan jumlah peluru.
 * Pembuat    : Indah Nurul Janah/24060123120009
 * Tanggal    : 30 April 2025
*/

package latihanVeryEasy;

/**
 *
 * @author Asus
 */

public class Senjata {
    private String bunyi;
    private int peluru;

    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.peluru = 0;
    }
    
    public String getBunyi() {
        return bunyi;
    }
    
    public int getPeluru() {
        return peluru;
    }
    
    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }

    public void menembak() {
        if (peluru > 0) {
            System.out.println(bunyi);
            peluru--;
            System.out.println("Sisa Peluru: " + peluru);
        } else {
            System.out.println("Peluru habis!");
        }
    }
}

