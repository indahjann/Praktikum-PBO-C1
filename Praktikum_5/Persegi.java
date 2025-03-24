/* 
 * File   : Persegi.java
 * Deskripsi : program untuk mendefinisikan child class BangunDatar, Persegi 
 * Pembuat : Indah Nurul Janah/24060123120009
 * Tanggal : 14 Maret 2025
 */

public class Persegi extends BangunDatar implements IResize{
    private double sisi;

    public Persegi(){
        setJmlSisi(4);
    }

    public Persegi (double sisi, String warna, String border){
        this.sisi = sisi;
        setWarna(warna);
        setBorder(border);
        setJmlSisi(4);
    }

    public double getSisi(){
        return sisi;
    }

    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    @Override
    public double getLuas(){
        return sisi*sisi;
    }

    @Override
    public double getKeliling(){
        return 4*sisi;
    }

    public double getDiagonal(){
        return Math.sqrt(2)*sisi;
    }

    @Override
    public void zoomIn(){
        sisi = sisi * 1.1;
    }

    @Override
    public void zoomOut(){
        sisi = sisi  * 0.9;
    }

    @Override
    public void zoom (int percent){
        sisi = sisi * percent / 100;
    }

    //@Override
    public void printInfo(){
        // System.out.println("Jumlah sisi: " + getJmlSisi());
        // System.out.println("Warna : " + getWarna());
        // System.out.println("Border : " + getBorder());
        super.printInfo();
        System.out.println("Sisi : " + sisi);
    }

    /*
     * public Persegi(double sisi, String warna, String border){
     *     this.sisi = sisi;
     *     this.warna = warna;
     *     this.border = border;
     *  }
     * apakah bisa dijalankan? tidak karen kode ini mencoba untuk mengakses atribut pada kelas parent
     * yang bersifat private. Solusinya adalah dengan menggunakan getter dan setter yang bersifat public
     * pada class parent, BangunDatar.
     * 
     */
    
    /*
     * @Override
    public static void  printCounterBangunDatar(){
        System.out.println("Jumlah Objek Bangun Datar : " + );
    }

    kode ini ada error karena di kelas parent nya, printCountBangunDatar itu bersifat
    static sehingga hanya bisa diakses di kelas BangunDatar. Solusinya tidak usah menggunakan 
    override dan membuat count sendiri untuk persegi.
     */
}
