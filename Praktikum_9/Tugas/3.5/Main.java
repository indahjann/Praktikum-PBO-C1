/* 
 * File       : Main.java
 * Deskripsi  : Kelas utama untuk menguji implementasi kelas Koleksi dengan tipe data karakter
 * Pembuat    : Indah Nurul Janah/24060123120009 
 * Tanggal    : 8 Mei 2025 
 */

public class Main {
    public static void main(String[] args) {
        Koleksi<Character> koleksiKarakter = new Koleksi<>(10);

        // Menambahkan karakter
        koleksiKarakter.add('A');
        koleksiKarakter.add('B');
        koleksiKarakter.add('C');
        koleksiKarakter.showAll();

        // Mengedit karakter
        koleksiKarakter.setIsi(1, 'Z');
        koleksiKarakter.showAll();

        // Menghapus elemen ke-0
        koleksiKarakter.delete(0);
        koleksiKarakter.showAll();

        // Menampilkan ukuran
        System.out.println("Ukuran koleksi saat ini: " + koleksiKarakter.getSize());

        // Menampilkan isi ke-i
        System.out.println("Isi indeks ke-0: " + koleksiKarakter.getIsi(0));
    }
}
