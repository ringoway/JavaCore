package ComparatorAndComparable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Message> messages = new ArrayList<>();
        Comparator<Message> comparator = new Comparator<Message>(){
            public int compare(Message o1, Message o2) {
                return o1.getId().compareTo(o2.getId());
            }  
        };
        messages.add(new Message("Hello world"));
        messages.add(new Message("Hello countries"));
        System.out.println(messages);
    }
}
