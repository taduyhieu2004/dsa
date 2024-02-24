package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class TichLonNhat {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = 0;
    n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();

    }

    Arrays.sort(arr);

    int a, b, c, e;
    a = arr[0] * arr[1];
    b = arr[0] * arr[1] * arr[n - 1];
    c = arr[n - 1] * arr[n - 2];
    e = arr[n - 1] * arr[n - 2] * arr[n - 3];
    System.out.println(Math.max(Math.max(a, b), Math.max(c, e)));

  }
}
