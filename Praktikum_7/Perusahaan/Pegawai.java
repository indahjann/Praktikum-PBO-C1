public class Pegawai{
    private String nama;
    private int gajiPokok = 5000000;

    Pegawai(String nama) {
        this.nama = nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tampilData() {
        System.out.println("Nama : " + nama +
                ",  Gaji Pokok : " + gajiPokok);
    }
}