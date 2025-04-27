/*
 * Nama file : Kucing.java
 * Deskripsi : Kelas Anabul untuk mendemonstrasikan penggunaan kelas Kucing
 * Pembuat : 24060123120009/Indah Nurul Janah
 * Tanggal : 23 Maret 2025
 */
public class Kucing extends Anabul{
    public Kucing() {
        super("");
    }
    
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println("Kucing " + getNama() + " melata.");
    }

    @Override
    public void Bersuara() {
        System.out.println("Kucing " + getNama() + " berbunyi meong.");
    }

    
}
