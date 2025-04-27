/**
 * File         : CivitasAkademika.java
 * Deskripsi    : Kelas abstrak untuk merepresentasikan civitas akademika di universitas
 * Pembuat      : Indah Nurul Janah/24060123120009
 * Tanggal      : 28 Maret 2025
 */

abstract class CivitasAkademika {
    protected String nama;
    protected String email;

    public CivitasAkademika(String nama, String email) {
        this.nama = nama;
        this.email = email;
    }

    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void printInfo(){
        System.out.println("Nama       : " + nama);
        System.out.println("Email      : " + email);
    }
}
