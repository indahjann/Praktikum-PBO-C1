/**
 * File       : MainPegawai.java
 * Deskripsi  : Program utama untuk menguji kelas Pegawai, Dosen, dan Tendik
 * Pembuat    : Indah Nurul Janah
 * Tanggal    : 15 Maret 2025
 */


import java.time.LocalDate;

public class MainPegawai {
    public static void main(String[] args) {
        System.out.println("=== Informasi Dosen Tetap ===");
        DosenTetap dosenTetap = new DosenTetap("956784122", "Indah", LocalDate.of(1990, 5, 5), LocalDate.of(2015, 1, 1), 20000000, "Fakultas Sains dan Matematika", "12345");
        dosenTetap.printInfo();

        System.out.println("\n=== Informasi Dosen Tetap ===");
        DosenTamu dosenTamu = new DosenTamu("9623456789", "Nurul", LocalDate.of(1980, 2, 10), LocalDate.of(2020, 8, 1), 15000000, "Fakultas Kedokteran", "56789", LocalDate.of(2025, 12, 31));
        dosenTamu.printInfo();

        System.out.println("\n=== Informasi Tendik ===");
        Tendik tendik = new Tendik("1234567890", "Janah",LocalDate.of(1985, 3, 15), LocalDate.of(2010, 7, 10), 8000000, "Akademik");
        tendik.printInfo();
    }
}
