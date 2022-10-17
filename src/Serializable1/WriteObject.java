package Serializable1;

import java.io.*;

public class WriteObject { //запись
    public static void main(String[] args) {
        Person person1 = new Person(1, "Georgy");
        Person person2 = new Person(2, "Mickael");

        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(person1);
            oos.writeObject(person2);

            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
