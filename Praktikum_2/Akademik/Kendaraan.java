public class Kendaraan {
    /****************ATRIBUT****************/
    private String noPlat;
    private String jenis;

    /****************METHOD****************/

    // Konstruktor dengan parameter
    public Kendaraan(){
        noPlat = "";
        jenis = "";
    }

    // Konstruktor dengan parameter
    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    // Selektor
    public String getNoPlat() {
        return noPlat;
    }

    public String getJenis() {
        return jenis;
    }
    
    // Mutator
    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    // end class
}
