public class Question2  {

    public static void main(String[] args) {

        int[] arr = {4, 2, 9, 1, 7, 5};

      
        int max = arr[0];
        int min = arr[0];

        // Traverse array
        for (int i = 1; i < arr.length; i++) {

        
            if (arr[i] > max) {
                max = arr[i];
            }

            
            if (arr[i] < min) {
                min = arr[i];
            }
        }

      
        System.out.println("Maximum Element: " + max);
        System.out.println("Minimum Element: " + min);
    }
}