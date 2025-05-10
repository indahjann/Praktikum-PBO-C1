/* 
 * File       : Anabul.java
 * Deskripsi  : Kelas abstrak untuk mendefinisikan perilaku umum dari hewan peliharaan (Anabul)
 * Pembuat    : Indah Nurul Janah/24060123120009 
 * Tanggal    : 9 Mei 2025 
 */

public abstract class Anabul {
    protected String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public abstract void Gerak();
    public abstract void Bersuara();
}
