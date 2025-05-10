/* 
 * File       : Anjing.java
 * Deskripsi  : Kelas untuk mendefinisikan perilaku Anabul jenis Anjing
 * Pembuat    : Indah Nurul Janah/24060123120009 
 * Tanggal    : 9 Mei 2025 
 */

public class Anjing extends Anabul {
    
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void Gerak(){
        System.out.println("Anjing " + getNama() + " bergerak dengan melata");
    }

    @Override
    public void Bersuara(){
        System.out.println("Anjing " + getNama() + " bersuara dengan guk guk");
    }
}
