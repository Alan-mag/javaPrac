public class RecursionPrac {
  public static void main(String[] args) {
    System.out.println(gdc(144, 32));
  }

  // greatest common denominator method
  public static double gdc(int x, int y) {
    if (x < 0 || y < 0) {
      return gdc(Math.abs(x), Math.abs(y));
    } else if (y == 0) {
      // base case
      return x;
    } else {
      // recursive case
      return gdc(y, x % y);
    }
  }
}