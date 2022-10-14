package Exceptions.CheckedAndUnchecked;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        //Checked Exception(Compile time Exception) = исключ-е случаи в раб-е программы
        //Unchecked Exception(Runtime exception) = ошибка в рабоче программы.

        // Пример runtime exception

        int a = 1/0;
        System.out.println(a);

        String name = null;
        name.length();

        int[] arr = new int[3];
        System.out.println(arr[2]);
    }
}
