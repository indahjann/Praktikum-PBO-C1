/**
 * File       : Pegawai.java
 * Deskripsi  : Kelas Parent untuk Pegawai
 * Pembuat    : Indah Nurul Janah
 * Tanggal    : 15 Maret 2025
 */


import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Pegawai {
    private String nip;
    private String nama;
    private LocalDate tanggalLahir;
    private LocalDate tmt;
    private double gajiPokok;
    private String jabatan;

    
    public static final DateTimeFormatter FORMATTGL = DateTimeFormatter.ofPattern("d MMMM yyyy");
    
    public Pegawai() {
        this.nip = "";
        this.nama = "";
        this.tanggalLahir = LocalDate.now();
        this.tmt = LocalDate.now();
        this.jabatan = "";
        this.gajiPokok = 0.0;
    }

    public Pegawai(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, String jabatan, double gajiPokok){
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.jabatan = jabatan;
        this.gajiPokok = gajiPokok;
    }

    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }

    public LocalDate getTmt() {
        return tmt;
    }

    public double getGajiPokok(){
        return gajiPokok;
    }

    public String getJabatan(){
        return jabatan;
    }

    public void setNip(String nip){
        this.nip = nip;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setTanggalLahir(LocalDate tanggalLahir){
        this.tanggalLahir = tanggalLahir;
    }

    public void setTmt(LocalDate tmt) {
        this.tmt = tmt;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public void setJabatan(String jabatan){
        this.jabatan = jabatan;
    }

    public int getMasaKerja() {
        return Period.between(tmt, LocalDate.now()).getYears();
    }

    public void printInfo() {
        System.out.println("NIP : " + getNip());
        System.out.println("Nama : " + getNama());
        System.out.println("Tanggal Lahir : " + getTanggalLahir().format(FORMATTGL));
        System.out.println("Jabatan: " + jabatan);
        System.out.println("TMT : " + getTmt().format(FORMATTGL));
        System.out.println("Masa Kerja : " + getMasaKerja() + " tahun");
        System.out.println("Gaji Pokok : Rp " + getGajiPokok());
    }
}
