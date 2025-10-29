import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
 
public class AnagramChecker {
 
    public static boolean anagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
 
        Map<Character, Integer> charCount1 = new HashMap<>();
        for (char c : str1.toCharArray()) {
            charCount1.put(c, charCount1.getOrDefault(c, 0) + 1);
        }
 
        for (char c : str2.toCharArray()) {
            if (!charCount1.containsKey(c)) return false;
            charCount1.put(c, charCount1.get(c) - 1);
            if (charCount1.get(c) == 0) charCount1.remove(c);
        }
 
        return charCount1.isEmpty();
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // consume newline
 
        for (int h = 0; h < t; h++) {
            int n = sc.nextInt();
            String s1 = sc.next();
            String s2 = sc.next();
 
            boolean ans = anagrams(s1, s2);
            System.out.println(ans ? "YES" : "NO");
        }
 
        sc.close();
    }
}