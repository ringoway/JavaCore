package ReadingFromFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = separator+"Users"+separator+"azat"+separator+"Desktop"+separator+"ReadingFromFile.txt";

        File file = new File(path);

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
        ///////////
        String path1 = separator+"Users"+separator+"azat"+separator+"Desktop"+separator+"ReadInt.txt";
        File file1 = new File(path1);

        Scanner scanner1 = new Scanner(file1);
        String line = scanner1.nextLine();
        String[] numbersString = line.split(" ");

        int [] numbers = new int[3];
        int counter = 0;
        for(String number: numbersString){
            numbers[counter++] =Integer.parseInt(number);
        }
        System.out.println(Arrays.toString(numbersString));
        scanner.close();

    }
}
