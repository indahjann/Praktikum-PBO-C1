/* 
 * File       : MAnabul.java
 * Deskripsi  : Kelas utama untuk menguji implementasi KoleksiAnabul dengan berbagai jenis Anabul
 * Pembuat    : Indah Nurul Janah/24060123120009 
 * Tanggal    : 9 Mei 2025 
 */

public class MAnabul {
    public static void main(String[] args) {
        KoleksiAnabul KoleksiAnabul = new KoleksiAnabul(10);

        Anabul Anjing1 = new Anjing("Bobby");
        Anabul Kucing1 = new Kucing("Luna");
        Anabul Burung1 = new Burung("Rio");
        Anabul Anjing2 = new Anjing("Max");
        Anabul Kucing2 = new Kucing("Milo");
        Anabul Burung2 = new Burung("Kiwi");
        Anabul Anjing3 = new Anjing("Rocky");
        Anabul Kucing3 = new Kucing("Cleo");
        Anabul Burung3 = new Burung("Sky");
        Anabul KucingT = new Kucing("Shadow");

        KoleksiAnabul.add(Anjing1);
        KoleksiAnabul.add(Kucing1);
        KoleksiAnabul.add(Burung1);
        KoleksiAnabul.add(Anjing2);
        KoleksiAnabul.add(Kucing2);
        KoleksiAnabul.add(Burung2);
        KoleksiAnabul.add(Anjing3);
        KoleksiAnabul.add(Kucing3);
        KoleksiAnabul.add(Burung3);
        KoleksiAnabul.add(KucingT);

        KoleksiAnabul.showAll();        
    }
}
