import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set<String> stooges = new HashSet<String>();

        stooges.add("Larry");
        stooges.add("Moe");
        stooges.add("Curly");
        stooges.add("Moe"); // name will not be duplicated in a set
        stooges.add("Shemp");
        stooges.add("Moe");
        System.out.println(stooges);
    }
}