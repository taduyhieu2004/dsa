package dsa;

import java.util.Scanner;
import java.util.Stack;

public class DaoTu {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    while (t > 0) {
      String s;
      s = sc.nextLine();

      Stack<String> stack = new Stack<>();
      String[] str = s.split(" ");
      for (String value : str) {
        System.out.print(value + " ");
      }
      System.out.println();
      t--;

    }


  }
}
