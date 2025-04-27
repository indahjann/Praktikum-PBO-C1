/*
 * Nama file : Anabul.java
 * Deskripsi : Kelas Anabul untuk mendemonstrasikan penggunaan kelas Kucing, Anjing dan Burung
 * Pembuat : 24060123120009/Indah Nurul Janah
 * Tanggal : 23 Maret 2025
 */

 public class Anabul{
    private String nama;

    public Anabul() {
        this.nama = "";
    }
    public Anabul(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void Gerak() {
        System.out.println("Anabul " + nama + " bergerak...");
    }

    public void Bersuara() {
        System.out.println("Anabul " + nama + " bersuara...");
    }
 }