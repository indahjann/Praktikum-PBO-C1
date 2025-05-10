/* 
 * File       : BangunDatarGenericTest.java
 * Deskripsi  : Kelas untuk menguji implementasi BangunDatarGeneric dengan berbagai bangun datar
 * Pembuat    : Indah Nurul Janah/24060123120009 
 * Tanggal    : 8 Mei 2025 
 */

public class BangunDatarGenericTest {
    public static void main(String[] args) {
        Lingkaran l= new Lingkaran(7); // buat objek lingkaran
        BangunDatarGeneric<Lingkaran> bg = new BangunDatarGeneric<Lingkaran>(); // buat objek bangun datar generic
        bg.set(l); // set bangun datar
        System.out.println("Keliling Lingkaran: " + bg.hitungKeliling()); // hitung keliling lingkaran
        System.out.println("tipe generic : " + bg.get().getClass().getName()); // tampilkan tipe generic

        // Uji Lingkaran
        Lingkaran lingkaran = new Lingkaran(7);
        BangunDatarGeneric<Lingkaran> bgLingkaran = new BangunDatarGeneric<>();
        bgLingkaran.set(lingkaran);
        System.out.println("Keliling Lingkaran: " + bgLingkaran.hitungKeliling());
        System.out.println("Tipe generic: " + bgLingkaran.get().getClass().getName());

        // Uji Persegi
        Persegi persegi = new Persegi(4);
        BangunDatarGeneric<Persegi> bgPersegi = new BangunDatarGeneric<>();
        bgPersegi.set(persegi);
        System.out.println("\nKeliling Persegi: " + bgPersegi.hitungKeliling());
        System.out.println("Tipe generic: " + bgPersegi.get().getClass().getName());

        // Uji Persegi Panjang
        PersegiPanjang persegiPanjang = new PersegiPanjang(5, 3);
        BangunDatarGeneric<PersegiPanjang> bgPersegiPanjang = new BangunDatarGeneric<>();
        bgPersegiPanjang.set(persegiPanjang);
        System.out.println("\nKeliling Persegi Panjang: " + bgPersegiPanjang.hitungKeliling());
        System.out.println("Tipe generic: " + bgPersegiPanjang.get().getClass().getName());

        // Uji Segitiga
        Segitiga segitiga = new Segitiga(3, 4, 5);
        BangunDatarGeneric<Segitiga> bgSegitiga = new BangunDatarGeneric<>();
        bgSegitiga.set(segitiga);
        System.out.println("\nKeliling Segitiga: " + bgSegitiga.hitungKeliling());
        System.out.println("Tipe generic: " + bgSegitiga.get().getClass().getName());

    }
}