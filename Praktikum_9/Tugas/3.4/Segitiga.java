/* 
 * File       : Segitiga.java
 * Deskripsi  : Kelas untuk menghitung keliling dan luas segitiga
 * Pembuat    : Indah Nurul Janah/24060123120009 
 * Tanggal    : 8 Mei 2025 
 */

public class Segitiga extends BangunDatar {
    private double alas;
    private double tinggi;
    private double sisiMiring;

    public Segitiga(double alas, double tinggi, double sisiMiring) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiMiring = sisiMiring;
    }

    @Override
    public double hitungKeliling() {
        return alas + tinggi + sisiMiring; // rumus keliling segitiga
    }

    public double hitungLuas() {
        return 0.5 * alas * tinggi; // rumus luas segitiga
    }
}