import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PNS extends Manusia implements IPajak {
    private String nip;
    private static int counterPNS = 0;
    private static final int A = 9; // Digit ke-14 NIM

    public PNS(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String nip) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    @Override
    public int hitungMasaKerja() {
        return (int) ChronoUnit.YEARS.between(this.gettglMulaiKerja(), LocalDate.now()) + A;
    }

    @Override
    public double hitungPajak() {
        return 0.1 * getPendapatan();
    }

    public static int getCounterPNS() {
        return counterPNS;
    }

    @Override
    public void cetakInfo() {
        System.out.println("Info PNS");
        super.cetakInfo();
        System.out.println("NIP : " + getNip());
        System.out.println("Pajak : " + hitungPajak());
    }
}