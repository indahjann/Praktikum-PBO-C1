/* 
 * File   : Asersi2.java
 * Deskripsi : Program untuk demo asersi, yang akan menolak
 *              input jari-jari lingkaran bernilai 0
 * Pembuat : Indah Nurul Janah/24060123120009
 * Tanggal : 7 Maret 2025
 */

// class Lingkarang
class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling() {
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

// vlass Asersi
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = -1;
        assert(jariJari>0):"jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " +kelilingLingkaran);
    }

    /*Konsep Asersi2 ada yang kurang tepat karena tidak dapat menangani input <= 0 sehingga 
    seharusnya terdapat validator untuk input, seperti penggunaan if-else
     */
}
