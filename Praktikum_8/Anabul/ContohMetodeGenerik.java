/* 
 * File       : ContohMetodeGenerik.java
 * Deskripsi  : Kelas berisi metode generik untuk mengendalikan objek Datum bertipe Anabul
 * Pembuat    : Indah Nurul Janah/24060123120009 
 * Tanggal    : 2 Mei 2025 
 */

public class ContohMetodeGenerik {
    public static <G extends Anabul> void tampilkanAnabul(Datum<G> datum) {
        datum.getIsi().Bersuara();
        datum.getIsi().Gerak();
        System.out.println("-----------");
    }
}
