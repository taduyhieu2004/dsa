package dsa;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HopGiaoCuaHaiDaySo {
  public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while (t > 0) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[m];
        Set<Integer> set = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i < n; i++) {
          arr[i] = sc.nextInt();
          set.add(arr[i]);
          set1.add(arr[i]);
        }
        for (int i = 0; i < m; i++) {
          arr1[i] = sc.nextInt();
          set.add(arr1[i]);
          set2.add(arr[i]);
        }
        for (Integer i : set) {
          System.out.print(i + " ");
        }
        System.out.println();
        for (Integer i : set1) {
          if (set2.contains(i)) {
            System.out.print(i + " ");
          }
        }
        System.out.println();


        t--;
      }

  }
}
