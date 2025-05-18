/*
 * File : DAOManager.java
 * Deskripsi : pengelola DAO dalam program
 * Pembuat : Indah Nurul Janah/24060123120009
 * Tanggal : 17 Mei 2025
 */
public class DAOManager {
    private PersonDAO personDAO;

    public void setPersonDAO (PersonDAO person){
        personDAO = person;
    }

    public PersonDAO getPersonDAO(){
        return personDAO;
    }

}
