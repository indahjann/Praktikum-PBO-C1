/*
 * File : ReadSerializedPerson.java
 * Deskripsi :Program untuk serialisasi objek Person
 * Pembuat : Indah Nurul Janah/24060123120009
 * Tanggal 17 Mei 2025
 */

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadSerializedPerson {
    public static void main(String[] args) {
        Person person = null;
        try {
            FileInputStream f = new FileInputStream("person.ser");
            ObjectInputStream s = new ObjectInputStream(f);
            person = (Person) s.readObject();
            s.close();
            System.out.println("serialized person name = " + person.getName());
        } catch (Exception ioe) {
             ioe.printStackTrace();
        }
    }
}
