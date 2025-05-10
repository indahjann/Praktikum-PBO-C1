/* 
 * File       : Lingkaran.java
 * Deskripsi  : Kelas untuk menghitung keliling dan luas lingkaran
 * Pembuat    : Indah Nurul Janah/24060123120009 
 * Tanggal    : 8 Mei 2025 
 */

public class Lingkaran extends BangunDatar {
    private double jejari;

    public Lingkaran(double jejari) {
        this.jejari = jejari;
    }

    public double hitungKeliling() {
        return 2 * 3.14 * jejari; // rumus keliling lingkaran
    }
    public double hitungLuas() {
        return 3.14 * jejari * jejari; // rumus luas lingkaran
    }
}
