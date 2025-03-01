/*
 * Nama File      : Garis.java
 * Deskripsi      : berisi atribut dan method dalam class Garis
 * Pembuat        : Indah Nurul Janah
 * Tanggal        : 19 Februari 2025
 */

public class Garis {
    /***************ATRIBUT***************/
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    /***************METHOD***************/
    //Konstruktor dengan titik awal (0,0) dan titik akhir (1,1).
    public Garis() {
        titikAwal = new Titik(0,0);
        titikAkhir = new Titik(1,1);
        counterGaris++;
    }

    //Konstruktor garis dengan parameter titik awal dan titik akhir
    public Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    //mengembalikan titik awal
    public Titik getTitikAwal() {
        return titikAwal;
    }

    //mengembalikan titik akhir
    public Titik getTitikAkhir() {
        return titikAkhir;
    }

    //mengeset titik awal dengan titik baru T
    public void setTitikAwal(Titik T) {
        titikAwal = T;
    }

    //mengeset titik akhit dengan titik baru T
    public void setTitikAkhir(Titik T) {
        titikAkhir = T;
    }

    //atribut static counterGaris.
    public static int getCounterGaris() {
        return counterGaris;
    }

    //mendapatkan panjang sebuah garis
    public double panjangGaris(){
        return Math.sqrt(Math.pow((titikAwal.getAbsis()-titikAkhir.getAbsis()), 2) + Math.pow((titikAwal.getOrdinat()-titikAkhir.getOrdinat()),2));
    }

    //mendapatkan gradien dari sebuah garis
    public double gradienGaris(){
        return (titikAwal.getOrdinat()-titikAkhir.getOrdinat())/(titikAwal.getAbsis()-titikAkhir.getAbsis());
    }

    //mendapatkan titik tengah dari sebuah garis
    public Titik tengahGaris(){
        return new Titik((titikAwal.getAbsis()+titikAkhir.getAbsis())/2 , (titikAwal.getOrdinat() + titikAkhir.getOrdinat())/2);
    }

    //mengecek apakah garis tersebut sejajar dengan sebuah garis lainnya
    public boolean cekSejajar(Garis G){
        return gradienGaris() == G.gradienGaris();
    }

    //mengecek apakah garis tersebut tegak lurus dengan sebuah garis lainnya
    public boolean cekTegakLurus(Garis G){
        return gradienGaris() * G.gradienGaris() == -1;
    }

    //menampilkan titik awal dan titik akhir garis
    public void printGaris() {
        System.out.print("Titik awal : " );
        titikAwal.printTitik();
        System.out.print("Titik akhir : ");
        titikAkhir.printTitik();
    }

    //menampilkan persamaan garis dalam bentuk string y = mx + c
    public void printPersamaan(){
        double c = titikAwal.getOrdinat() - (titikAwal.getAbsis() * gradienGaris());
        System.out.print("y = " + gradienGaris() + ".x + ");
        System.out.println(c);
    }

    //end class Garis
}