package WriteToFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        File file = new File("testFile");
        try {
            PrintWriter pw = new PrintWriter(file);
            pw.println("Test line1");
            pw.println("Test line2");

            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Возникла ошибка при работе с файлом");

        }

    }
}
