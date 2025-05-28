/*
 * File : LambdaList.java
 * Deskripsi Implementasi lambda pada list, digunakan sebagai parameter pada method
 * Pembuat : Indah Nurul Janah/24060123120009
 * Tanggal : 28 Mei 2025
 */

import java.util.*;

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<String>();

        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        // lambda digunakan sebagai parameter
        mahasiswaList.forEach((name) -> System.out.println(name));
    }    
}