package leetcode;

import java.util.*;

public class HelloWord {
  public String longestCommonPrefix(String[] strs) {
    String s = "";
    Arrays.sort(strs);
    String a = strs[0];
    String b = strs[strs.length -1];
    for(int i = 0; i < strs[0].length(); i++){
      if(strs[0].charAt(i) == strs[strs.length -1].charAt(i)){
        s+= strs[0].charAt(i);
      }
    }
    return s;
  }
  public static void removeDuplicateLetters(String s) {
    Map<Character, Integer> map = new HashMap<>();
    for(int i =0; i < s.length();  i++) {
      if (map.containsKey(s.charAt(i))) {
        for (int j = map.get(s.charAt(i)) + 1; j < i; j++) {
          if (s.charAt(j) < s.charAt(i)) {
            map.put(s.charAt(i), i);
          }
        }
      } else {
        map.put(s.charAt(i), i);
      }
    }

//      for(Character c : map.keySet()){
//        System.out.println(map.get(c));
//      }
    }




  public static void main(String[] args) {
   int a[]= null;
   a = new int[100];

    System.out.println();
  }
}
