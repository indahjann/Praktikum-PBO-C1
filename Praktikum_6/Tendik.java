/**
 * File         : Tendik.java
 * Deskripsi    : Kelas anak dari kelas Karyawan untuk merepresentasikan tendik di universitas
 * Pembuat      : Indah Nurul Janah/24060123120009
 * Tanggal      : 28 Maret 2025
 */


public class Tendik extends Karyawan {
    private static final double gajiPokok = 4000000;
    private static int counter = 0;

    public Tendik(String nama, String email, String nip, int masaKerja) {
        super(nama, email, nip, masaKerja);
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public double hitungGaji() {
        return gajiPokok + (masaKerja * 0.01 * gajiPokok);
    }

    @Override
    public void printInfo() {
        System.out.println("=== Informasi Tendik ===");
        super.printInfo();
        System.out.println("NIP        : " + nip);
        System.out.println("Masa Kerja : " + masaKerja + " tahun");
        System.out.println("Gaji       : " + hitungGaji());
        System.out.println("========================");
        System.out.println("Jumlah Dosen : " + counter);
        System.out.println("========================\n");
    }
}
