package Serializable3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class WriteObject { //запись
    public static void main(String[] args) {
        PersoN person1 = new PersoN(1, "Georgy");
        PersoN person2 = new PersoN(2, "Mickael");
        PersoN person3 = new PersoN(3, "Daddy");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people2.bin"))){
            oos.writeObject(person1);
            oos.writeObject(person2);
            oos.writeObject(person3);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
