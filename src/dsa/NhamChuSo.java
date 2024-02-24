package dsa;

import java.util.Scanner;

public class NhamChuSo {
  private static String getMin(String s) {
    StringBuilder s1 = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '6') {
        s1.append('5');
      } else {
        s1.append(s.charAt(i));
      }
    }
    return s1.toString();
  }

  private static String getMax(String s) {
    StringBuilder s2 = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '5') {
        s2.append('6');
      } else {
        s2.append(s.charAt(i));
      }
    }
    return s2.toString();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();

    System.out.print(Integer.parseInt(getMin(a)) + Integer.parseInt(getMin(b)) + " ");
    System.out.println( Integer.parseInt(getMax(a)) + Integer.parseInt(getMax(b)));
  }
}
