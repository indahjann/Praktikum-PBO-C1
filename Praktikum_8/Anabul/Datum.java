/* 
 * File       : Datum.java
 * Deskripsi  : Kelas generik yang menyimpan data bertipe generik
 * Pembuat    : Indah Nurul Janah/24060123120009 
 * Tanggal    : 2 Mei 2025 
 */

public class Datum<G> {
    private G isi;

    public G getIsi() {
        return isi;
    }

    public void setIsi(G isi) {
        this.isi = isi;
    }
}
