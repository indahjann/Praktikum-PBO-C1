/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.service;

/**
 *
 * @author Asus
 */

import java.sql.*;
import java.util.*;
import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;

public class MysqlMahasiswaService {
    Connection koneksi = null;

    // Constructor
    public MysqlMahasiswaService() throws SQLException {
        koneksi = (Connection) MysqlUtility.getConnection();
    }

    public Mahasiswa makeMhsObject(ResultSet rs) throws SQLException {
        int id = rs.getInt("id");
        String nama = rs.getString("nama");
        return new Mahasiswa(id, nama);
    }

    public void add(Mahasiswa mhs) throws SQLException {
        String sql = "INSERT INTO mahasiswa (id, nama) VALUES (?, ?)";
        PreparedStatement stmt = koneksi.prepareStatement(sql);
        stmt.setInt(1, mhs.getId());
        stmt.setString(2, mhs.getNama());
        stmt.executeUpdate();
    }

    public void update(Mahasiswa mhs) throws SQLException {
        String sql = "UPDATE mahasiswa SET nama = ? WHERE id = ?";
        PreparedStatement stmt = koneksi.prepareStatement(sql);
        stmt.setString(1, mhs.getNama());
        stmt.setInt(2, mhs.getId());
        stmt.executeUpdate();
    }

    public void delete(int id) throws SQLException {
        String sql = "DELETE FROM mahasiswa WHERE id = ?";
        PreparedStatement stmt = koneksi.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.executeUpdate();
    }

    public Mahasiswa getById(int id) throws SQLException {
        String sql = "SELECT * FROM mahasiswa WHERE id = ?";
        PreparedStatement stmt = koneksi.prepareStatement(sql);
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            return makeMhsObject(rs);
        }
        return null;
    }

    public List<Mahasiswa> getAll() throws SQLException {
        List<Mahasiswa> list = new ArrayList<>();
        String sql = "SELECT * FROM mahasiswa";
        Statement stmt = koneksi.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            list.add(makeMhsObject(rs));
        }
        return list;
    }
}
