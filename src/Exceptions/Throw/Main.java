package Exceptions.Throw;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            int x = Integer.parseInt(scanner.nextLine());

            if(x != 0) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("Пользователь ввел что-то кроме 0");
                }
            }
        }
    }
}
