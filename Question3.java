public class Question3 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 6, 8, 9};
        int target = 10;

        int left = 0;
        int right = arr.length - 1;

        boolean found = false;

        while (left < right) {

            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println("Pair Found: "
                        + arr[left] + " and " + arr[right]);

                found = true;
                break;
            }
            else if (sum < target) {
                left++;
            }

            else {
                right--;
            }
        }
        if (!found) {
            System.out.println("No Pair Found");
        }
    }
}