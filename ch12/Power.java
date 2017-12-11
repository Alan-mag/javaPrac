import java.util.*;
import static java.lang.Math.*;

public class Power {
  public static void main(String[] args) {
    System.out.println(getPower(2, 3));

    System.out.println(getPower(6, 3));
  }

  public static double getPower(int x, int y) {
    if (y < 0) {
      throw new IllegalArgumentException("negative exponent: " + y);
    } else if (y == 0) {
      return 1;
    } else if (y % 2 == 0) {
      return getPower(x * x, y / 2);
    } else {
      return x * getPower(x, y - 1);
    }
  }
}