package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class TichLonNhatNhoNhat {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();

    while (t > 0) {
      int n = sc.nextInt();
      int m = sc.nextInt();
      int arr[] = new int[n];
      int arr1[] = new int[m];
      int max = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
        if (max < arr[i]) {
          max = arr[i];
        }
      }
      for (int i = 0; i < n; i++) {
        arr1[i] = sc.nextInt();
        if (min > arr1[i]) {
          min = arr1[i];
        }
      }
      System.out.println((long) max * min);


      t--;
    }
  }
}
