/*
 * Nama file : Anjing.java
 * Deskripsi : Kelas Anabul untuk mendemonstrasikan penggunaan kelas Anjing
 * Pembuat : 24060123120009/Indah Nurul Janah
 * Tanggal : 23 Maret 2025
 */
public class Anjing extends Anabul{
    public Anjing() {
        super("");
    }
    
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println("Anjing " + getNama() + " melata.");
    }

    @Override
    public void Bersuara() {
        System.out.println("Anjing " + getNama() + " berbunyi guk-guk.");
    }
    
}
