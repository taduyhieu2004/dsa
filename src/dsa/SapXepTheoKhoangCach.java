package dsa;

import java.util.*;

public class SapXepTheoKhoangCach {
  static Map<Integer, Integer> m = new HashMap<>();

  public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    while (t-- > 0) {
      int n = scanner.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = scanner.nextInt();

        if (m.containsKey(arr[i])) {
          m.put(arr[i], m.get(arr[i]) + 1);
        } else {
          m.put(arr[i], 1);
        }
      }

     for(int i =0; i< n; i++){
       for(int j =i+1; j< n; j++){
         if(m.get(arr[i]) < m.get(arr[j])){
           int a = arr[i];
           arr[i] = arr[j];
           arr[j] = a;
         } else if (m.get(arr[i]) == m.get(arr[j])) {
           if(arr[i] > arr[j]){
             int a = arr[i];
             arr[i] = arr[j];
             arr[j] = a;
           }

         }
       }
     }

      for (int i = 0; i < n; i++) {
        System.out.print(arr[i] + " ");
      }
      System.out.println();
    }
  }

}
