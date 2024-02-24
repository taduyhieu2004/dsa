package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class PhanTuLonNhat {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();


    while (t > 0) {
      int n = scanner.nextInt(), k = scanner.nextInt();
      int[] arr = new int[n];

      for (int i = 0; i < n; i++) {
        arr[i] = scanner.nextInt();
      }

      Arrays.sort(arr);

      for (int i = n - 1; i >= n - k; i--) {
        System.out.print(arr[i] + " ");
      }
      System.out.println();
      t--;
    }
  }
}
