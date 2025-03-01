public class Dosen {

    /****************ATRIBUT****************/
    private String nip;
    private String nama;
    private String prodi;

    /****************METHOD****************/

    // Konstruktor tanpa parameter.
    public Dosen() {
        nip = "";
        nama = "";
        prodi = "";
    }

    // Konstruktor dengan parameter
    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    // Selektor
    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }

    //Mutator
    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    // end class
}
