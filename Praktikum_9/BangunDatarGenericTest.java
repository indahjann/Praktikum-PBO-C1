public class BangunDatarGenericTest {
    public static void main(String[] args) {
        Lingkaran l= new Lingkaran(7); // buat objek lingkaran
        BangunDatarGeneric<Lingkaran> bg = new BangunDatarGeneric<Lingkaran>(); // buat objek bangun datar generic
        bg.set(l); // set bangun datar
        System.out.println("Keliling Lingkaran: " + bg.hitungKeliling()); // hitung keliling lingkaran
        System.out.println("tipe generic : " + bg.get().getClass().getName()); // tampilkan tipe generic
    }
}