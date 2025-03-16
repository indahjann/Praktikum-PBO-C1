/* 
 * File   : MBangunDatar.java
 * Deskripsi : program main untuk menjalankan class BangunDatar
 * Pembuat : Indah Nurul Janah/24060123120009
 * Tanggal : 14 Maret 2025
 */

public class MBangunDatar {
    public static void main(String[] args) {
        Persegi persegi = new Persegi(6, "Hijau", "Kuning");
        persegi.printInfo();
        System.out.println("Luas: " + persegi.getLuas());
        System.out.println("Keliling : " + persegi.getKeliling());
        System.out.println("Diagona; : " + persegi.getDiagonal());

        Lingkaran lingkaran = new Lingkaran(7, "Hijau", "Merah");
        lingkaran.printInfo();
        System.out.println("Jari-jari : " + lingkaran.getJari());
        System.out.println("Luas: " + lingkaran.getLuas());
        System.out.println("Keliling : " + lingkaran.getKeliling());
    }

}
