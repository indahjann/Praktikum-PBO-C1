import java.time.LocalDate;

public abstract class Manusia {
    private String nama;
    private LocalDate tglMulaiKerja;
    private String alamat;
    private double pendapatan;
    private static int counterMns = 0;

    public Manusia(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tglMulaiKerja = tglMulaiKerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    public String getNama() {
        return nama;
    }

    public LocalDate gettglMulaiKerja() {
        return tglMulaiKerja;
    }

    public String getAlamat() {
        return alamat;
    }

    public double getPendapatan() {
        return pendapatan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void settglMulaiKerja(LocalDate tglMulaiKerja) {
        this.tglMulaiKerja = tglMulaiKerja;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }


    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    public abstract int hitungMasaKerja();
    
    public void cetakInfo() {
        System.out.println("Nama: " + getNama());
        System.out.println("Tanggal Mulai Kerja: " + gettglMulaiKerja());
        System.out.println("Alamat: " + getAlamat());
        System.out.println("Pendapatan: " + getPendapatan());
        System.out.println("Masa Kerja: " + hitungMasaKerja());
    }
    
    public static int getCounterMns() {
        return counterMns;
    }
}