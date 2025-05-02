/* 
 * File       : Burung.java
 * Deskripsi  : Kelas turunan dari Anabul untuk Burung
 * Pembuat    : Indah Nurul Janah/24060123120009 
 * Tanggal    : 2 Mei 2025 
 */

public class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println(nama + " terbang");
    }

    @Override
    public void Bersuara() {
        System.out.println(nama + " bersuara: Cuit Cuit");
    }
    
}
