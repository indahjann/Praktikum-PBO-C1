/* 
 * File       : Koleksi.java
 * Deskripsi  : Kelas generic untuk menyimpan koleksi elemen dengan berbagai operasi seperti tambah, hapus, dan tampilkan
 * Pembuat    : Indah Nurul Janah/24060123120009 
 * Tanggal    : 8 Mei 2025 
 */

public class Koleksi <T> {
    private int nbelm;
    private T[] wadah;

    public Koleksi(int n) {
        nbelm = 0;
        wadah = (T[]) new Object[n];
    }

    public T getIsi(int index) {
        if (index >= 0 && index < nbelm) {
            return wadah[index];
        } else {
            throw new IndexOutOfBoundsException("Index tidak valid!");
        }
    }

    public void setIsi(int index, T nilai) {
        if (index >= 0 && index < nbelm) {
            wadah[index] = nilai;
        } else {
            throw new IndexOutOfBoundsException("Index tidak valid!");
        }
    }

    public int getSize() {
        return nbelm;
    }

    public void setSize(int ukuranBaru) {
        if (ukuranBaru >= 0 && ukuranBaru <= wadah.length) {
            this.nbelm = ukuranBaru;
        } else {
            throw new IllegalArgumentException("Ukuran tidak valid!");
        }
    }

    public void add(T nilai) {
        if (nbelm < wadah.length) {
            wadah[nbelm++] = nilai;
        } else {
            System.out.println("Koleksi penuh. Tidak bisa menambahkan elemen.");
        }
    }

    public void delete(int index) {
        if (index >= 0 && index < nbelm) {
            for (int i = index; i < nbelm - 1; i++) {
                wadah[i] = wadah[i + 1];
            }
            wadah[--nbelm] = null;
        } else {
            System.out.println("Index tidak valid. Tidak bisa menghapus elemen.");
        }
    }

    public void showAll() {
        System.out.print("Isi koleksi: ");
        for (int i = 0; i < nbelm; i++) {
            System.out.print(wadah[i] + " ");
        }
        System.out.println();
    }

}
