package dsa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class KhoangCachXaNhatV2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    while (t > 0) {
      int n = sc.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();

      }

      int maxDistance = n - 1;
      int i, j;
      x:
      while (maxDistance > 0) {
        j = n - 1;
        while (j >= maxDistance) {

          i = j - maxDistance;

          if (arr[j] > arr[i]) {
            System.out.println(maxDistance);
            break x;
          } else {
            j--;
          }

        }
        maxDistance--;
      }
      if (maxDistance == 0) {
        System.out.println(maxDistance - 1);
      }


      t--;
    }

  }
}

