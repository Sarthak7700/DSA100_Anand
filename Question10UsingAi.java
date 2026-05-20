// Use two pointers:
// left → start of window
// right → expands the window
// Keep adding characters until a duplicate is found.
// If duplicate occurs:
// Remove characters from the left side until duplicate is removed.
// Track the maximum window length.
// Example

// Input: "abcabcbb"

// Steps:

// "abc" → length = 3
// Next a is duplicate
// Move left pointer forward
// Continue checking

// Longest substring = "abc"
// Output = 3


import java.util.HashSet;

public class Question10UsingAi {
    public static int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";

        System.out.println(lengthOfLongestSubstring(s));
    }
}