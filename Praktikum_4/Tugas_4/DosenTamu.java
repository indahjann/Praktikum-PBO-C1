/**
 * File       : DosenTamu.java
 * Deskripsi  : Kelas turunan / child dari Dosen, Dosen Tamu
 * Pembuat    : Indah Nurul Janah
 * Tanggal    : 15 Maret 2025
 */


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class DosenTamu extends Dosen {
    private String nidk;
    private LocalDate tglAkhirKontrak;

    public static final DateTimeFormatter FORMATTGL = DateTimeFormatter.ofPattern("d MMMM yyyy");

    public String getNidk() {
        return nidk;
    }

    public LocalDate getTglAkhirKontrak() {
        return tglAkhirKontrak;
    }

    public void setNidk(String nidk) {
        this.nidk = nidk;
    }

    public void setTglAkhirKontrak(LocalDate tglAkhirKontrak) {
        this.tglAkhirKontrak = tglAkhirKontrak;
    }

    public DosenTamu(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas, String nidk, LocalDate tglAkhirKontrak) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, "Dosen Tamu", fakultas);
        this.nidk = nidk;
        this.tglAkhirKontrak = tglAkhirKontrak;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDK : " + getNidk());
        System.out.println("Tanggal Berakhir Kontrak : " + getTglAkhirKontrak().format(FORMATTGL));
    }
}
