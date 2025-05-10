/* 
 * File       : Burung.java
 * Deskripsi  : Kelas untuk mendefinisikan perilaku Anabul jenis Burung
 * Pembuat    : Indah Nurul Janah/24060123120009 
 * Tanggal    : 9 Mei 2025 
 */

public class Burung extends Anabul{
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void Gerak(){
        System.out.println("Burung " + getNama() + " bergerak dengan terbang");
    }

    @Override
    public void Bersuara(){
        System.out.println("Burung " + getNama() + " bersuara Cuit Cuit");
    }
}
