package dsa;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BoBaSoPyTaGo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t > 0) {
      int n = sc.nextInt();
      Set<Long> set = new HashSet<>();
      long[] arr1 = new long[n];
      long[] arr2 = new long[n];
      for (int i = 0; i < n; i++) {
        arr1[i] = sc.nextLong();
        arr2[i] = arr1[i] * arr1[i];
        set.add(arr2[i]);
      }
      int check = 0;
      x:
      for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
          if (set.contains(arr2[i] + arr2[j])) {
            check = 1;
            break x;
          }
        }
      }
      if (check == 1) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
      t--;
    }
  }
}
