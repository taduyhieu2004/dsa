package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class ChenhLechNhoNhat {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] arr = new int[n];

      for (int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
      }

      Arrays.sort(arr);
      int min = arr[1]- arr[0];
      for(int i = 1; i < n; i++){
        min = Math.min(min, arr[i] - arr[i-1]);
      }
      System.out.println(min);
    }
  }
}
