package Serializable2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person[] persons = {new Person(1, "Bob"), new Person(2, "Mike"),
        new Person(3, "Gleb")};

        try {
            FileOutputStream fos = new FileOutputStream("people1.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeInt(persons.length);

            for (Person person : persons){
                oos.writeObject(person);
            }
            fos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
