package Serializable3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject { //считывание
    public static void main(String[] args) {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people2.bin"))) {
            PersoN person1 = (PersoN) ois.readObject();
            PersoN person2 = (PersoN) ois.readObject();
            PersoN person3 = (PersoN) ois.readObject();

            System.out.println(person1);
            System.out.println(person2);
            System.out.println(person3);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
