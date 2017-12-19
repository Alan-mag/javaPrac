public class Fibonacci {
  public static void main(String[] args) {
    // System.out.println(fib(2));
    // System.out.println(fib(3));
    // System.out.println(fib(4));
    // System.out.println(fastFib(100, 1, 0));
    System.out.println(fibonacci2(200, new int[200 + 1]));
  }

  public static int fib(int n) {
    if (n <= 2) {
      return 1;
    } else {
      return fib(n - 1) + fib(n - 2);
    }
  }


  // int val = 1;
  // int prev = 0;
  // fix
  public static int fastFib(int term, int val, int prev) {
    if (term == 0) {
      return prev;
    }
    if (term == 1) {
      return val;
    }
    int num = val+prev;
    return fastFib(term - 1, num, val);
  }; 

  // another example {getting negative values}
  public static int fibonacci2(int i, int[] memo) {
    if (i == 0 || i == 1) {
        return i;
    }

    if (memo[i] == 0) {
        memo[i] = fibonacci2(i - 1, memo) + fibonacci2(i - 2, memo);
    }
    return memo[i];
  }

}