package ComparatorAndComparable;

import java.util.ArrayList;

import java.util.List;

public class Main{
    public static void main(String[] args) {
        List<Message> messages = new ArrayList<>();

        messages.add(new Message("Hello world"));
        messages.add(new Message("Hello countries"));

        for (Message message: messages) {
            System.out.println(message);
        }
    }
}
