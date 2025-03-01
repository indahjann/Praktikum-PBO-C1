import java.util.ArrayList;

public class Mahasiswa{
    /****************ATRIBUT****************/
    private String nim;
    private String nama;
    private String prodi;
    private ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /****************METHOD****************/

    // konstruktor tanpa parameter
    public Mahasiswa() {
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.listMatkul = new ArrayList<>();
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }
    // Konstruktor dengan parameter
    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>();
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }

    // Selektor (Getter)
    public String getNim() { 
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }

    public Dosen getDosenWali() {
        return dosenWali;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    // Mutator (Setter)
    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    // Method untuk menambahkan mata kuliah ke listMatKul
    public void addMatKul(MataKuliah newMatkul) {
        listMatkul.add(newMatkul);
    }

    // Method untuk mendapatkan jumlah SKS total
    public int getJumlahSKS() {
        int totalSks = 0;
        for (MataKuliah mk : listMatkul) {
            totalSks += mk.getSks();
        }
        return totalSks;
    }

    // Method untuk mendapatkan jumlah mata kuliah yang diambil
    public int getJumlahMatKul() {
        return listMatkul.size();
    }

    // Method untuk menampilkan nim, nama, dan prodi mahasiswa
    public void printMhs() {
        System.out.println("NIM  : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Prodi: " + prodi);
    }

    // Method untuk menampilkan detail lengkap mahasiswa
    public void printDetailMhs() {
        System.out.println("NIM  : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Prodi: " + prodi);
        System.out.println("Daftar Mata Kuliah:");
        for (MataKuliah mk : listMatkul) {
            System.out.println("- " + mk.getNama() + " (" + mk.getSks() + " SKS)");
        }
        System.out.println("Dosen Wali: " + dosenWali.getNama());
        System.out.println("Kendaraan: " + kendaraan.getJenis() + " (Plat: " + kendaraan.getNoPlat() + ")");
    }

    // end class

}