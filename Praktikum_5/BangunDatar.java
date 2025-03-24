/* 
 * File   : BangunDatar.java
 * Deskripsi : program untuk mendefinisikan parent class BangunDatar 
 * Pembuat : Indah Nurul Janah/24060123120009
 * Tanggal : 14 Maret 2025
 */

public abstract class BangunDatar {
    protected int jmlSisi;
    protected String warna;
    protected String border;
    private static int counterBangunDatar = 0;

    /*
     * Tambahkan keyword final pada kelas BangunDatar. Bagaimana pengaruhnya terhadap kelas
        Persegi dan Lingkaran?

        jawab : class nya gabisa di extends ke subclass
     */

    /*
     * hapus kembali keyword final pada kelas BangunDatar, lalu tambahkan keyword final pada method
    printInfo() di dalam kelas BangunDatar. Bagaimana pengaruhnya dengan method printInfo() pada
    kelas Persegi dan Lingkaran?

        jawab : method printInfo() tidak bisa di override di subclass
     */

    public BangunDatar(){
        counterBangunDatar++;
    }

    public BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public static void printCounterBangunDatar(){
        System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    }

    public int getJmlSisi() {
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }
    public String getWarna() {
        return warna;
    }
    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public abstract double getLuas();

    public abstract double getKeliling();

    public boolean isEqualLuas(BangunDatar X){
        return this.getLuas() == X.getLuas();
    }

    public boolean isEqualKeliling(BangunDatar X){
        return this.getKeliling() == X.getKeliling();
    }

    public void printInfo(){
        System.out.println("Jumlah Sisi : "+jmlSisi);
        System.out.println("Warna : "+warna);
        System.out.println("Border : "+border);
    }
}