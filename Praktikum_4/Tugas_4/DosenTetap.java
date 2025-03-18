/**
 * File       : DosenTetap.java
 * Deskripsi  : Kelas turunan / child dari Dosen, Dosen Tetap
 * Pembuat    : Indah Nurul Janah
 * Tanggal    : 15 Maret 2025
 */


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


class DosenTetap extends Dosen {
    private String nidn;
    private LocalDate bup;

    public static final DateTimeFormatter FORMATTGL = DateTimeFormatter.ofPattern("d MMMM yyyy");

    public String getNidn() {
        return nidn;
    }

    public LocalDate getBup() {
        return bup;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    public void setBup(LocalDate bup) {
        this.bup = bup;
    }

    public DosenTetap(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas, String nidn) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, "Dosen Tetap", fakultas); // Langsung isi jabatan di superclass
        this.nidn = nidn;
        this.bup = tanggalLahir.plusYears(65).plusMonths(1);
    }

    public double getTunjangan() {
        return 0.02 * getMasaKerja() * getGajiPokok();
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDN : " + getNidn());
        System.out.println("BUP : " + getBup().format(FORMATTGL));
        System.out.println("Tunjangan : Rp " + getTunjangan());
    } 
}