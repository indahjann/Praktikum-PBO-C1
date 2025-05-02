/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/*
 * File       : TestSenjata.java
 * Deskripsi  : Program utama untuk menguji kelas Senjata dan KontrolSenjata.
 * Pembuat    : Indah Nurul Janah/24060123120009
 * Tanggal    : 30 April 2025
 */

package latihanMedium;

/**
 *
 * @author Asus
 */

public class TestSenjata {
    public static void main(String[] args) {
        Senjata ak47 = new Senjata("TAR");
        Senjata m16 = new Senjata("DOR");

        KontrolSenjata kontrolAk47 = new KontrolSenjata(ak47);
        KontrolSenjata kontrolM16 = new KontrolSenjata(m16);

        kontrolAk47.menembak(2);
        kontrolAk47.isiPeluru(3);
        kontrolAk47.menembak(5);

        System.out.println("===============================");

        kontrolM16.menembak(1);
        kontrolM16.isiPeluru(5);
        kontrolM16.menembak(2);
    }
}

