/* 
 * File       : Main.java
 * Deskripsi  : Program utama untuk menyimulasikan semua jenis Anabul menggunakan generik
 * Pembuat    : Indah Nurul Janah/24060123120009 
 * Tanggal    : 2 Mei 2025 
 */

public class Main {
    public static void main(String[] args) {
        Datum<Kucing> d1 = new Datum<>();
        d1.setIsi(new Kucing("Mimi"));

        Datum<Anjing> d2 = new Datum<>();
        d2.setIsi(new Anjing("Doggo"));

        Datum<Burung> d3 = new Datum<>();
        d3.setIsi(new Burung("Tweety"));

        ContohMetodeGenerik.tampilkanAnabul(d1);
        ContohMetodeGenerik.tampilkanAnabul(d2);
        ContohMetodeGenerik.tampilkanAnabul(d3);
    }
}
