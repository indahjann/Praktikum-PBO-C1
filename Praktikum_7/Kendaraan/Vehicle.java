public class Vehicle{
    void calRent(int distance, float price){
        float fare = distance * price;
        System.out.println("vehicle price = " + fare);
    }

    void sewa(){
        System.out.println("sewa kendaraan");
    }
}