import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pengusaha extends Manusia implements IPajak{
    private static int counterPengusaha = 0;
    private String npwp;
    private static final int B = 0; // Digit ke-13 dari NIM Anda

    public Pengusaha(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String npwp) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public String getNpwp() {
        return npwp;
    }

    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    @Override
    public int hitungMasaKerja() {
        return (int) ChronoUnit.YEARS.between(this.gettglMulaiKerja(), LocalDate.now()) + B;
    }

    @Override
    public double hitungPajak() {
        return 0.15 * getPendapatan();
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    @Override
    public void cetakInfo() {
        System.out.println("Info Pengusaha");
        super.cetakInfo();
        System.out.println("NPWP : " + getNpwp());
        System.out.println("Pajak : " + hitungPajak());
    }
}