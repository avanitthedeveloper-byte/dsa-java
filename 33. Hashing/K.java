// 11. Valid Anagram

import java.util.*;

public class K {
    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sm = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            sm.put(ch, sm.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (sm.get(ch) != null) {
                if (sm.get(ch) == 1) {
                    sm.remove(ch);
                } else {
                    sm.put(ch, sm.get(ch) - 1);
                }
            } else {
                return false;
            }

            if (sm.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "race";
        String t = "care";

        System.out.println(isAnagram(s, t));
    }
}