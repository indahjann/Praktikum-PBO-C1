/* 
 * File   : AngkaSial.java
 * Deskripsi : Program penggunaan exception buatan sendiri
 *              pengenalan klausa 'throw' dan 'throws'
 * Pembuat : Indah Nurul Janah/24060123120009
 * Tanggal : 7 Maret 2025
 */

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka +" bukan angka sial");
        //line diatas dieksekusi untuk masukan 10, tidak akan dieksekusi saat
        //masukan = 13
        //tidak akan dijalankan untuk statement yang ada setelah eksepsi (input = 13)
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException ase){
            //dieksekusi saat masukan cobaAngka = 13
            //akan dilempar ke Angka Sial Exception
            //method getMessage telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}
