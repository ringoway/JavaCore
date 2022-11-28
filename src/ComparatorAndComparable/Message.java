package ComparatorAndComparable;

import java.util.Comparator;
import java.util.Random;

public class Message{
    private String message;
    private int id;

    public Message(String message){
        this.message = message;
        this.id = new Random().nextInt(10000);
    }

    public String getMessage() {
        return message;
    }

    public int getId() {
        return id;
    }
    public String toString(){
        return "<" + id + "> " + message;
    }


}
