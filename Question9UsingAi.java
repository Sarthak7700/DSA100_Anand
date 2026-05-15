import java.util.*;

public class Question9UsingAi {

    public static List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();

        // Edge case
        if (s.length() < p.length()) {
            return result;
        }

        int[] pCount = new int[26];
        int[] windowCount = new int[26];

        // Store frequency of pattern
        for (int i = 0; i < p.length(); i++) {

            pCount[p.charAt(i) - 'a']++;
            windowCount[s.charAt(i) - 'a']++;
        }

        // Compare first window
        if (Arrays.equals(pCount, windowCount)) {
            result.add(0);
        }

        // Sliding window
        for (int i = p.length(); i < s.length(); i++) {

            // Add new character
            windowCount[s.charAt(i) - 'a']++;

            // Remove old character
            windowCount[s.charAt(i - p.length()) - 'a']--;

            // Compare frequency arrays
            if (Arrays.equals(pCount, windowCount)) {

                result.add(i - p.length() + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        String s = "cbaebabacd";
        String p = "abc";

        List<Integer> ans = findAnagrams(s, p);

        System.out.println("Anagram Indices: " + ans);
    }
}