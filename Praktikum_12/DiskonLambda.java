/*
 * File DiskonLambda.java
 * Deskripsi : Ekspresi lambda dasar, digunakan untuk menghitung diskon
 * Pembuat : Indah Nurul Janah/24060123120009
 * Tanggal : 28 Mei 2025
 */

interface IDiskon {
    public double hitungDiskon(double harga);
}
public class DiskonLambda {
    public static void main(String[] args) {
        // tanpa lambda
        IDiskon diskonMerdeka = new IDiskon() {
            public double hitungDiskon(double harga) {
                return harga - (harga * 0.3);
            }
        };

        // dengan lambda
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);
        // dengan lambda dengan blok statement
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        };

        System.out.println("Diskon Merdeka = " + diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran = " + diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa = " + diskonBiasa.hitungDiskon(45000));
    }
}

/*
 * Perbedaan antara ketiga ekspresi lambda di atas adalah:
 * 1. `diskonMerdeka` menggunakan anonymous class untuk mengimplementasikan interface `IDiskon`.
 * 2. `diskonLebaran` menggunakan ekspresi lambda sederhana yang langsung mengimplementasikan metode `hitungDiskon`.
 * 3. `diskonBiasa` menggunakan ekspresi lambda dengan blok statement yang memungkinkan untuk menulis kode lebih dari satu baris.
 */