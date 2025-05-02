/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
 * File       : Senjata.java
 * Deskripsi  : Kelas Senjata yang menyimpan informasi bunyi, peluru, dan status menusuk.
 * Pembuat    : Indah Nurul Janah/24060123120009
 * Tanggal    : 30 April 2025
 */

package latihanMedium;

/**
 *
 * @author Asus
 */

public class Senjata {
    private String bunyi;
    private int peluru;
    private boolean menusuk;

    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.peluru = 0;
        this.menusuk = false;
    }

    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    public String getBunyi() {
        return bunyi;
    }

    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }

    public int getPeluru() {
        return peluru;
    }

    public void setMenusuk(boolean menusuk) {
        this.menusuk = menusuk;
    }

    public boolean isMenusuk() {
        return menusuk;
    }
}
