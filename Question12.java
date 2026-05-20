// Approach
// 1. Reverse the entire string.
// 2. Reverse each word individually.

public class Question12 {

    // Function to reverse characters in array
    static void reverse(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    static String reverseWords(String str) {

        char[] arr = str.toCharArray();

        // Step 1: Reverse entire string
        reverse(arr, 0, arr.length - 1);

        // Step 2: Reverse each word
        int start = 0;

        for (int end = 0; end <= arr.length; end++) {

            if (end == arr.length || arr[end] == ' ') {

                reverse(arr, start, end - 1);

                start = end + 1;
            }
        }

        return new String(arr);
    }

    public static void main(String[] args) {

        String str = "hello world";

        System.out.println(reverseWords(str));
    }
}

// Easy method using split()

// String str = "hello world";

// String[] words = str.split(" ");

// for (int i = words.length - 1; i >= 0; i--) {
//     System.out.print(words[i] + " ");
// }