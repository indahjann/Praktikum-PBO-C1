/* 
 * File       : PersegiPanjang.java
 * Deskripsi  : Kelas untuk menghitung keliling dan luas persegi panjang
 * Pembuat    : Indah Nurul Janah/24060123120009 
 * Tanggal    : 8 Mei 2025 
 */

public class PersegiPanjang extends BangunDatar {
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double hitungKeliling() {
        return 2 * (panjang + lebar); 
    }

    public double hitungLuas() {
        return panjang * lebar;
    }
    
}
