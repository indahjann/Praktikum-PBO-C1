/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
 * File       : KontrolSenjata.java
 * Deskripsi  : Kelas kontrol untuk mengatur aksi terhadap objek Senjata.
 * Pembuat    : Indah Nurul Janah/24060123120009
 * Tanggal    : 30 April 2025
 */

package latihanMedium;

/**
 *
 * @author Asus
 */

public class KontrolSenjata {
    private Senjata senjata;

    public KontrolSenjata(Senjata s) {
        this.senjata = s;
    }

    public boolean isAdaPeluru() {
        return senjata.getPeluru() > 0;
    }

    public void isiPeluru(int jumPeluru) {
        senjata.setPeluru(senjata.getPeluru() + jumPeluru);
        System.out.println(">> Peluru berhasil ditambah: " + jumPeluru);
    }

    public void menembak(int jumlah) {
        System.out.println(">> Siap menembak " + jumlah + " kali");
        if (!isAdaPeluru()){
            System.out.println("Peluru Habis");
        } else {
            for (int i = 0; i < jumlah; i++) {
                if (isAdaPeluru()) {
                    System.out.println(senjata.getBunyi() + " ");
                    senjata.setPeluru(senjata.getPeluru() - 1);
                } else {
                    System.out.println("Gagal tembak, Peluru Habis");
                }
            }
            System.out.println(">> Peluru sisa: " + senjata.getPeluru());
        }
    }
}
