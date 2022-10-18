package Serializable2_1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("people1.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Person[] persons = (Person[]) ois.readObject();

            System.out.println(Arrays.toString(persons));

            ois.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
