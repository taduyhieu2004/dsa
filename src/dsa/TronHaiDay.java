package dsa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TronHaiDay {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();

    while (t > 0) {
      int n = sc.nextInt(), m = sc.nextInt();
      int arr1[] = new int[n];

      List<Integer> list = new ArrayList<>();

      for (int i = 0; i < n; i++) {
        arr1[i] = sc.nextInt();

      }


      Collections.sort(list);

      for (Integer i : list) {
        System.out.print(i + " ");
      }
      System.out.println();
      t--;
    }
  }
}
