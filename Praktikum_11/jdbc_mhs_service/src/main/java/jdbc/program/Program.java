/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.program;

import java.sql.SQLException;
import java.util.List;
import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;

/**
 *
 * @author Asus
 */
public class Program {
    static MysqlMahasiswaService service;
    public static void main(String[] args) throws Exception {
        service = new MysqlMahasiswaService();
        System.out.println("");

        // insert
        System.out.println("===insert");
        Mahasiswa mhsAdd = new Mahasiswa(5, "Haryo");
        service.add(mhsAdd);
        System.out.println("berhasil insert: " + mhsAdd);
        displayAll();

        // update
        System.out.println("===update");
        Mahasiswa mhsUpdate = (Mahasiswa) service.getById(5);
        System.out.println("Akan diupdate data lama: " + mhsUpdate);
        mhsUpdate.setNama("Dinaya");
        System.out.println("dengan data baru: " + mhsUpdate);
        service.update(mhsUpdate);
        displayAll();

        // delete
        System.out.println("===delete");
        System.out.println("akan di delete: " + service.getById(5));
        service.delete(5);
        displayAll();
    }

    private static void displayAll() throws SQLException {
        List<Mahasiswa> list = service.getAll();
        System.out.println("Isi tabel mahasiswa: ");
        for (Mahasiswa m : list) {
            System.out.println(m);
        }
    }
}
