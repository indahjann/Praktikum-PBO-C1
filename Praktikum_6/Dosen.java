/**
 * File         : Dosen.java
 * Deskripsi    : Kelas anak dari kelas Karyawan untuk merepresentasikan dosen di universitas
 * Pembuat      : Indah Nurul Janah/24060123120009
 * Tanggal      : 28 Maret 2025
 */

public class Dosen extends Karyawan {
    private Fakultas fakultas;
    private static int counter = 0;

    public Dosen(String nama, String email, String NIP, int masaKerja, Fakultas fakultas) {
        super(nama, email, NIP, masaKerja);
        this.fakultas = fakultas;
        counter++;
    }

    public Fakultas getFakultas() {
        return fakultas;
    }

    public static int getCounter() {
        return counter;
    }

    public void setFakultas(Fakultas fakultas) {
        this.fakultas = fakultas;
    }

    @Override
    public double hitungGaji() {
        return fakultas.getGajiPokok() + (masaKerja * 0.01 * fakultas.getGajiPokok());
    }

    @Override
    public void printInfo() {
        System.out.println("=== Informasi Dosen ===");
        super.printInfo();
        System.out.println("NIP        : " + nip);
        System.out.println("Masa Kerja : " + masaKerja + " tahun");
        System.out.println("Fakultas   : " + fakultas.getNama());
        System.out.println("Gaji       : " + hitungGaji());
        System.out.println("========================");
        System.out.println("Jumlah Dosen : " + counter);
        System.out.println("========================\n");
        
    }
}
