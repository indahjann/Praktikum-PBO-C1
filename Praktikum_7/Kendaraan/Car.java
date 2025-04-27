public class Car extends Vehicle {
    void calRent(int jarak, float harga) {
        float fare = jarak * harga;
        System.out.println("harga sewa mobil = " + fare);
    }
}
