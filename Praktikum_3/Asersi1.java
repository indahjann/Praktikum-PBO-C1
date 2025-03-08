/* 
 * File   : Asersi1.java
 * Deskripsi : Program untuk menjalankan asersi
 * Pembuat : Indah Nurul Janah/24060123120009
 * Tanggal : 7 Maret 2025
 */

public class Asersi1{
    public static void main(String[] args) {
        int x = 0;
        if(x>0){
            System.out.println("x bilangan positif");
        }else{
            assert(x<0) : "ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}