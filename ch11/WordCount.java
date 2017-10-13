// Uses maps to implement a word count, so that the user
// can see which words occur the most in a book

import java.io.*;
import java.util.*;

public class WordCount {
    // minimum number of occurrences needed to be printed
    public static final int OCCURRENCES = 1000;

    public static void main(String[] args) 
        throws FileNotFoundException {
            System.out.println("This program displays the most");
            System.out.println("frequently occurring word from");
            System.out.println("the book I Robot.");
            System.out.println();

            // read the book into a map
            Scanner in = new Scanner(new File("asimov-i-robot.txt"));
            Map<String, Integer> wordCountMap = getCountMap(in);

            for (String word: wordCountMap.keySet()) {
                int count = wordCountMap.get(word);
                if (count > OCCURRENCES) {
                    System.out.println(word + " occurs " + count + " times.");
                }
            }
        }

    // Read book text and returns a map from words to counts.
    public static Map<String, Integer> getCountMap(Scanner in) {
        Map<String, Integer> wordCountMap = new TreeMap<String, Integer>();

        while(in.hasNext()) {
            String word = in.next().toLowerCase();
            if (wordCountMap.containsKey(word)) {
                // seen this word before
                int count = wordCountMap.get(word);
                wordCountMap.put(word, count + 1);
            } else {
                // first time seeing word
                wordCountMap.put(word, 1);
            }
        }

        return wordCountMap;
    }
}