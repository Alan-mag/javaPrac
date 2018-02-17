import java.util.*;
import java.util.LinkedList;

public class QueuePrac {
  public static void main(String[] args) {
    Integer[] nums = {2, 4, 6, 9, 12, 14};
    Queue<Integer> q = new LinkedList<Integer>();
    for (Integer num : nums) {
      q.add(num);
    }
    System.out.println(q);
  }
}