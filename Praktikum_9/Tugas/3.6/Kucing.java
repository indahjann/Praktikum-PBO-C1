/* 
 * File       : Kucing.java
 * Deskripsi  : Kelas untuk mendefinisikan perilaku Anabul jenis Kucing
 * Pembuat    : Indah Nurul Janah/24060123120009 
 * Tanggal    : 9 Mei 2025 
 */

public class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void Gerak(){
        System.out.println("Kucing " + getNama() + " bergerak dengan melata");
    }

    @Override
    public void Bersuara(){
        System.out.println("Kucing " + getNama() + " bersuara dengan meong");
    }
}
