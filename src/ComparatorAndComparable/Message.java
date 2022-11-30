package ComparatorAndComparable;

import java.util.Comparator;
import java.util.Random;

public class Message implements Comparator<Message>{
    private String name;
    private String message;
    private int id;

    public Message(String name, String message){
        this.name = name;
        this.message = message;
        this.id = new Random().nextInt(10000);
    }

    public String getMessage() {
        return message;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    public String toString(){
        return "<" + id + "> " + name +" send: "+message;
    }

    @Override
    public int compare(Message o1, Message o2) {
        return o1.getMessage().compareTo(o2.getMessage());
    }
}
