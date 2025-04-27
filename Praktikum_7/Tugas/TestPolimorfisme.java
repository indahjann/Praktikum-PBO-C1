/*
 * Nama file : main.java
 * Deskripsi : Kelas main untuk mendemonstrasikan penggunaan kelas Anabul, Kucing, Anjing dan Burung
 * Pembuat : 24060123120009/Indah Nurul Janah
 * Tanggal : 23 Maret 2025
 */

 import java.util.ArrayList;

 public class TestPolimorfisme {
     public static void main(String[] args) {
         Anabul anabul1 = new Kucing("Kitty");
         Anabul anabul2 = new Anjing("Bobby");
         Anabul anabul3 = new Burung("Cici");
 
         ArrayList<Anabul> anabuls = new ArrayList<>();
         anabuls.add(anabul1);
         anabuls.add(anabul2);
         anabuls.add(anabul3);
 
         for (Anabul anabul : anabuls) {
             anabul.Bersuara();
             anabul.Gerak();
             System.out.println();
         }
     }
 }
 