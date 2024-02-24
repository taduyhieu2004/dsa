package dsa;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CapSoCoTongBangK {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();

    while (t > 0) {
      int n = sc.nextInt();
      long k = sc.nextLong();
      long[] arr = new long[100001];
      Map<Long, Long> map = new HashMap<>();
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextLong();

      }

      long count = 0;
      for (int i = 0; i < n; i++) {
        long b = k - arr[i];
        if (map.containsKey(b)) {
          count += map.get(b);
        }

        if (map.containsKey(arr[i])) {
          map.put(arr[i], map.get(arr[i]) + 1);
        } else {
          map.put(arr[i], 1L);
        }
      }

      System.out.println(count);
      t--;
    }
  }
}
