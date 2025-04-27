/**
 * File         : Karyawan.java
 * Deskripsi    : Kelas abstrak untuk merepresentasikan karyawan di universitas
 * Pembuat      : Indah Nurul Janah/24060123120009
 * Tanggal      : 28 Maret 2025
 */

abstract class Karyawan extends CivitasAkademika {
    protected String nip;
    protected int masaKerja;

    public Karyawan(String nama, String email, String nip, int masaKerja) {
        super(nama, email);
        this.nip = nip;
        this.masaKerja = masaKerja;
    }

    public String getNIP() {
        return nip;
    }

    public int getMasaKerja() {
        return masaKerja;
    }

    public void setNIP(String nip) {
        this.nip = nip;
    }

    public void setMasaKerja(int masaKerja) {
        this.masaKerja = masaKerja;
    }

    public abstract double hitungGaji();
}
