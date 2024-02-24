package dsa;

import java.util.Scanner;

public class SoLanXuatHien {

  private static int handle(int arr[], int x) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == x) {
        count++;
      }
    }
    if(count==0){
      return -1;
    }
    return count;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numTest;
    numTest = sc.nextInt();
    for (int i = 0; i < numTest; i++) {
      int n = sc.nextInt(), x = sc.nextInt();
      int arr[] = new int[n];

      for (int j = 0; j < arr.length; j++) {
        arr[j] = sc.nextInt();
      }
      System.out.println(handle(arr, x));
    }
  }
}
