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

        BangunDatar P1 = new Persegi(10, "Merah", "Biru");
        System.err.println("Luas P1 : " + P1.getLuas());

        BangunDatar L1 = new Lingkaran(5, "biru", "hitam");
        System.err.println("Luas L1 : " + L1.getLuas());

        Persegi P2 = new Persegi(5, "hijau", "kuning");
        System.err.println("Luas P2 : " + P2.getLuas());

        Lingkaran L2 = new Lingkaran(5, "biru", "hitam");
        System.err.println("Luas L2 : " + L2.getLuas());

        System.out.println("Luas P1 == L1 ? : " + P1.isEqualLuas(L1));
        System.out.println("Keliling P1 == L1 ? : " + P1.isEqualKeliling(L1));

        System.out.println("sisi P1 sebelum zoomIn = " + ((Persegi)P1).getSisi());
        ((Persegi)P1).zoomIn();
        System.out.println("sisi P1 setelah zoomIn = " + ((Persegi)P1).getSisi());

        System.out.println("sisi P1 sebelum zoomOut = " + ((Persegi)P1).getSisi());
        ((Persegi)P1).zoomOut();
        System.out.println("sisi P1 setelah zoomOut = " + ((Persegi)P1).getSisi());

        // System.out.println("Jari-jari L1 sebelum zoom50% = " + ((Lingkaran)L1).getJari());
        // ((Lingkaran)L1).zoom();




    }

}
