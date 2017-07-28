// This program constucts a jagged two-dimensional
// array that stores Pascal's triangle. 

public class PascalsTriangle {
   public static void main(String[] args) {
      int[][] triangle = new int[11][];
      fillIn(triangle);
      print(triangle);
   }
   
   // create triangle
   public static void fillIn(int[][] triangle) {
      for (int i = 0; i < triangle.length; i++) {
         triangle[i] = new int[i + 1];
         triangle[i][0] = 1;
         triangle[i][i] = 1;
         for (int j = 1; j < i; j++) {
            triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
         }
      }
   }
   
   // print method
   public static void print(int[][] triangle) {
      for (int i = 0; i < triangle.length; i++) {
         for (int j = 0; j < triangle[i].length; j++) {
            System.out.print(triangle[i][j] + " ");
         }
         System.out.println();
         
      }
   }
}