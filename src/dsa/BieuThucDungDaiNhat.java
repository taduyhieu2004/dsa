package dsa;

import java.util.Scanner;
import java.util.Stack;

public class BieuThucDungDaiNhat {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t > 0) {
      String s;
      s = sc.next();
      Stack<Character> stack = new Stack<>();
      int count  =0;
      for (int i = 0; i < s.length(); i++) {

        if (s.charAt(i) == '(') {
          stack.push('(');
        } else if (s.charAt(i) == ')'&& !stack.isEmpty()) {

          if (stack.peek() == '(' ) {
            stack.pop();
            count += 2;
          }
        }
      }
      System.out.println(count);
      t--;

    }


  }
}