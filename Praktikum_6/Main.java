/**
 * File         : Main.java
 * Deskripsi    : Program untuk menguji semua kelas di studi kasus universitas
 * Pembuat      : Indah Nurul Janah/24060123120009
 * Tanggal      : 28 Maret 2025
 */

public class Main {
    public static void main(String[] args) {

        // Membuat Objek Fakultas
        Fakultas fakultasTeknik = new Fakultas("Teknik", 5000000, 8000000);
        Fakultas fakultasMIPA = new Fakultas("MIPA", 4500000, 7500000);

        // Membuat Objek Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("Budi Santoso", "budi@univ.ac.id", "24060120140001", 1, fakultasTeknik);
        Mahasiswa mhs2 = new Mahasiswa("Siti Aminah", "siti@univ.ac.id", "24080120140002", 3, fakultasMIPA);

        // Membuat Objek Dosen
        Dosen dosen1 = new Dosen("Dr. Andi Wijaya", "andi@univ.ac.id", "123456789", 15, fakultasTeknik);
        Dosen dosen2 = new Dosen("Dr. Rina Kusuma", "rina@univ.ac.id", "987654321", 10, fakultasMIPA);

        // Membuat objek Tendik
        Tendik tendik1 = new Tendik("Eko Suprapto", "eko@univ.ac.id", "567890123", 20);
        Tendik tendik2 = new Tendik("Maya Sari", "maya@univ.ac.id", "678901234", 12);

        // Menampilkan informasi semua objek
        mhs1.printInfo();
        mhs2.printInfo();
        
        dosen1.printInfo();
        dosen2.printInfo();
        
        tendik1.printInfo();
        tendik2.printInfo();

        // Menambahkan Mahasiswa baru
        Mahasiswa mhs3 = new Mahasiswa("Rizky Hidayat", "rizky@univ.ac.id", "24060120140003", 1, fakultasTeknik);
        mhs3.printInfo();
    }
}
