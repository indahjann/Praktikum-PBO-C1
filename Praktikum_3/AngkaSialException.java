/* 
 * File   : AngkaSialException.java
 * Deskripsi : Eksepsi buatan sendiri, menolak masukan angka 13!
 * Pembuat : Indah Nurul Janah/24060123120009
 * Tanggal : 7 Maret 2025
 */

public class AngkaSialException extends Exception {
    public AngkaSialException(){
        super("jangan memasukkan angka 13 karena angka sial");
    }
}
