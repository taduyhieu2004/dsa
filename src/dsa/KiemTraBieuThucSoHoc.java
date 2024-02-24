package dsa;

import java.util.Scanner;
import java.util.Stack;

public class KiemTraBieuThucSoHoc {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    sc.nextLine();
    while (t > 0) {
      String s = sc.nextLine();
      Stack<Character> stack = new Stack<>();
      int count = 0;
      for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == '(' && count == 0) {
          stack.push(s.charAt(i));
        } else if (s.charAt(i) == '(' && count >= 2) {
          stack.pop();
          stack.push(s.charAt(i));
          count = 0;
        } else if (s.charAt(i) == ')' && count >= 2 && !stack.isEmpty()) {
          stack.pop();
          count = 0;
        } else if (s.charAt(i) == ')' && count == 1 && !stack.isEmpty()) {
          break;
        } else if (s.charAt(i) != '(' && s.charAt(i) != ')') {
          count++;
        }
      }

      if (stack.isEmpty()) {
        System.out.println("NO");
      } else {
        System.out.println("YES");
      }
      t--;
    }
  }
}
