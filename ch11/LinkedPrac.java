import java.util.*;

public class LinkedPrac {
    public static void main(String[] args) {
        LinkedList<String> words = new LinkedList<String>();
        words.add("hello");
        words.add("goodbye");
        words.add("this");
        words.add("that");
        LinkedList<String> allOdds = removeEvenLength(words);
        System.out.println(allOdds);
    }

    // removes all strings of even length from the given linked list
    public static LinkedList<String> removeEvenLength(LinkedList<String> list) {
        Iterator<String> i = list.iterator();
        while (i.hasNext()) {
            String element = i.next();
            if (element.length() % 2 == 0) {
                i.remove();
            }
        }
        return list;
    }
}