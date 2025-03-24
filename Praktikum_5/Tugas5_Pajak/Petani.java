import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Petani extends Manusia implements IPajak{ 
    private String asalKota;
    private static int counterPetani = 0;
    private static final int C = 0; // Digit ke-12 NIM

    public Petani(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String asalKota) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.asalKota = asalKota;
        counterPetani++;
    }

    public String getAsalKota() {
        return asalKota;
    }

    public void setAsalKota(String asalKota) {
        this.asalKota = asalKota;
    }

    @Override
    public int hitungMasaKerja() {
        return (int) ChronoUnit.YEARS.between(this.gettglMulaiKerja(), LocalDate.now()) + C;
    }

    @Override
    public double hitungPajak() {
        return 0; // petani tidak kena pajak
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    @Override
    public void cetakInfo() {
        System.out.println("Info Petani");
        super.cetakInfo();
        System.out.println("Asal Kota : " + getAsalKota());
        System.out.println("Pajak : " + hitungPajak());
    }
}