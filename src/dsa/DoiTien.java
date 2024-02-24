package dsa;

import java.util.Scanner;

public class DoiTien {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

//    1, 2, 5, 10, 20, 50, 100, 200, 500, 1000
    while (t > 0) {
      int count = 0;
      int n = sc.nextInt();
      int x;
      while (n > 0) {
        if (n >= 1000) {
          count+= n/1000;
          x= n/1000;
          n -= 1000*  x;

        } else if (n >= 500) {
          count+= n/500;
          x= n/500;
          n -= 500 * x;


        } else if (n >= 200) {
          count+= n/200;
          x= n/200;
          n -= 200 * x;


        } else if (n >= 100) {
          count+= n/100;
          x= n/100;
          n -= 100 * x;

        } else if (n >= 50) {
          count+= n/50;
          x= n/50;
          n -= 50 * x;

        } else if (n >= 20) {
          count+= n/20;
          x= n/20;
          n -= 20 * x;

        } else if (n >= 10) {
          count+= n/10;
          x= n/10;
          n -= 10 * x;

        } else if (n >= 5) {
          count+= n/5;
          x= n/5;
          n -= 5 * x;

        } else if (n >= 2) {
          count+= n/2;
          x= n/2;
          n -= 2 * x;

        } else {
          count += n;
          n--;


        }
      }
      System.out.println(count);
      t--;
    }
  }
}
