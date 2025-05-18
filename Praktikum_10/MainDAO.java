/*
 * File : MainDAO.java
 * Deskripsi : Main program untuk akses DAO
 * Pembuat : Indah Nurul Janah/24060123120009
 * Tanggal : 17 Mei 2025
 */
public class MainDAO {
    public static void main(String args[]) {
        Person person = new Person("Indah");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());
        
        try {
            m.getPersonDAO().savePerson(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
