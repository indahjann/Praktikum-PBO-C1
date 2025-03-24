/* 
 * File   : Lingkaran.java
 * Deskripsi : program untuk mendefinisikan child class BangunDatar, Lingkaran 
 * Pembuat : Indah Nurul Janah/24060123120009
 * Tanggal : 14 Maret 2025
 */

public class Lingkaran extends BangunDatar implements IResize {
    private double jari;

    public Lingkaran(){
        setJmlSisi(0);
    }

    public Lingkaran(double jari, String warna, String border){
        this.jari = jari;
        setWarna(warna);
        setBorder(border);
        setJmlSisi(0);
    }

    public double getJari(){
        return jari;
    }

    public void setJari(double jari){
        this.jari = jari;
    }

    @Override
    public double getLuas(){
        return Math.PI * jari * jari;
    }

    @Override   
    public double getKeliling(){
        return Math.PI * 2 * jari;
    }

    @Override
    public void zoomIn(){
        jari = jari * 1.1;
    }

    @Override
    public void zoomOut(){
        jari = jari  * 0.9;
    }

    @Override
    public void zoom (int percent){
        jari = jari * percent / 100;
    }

    @Override
    public void printInfo(){
        // System.out.println("Jumlah sisi: " + getJmlSisi());
        // System.out.println("Warna : " + getWarna());
        // System.out.println("Border : " + getBorder());
        super.printInfo();
        System.out.println("Jari-jari : "+getJari());
        System.out.println("Luas : "+getLuas());
        System.out.println("Keliling : "+getKeliling());
    }

}
