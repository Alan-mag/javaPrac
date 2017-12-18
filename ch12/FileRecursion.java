import java.util.*;
import java.io.File;

// This program prompts the user for a file or directory name
// and shows a listing of all files and directories that can
// be reached from it (including subdirectories)

public class FileRecursion {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.print("directory of file name? ");
    String name = console.nextLine();
    File f = new File(name);
    if (!f.exists()) {
      System.out.print("No such file/directory");
    } else {
      print(f, 0);
    }
  }

  public static void print(File f, int level) {
    for (int i = 0; i < level; i++) {
      System.out.print("    ");
    }
    System.out.println(f.getName());
    if (f.isDirectory()) {
      for (File subF : f.listFiles()) {
        // print info on subF - recursively call back our function
        print(subF, level + 1);
      }
    }
  }
};