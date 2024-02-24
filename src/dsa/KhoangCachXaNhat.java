package dsa;

import java.util.Scanner;

public class KhoangCachXaNhat {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t > 0) {
      int n = sc.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }

      int j;
      int distance = -1;
      int maxDistance = -1;
      for (int i = 0; i < n; i++) {
        j = n - 1;
        while (i < j) {
          if (arr[i] < arr[j]) {
            distance = j - i;
            maxDistance = Math.max(maxDistance, distance);
            break;
          } else {
            j--;
          }

          if (j - i == maxDistance) {
            break;
          }
        }

        if (n - i - 1 == maxDistance) {
          break;
        }
      }
      System.out.println(maxDistance);

      t--;
    }
  }
}
