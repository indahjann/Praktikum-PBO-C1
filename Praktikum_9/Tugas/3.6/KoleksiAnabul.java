/* 
 * File       : KoleksiAnabul.java
 * Deskripsi  : Kelas untuk menyimpan koleksi Anabul dengan berbagai operasi seperti tambah, hapus, dan tampilkan
 * Pembuat    : Indah Nurul Janah/24060123120009 
 * Tanggal    : 9 Mei 2025 
 */

public class KoleksiAnabul {
    private Koleksi<Anabul> koleksi;

    public KoleksiAnabul(int kapasitas) {
        this.koleksi = new Koleksi<Anabul>(kapasitas);
    }

    public void add(Anabul anabul) {
        this.koleksi.add(anabul);
    }

    public Anabul delete() {
        Anabul x = this.koleksi.getIsi(0);
        this.koleksi.delete(0);
        return x;
    }

    public void showAll() {
        System.out.println("Isi Koleksi Anabul :");
        for (int i = 1; i <= this.koleksi.getSize(); i++) {
            Anabul x = this.koleksi.getIsi(i-1);
            if (x != null) {
                System.out.println("Anabul ke-" + i);
                System.out.println("Tipe Generik : " + x.getClass().getName());
                System.out.println("Nama : " + x.getNama());
                x.Gerak();
                x.Bersuara();
                System.out.println();
            }
        }
    }
}