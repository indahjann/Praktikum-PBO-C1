/* 
 * File       : Kucing.java
 * Deskripsi  : Kelas turunan dari Anabul untuk Kucing
 * Pembuat    : Indah Nurul Janah/24060123120009 
 * Tanggal    : 2 Mei 2025 
 */
public class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println(nama + " melata");
    }

    @Override
    public void Bersuara() {
        System.out.println(nama + " bersuara: Meong");
    }
}
