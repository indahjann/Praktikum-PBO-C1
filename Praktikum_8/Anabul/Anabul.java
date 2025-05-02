/* 
 * File       : Anabul.java
 * Deskripsi  : Kelas abstrak yang merepresentasikan perilaku dasar hewan peliharaan (Anabul)
 * Pembuat    : Indah Nurul Janah/24060123120009 
 * Tanggal    : 2 Mei 2025 
 */


public abstract class Anabul {
    protected String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public abstract void Gerak();
    public abstract void Bersuara();
}
