/* 
 * File       : Persegi.java
 * Deskripsi  : Kelas untuk menghitung keliling dan luas persegi
 * Pembuat    : Indah Nurul Janah/24060123120009 
 * Tanggal    : 8 Mei 2025 
 */

public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungKeliling() {
        return 4 * sisi; 
    }

    public double hitungLuas() {
        return sisi * sisi;
    }
    
}
