/*
 * Nama file : Burung.java
 * Deskripsi : Kelas Anabul untuk mendemonstrasikan penggunaan kelas Burung
 * Pembuat : 24060123120009/Indah Nurul Janah
 * Tanggal : 23 Maret 2025
 */

public class Burung extends Anabul{
    public Burung() {
        super("");
    }
    
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println("Burung " + getNama() + " terbang.");
    }

    @Override
    public void Bersuara() {
        System.out.println("Burung " + getNama() + " berbunyi cuit.");
    }
    
}
