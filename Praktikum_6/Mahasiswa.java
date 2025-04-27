/**
 * File         : Mahasiswa.java
 * Deskripsi    : Kelas untuk merepresentasikan mahasiswa di universitas
 * Pembuat      : Indah Nurul Janah/24060123120009
 * Tanggal      : 28 Maret 2025
 */

public class Mahasiswa extends CivitasAkademika {
    private String nim;
    private int semester;
    private Fakultas fakultas;
    private static int counter = 0;

    public Mahasiswa(String nama, String email, String nim, int semester, Fakultas fakultas) {
        super(nama, email);
        this.nim = nim;
        this.semester = semester;
        this.fakultas = fakultas;
        counter++;
    }

    public String getNIM() {
        return nim;
    }

    public int getSemester() {
        return semester;
    }

    public Fakultas getFakultas() {
        return fakultas;
    }

    public static int getCounter() {
        return counter;
    }

    public void setNIM(String nim) {
        this.nim = nim;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void setFakultas(Fakultas fakultas) {
        this.fakultas = fakultas;
    }

    public double hitungUKT() {
        double ukt = fakultas.getTarifUKT();
        for (int i = 2; i <= semester; i++) {
            ukt *= 0.95;
        }
        return ukt;
    }

    @Override
    public void printInfo() {
        System.out.println("=== Informasi Mahasiswa ===");
        super.printInfo();
        System.out.println("NIM        : " + nim);
        System.out.println("Semester   : " + semester);
        System.out.println("Fakultas   : " + fakultas.getNama());
        System.out.println("Biaya UKT  : " + hitungUKT());
        System.out.println("============================");
        System.out.println("Jumlah Mahasiswa : " + counter);
        System.out.println("============================\n");
        
    }

}
