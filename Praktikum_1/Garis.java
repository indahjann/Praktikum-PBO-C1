/*
 * Nama File      : Garis.java
 * Deskripsi      : berisi atribut dan method dalam class Garis
 * Pembuat        : Indah Nurul Janah
 * Tanggal        : 19 Februari 2025
 */

public class Garis {
    /***************ATRIBUT***************/
    Titik titikAwal;
    Titik titikAkhir;
    static int counterGaris = 0;

    /***************METHOD***************/
    //Konstruktor dengan titik awal (0,0) dan titik akhir (1,1).
    Garis() {
        titikAwal = new Titik(0,0);
        titikAkhir = new Titik(1,1);
        counterGaris++;
    }

    //Konstruktor garis dengan parameter titik awal dan titik akhir
    Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    //mengembalikan titik awal
    Titik getTitikAwal() {
        return titikAwal;
    }

    //mengembalikan titik akhir
    Titik getTitikAkhir() {
        return titikAkhir;
    }

    //mengeset titik awal dengan titik baru T
    void setTitikAwal(Titik T) {
        titikAwal = T;
    }

    //mengeset titik akhit dengan titik baru T
    void setTitikAkhir(Titik T) {
        titikAkhir = T;
    }

    //atribut static counterGaris.
    static int getCounterGaris() {
        return counterGaris;
    }

    //mendapatkan panjang sebuah garis
    double getPanjangGaris(){
        return Math.sqrt(Math.pow((titikAwal.getAbsis()-titikAkhir.getAbsis()), 2) + Math.pow((titikAwal.getOrdinat()-titikAkhir.getOrdinat()),2));
    }

    //mendapatkan gradien dari sebuah garis
    double getGradienGaris(){
        return (titikAwal.getOrdinat()-titikAkhir.getOrdinat())/(titikAwal.getAbsis()-titikAkhir.getAbsis());
    }

    //mendapatkan titik tengah dari sebuah garis
    Titik getTengahGaris(){
        return new Titik((titikAwal.getAbsis()+titikAkhir.getAbsis())/2 , (titikAwal.getOrdinat() + titikAkhir.getOrdinat())/2);
    }

    //mengecek apakah garis tersebut sejajar dengan sebuah garis lainnya
    boolean isSejajar(Garis G){
        return getGradienGaris() == G.getGradienGaris();
    }

    //mengecek apakah garis tersebut tegak lurus dengan sebuah garis lainnya
    boolean isTegakLurus(Garis G){
        return getGradienGaris() * G.getGradienGaris() == -1;
    }

    //menampilkan titik awal dan titik akhir garis
    void printGaris() {
        System.out.print("Titik awal : " );
        titikAwal.printTitik();
        System.out.print("Titik akhir : ");
        titikAkhir.printTitik();
    }

    //menampilkan persamaan garis dalam bentuk string y = mx + c
    void printPersamaan(){
        double c = titikAwal.getOrdinat() - (titikAwal.getAbsis() * getGradienGaris());
        System.out.print("y = " + getGradienGaris() + ".x + ");
        System.out.println(c);
    }

    //end class Garis
}
