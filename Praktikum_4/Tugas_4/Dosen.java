/**
 * File       : Dosen.java
 * Deskripsi  : Kelas turunan / child dari Pegawai, Dosen
 * Pembuat    : Indah Nurul Janah
 * Tanggal    : 15 Maret 2025
 */


import java.time.LocalDate;

public class Dosen extends Pegawai {
    private String fakultas;

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public Dosen(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String jabatan, String fakultas) {
        super(nip, nama, tanggalLahir, tmt, jabatan, gajiPokok);
        this.fakultas = fakultas;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fakultas : " + getFakultas());
    }
}