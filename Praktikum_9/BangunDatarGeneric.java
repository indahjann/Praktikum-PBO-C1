public class BangunDatarGeneric<T extends BangunDatar> {
    // apa itu generic? generic adalah sebuah class yang dapat digunakan untuk berbagai tipe data
    
    private T bangunDatar; // generic type T yang merupakan subclass dari Bangun
    
    public void set(T tipeBangunDatar){
        this.bangunDatar = tipeBangunDatar; // set bangun datar
    }

    public T get(){
        return bangunDatar; // get bangun datar
    }

    public double hitungKeliling(){
        return bangunDatar.hitungKeliling(); // hitung keliling bangun datar
    }
}
