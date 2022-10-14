package Exceptions.OtherException;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Main5 {
    public static void main(String[] args) {
        try {
            run();
        } catch (IOException | IllegalAccessException | ParseException e) { //multi catch
            throw new RuntimeException(e);
        }
        try {
            start();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } //все следующие catch если обработаются, то дальше идти не будет.


    }
    public static void run()throws IOException, ParseException, IllegalAccessException {

    }
    public static void start()throws IOException, ParseException, IllegalAccessException {

    }
}
