/* 
 * File       : Anjing.java
 * Deskripsi  : Kelas turunan dari Anabul untuk Anjing
 * Pembuat    : Indah Nurul Janah/24060123120009 
 * Tanggal    : 2 Mei 2025 
 */

public class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println(nama + " berlari");
    }

    @Override
    public void Bersuara() {
        System.out.println(nama + " bersuara: Guk Guk");
    }
    
}
