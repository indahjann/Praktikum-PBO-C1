/**
 * File       : Tendik.java
 * Deskripsi  : Kelas turunan / child dari Pegawai, Tenaga Kependidikan
 * Pembuat    : Indah Nurul Janah
 * Tanggal    : 15 Maret 2025
 */


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Tendik extends Pegawai {
    private String bidang;
    private LocalDate bup;
    public static final DateTimeFormatter FORMATTGL = DateTimeFormatter.ofPattern("d MMMM yyyy");


    public String getBidang() {
        return bidang;
    }

    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    public LocalDate getBup() {
        return bup;
    }

    public void setBup(LocalDate bup) {
        this.bup = bup;
    }

    public Tendik(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String bidang) {
        super(nip, nama, tanggalLahir, tmt, "Tendik", gajiPokok);
        this.bidang = bidang;
        this.bup = tanggalLahir.plusYears(55).plusMonths(1);
    }

    public double getTunjangan() {
        return 0.01 * getMasaKerja() * getGajiPokok();
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Bidang : " + getBidang());
        System.out.println("BUP : " + getBup().format(FORMATTGL));
        System.out.println("Tunjangan : Rp " + getTunjangan());
    }
}
