/*
 * File : LambdaList.java
 * Deskripsi Implementasi lambda pada list, digunakan sebagai parameter pada method
 * Pembuat : Indah Nurul Janah/24060123120009
 * Tanggal : 28 Mei 2025
 */

import java.util.*;

public class LambdaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaList = new HashMap<String, String>();

        mahasiswaList.put("24060123130001","Indah");
        mahasiswaList.put("24060123130002","Nurul");
        mahasiswaList.put("24060123130003","Janah");

        // lambda digunakan sebagai parameter
        mahasiswaList.forEach((nim,nama) -> {
            System.out.println(nim + " " + nama);
        });
    }    
}