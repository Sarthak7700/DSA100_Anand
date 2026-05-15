public class Question6 {

    public static void main(String[] args) {

        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println("Duplicate Elements:");

        for (int i = 0; i < arr.length; i++) {
            int index = Math.abs(arr[i]) - 1;
            if (arr[index] < 0) {
                System.out.println(Math.abs(arr[i]));
            }
            else {
                arr[index] = -arr[index];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.abs(arr[i]);
        }
    }
}