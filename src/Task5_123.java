public class Task5_123 {
    public static void main(String[] args) {
        int[] arr = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sumElements = 0;
        int maxElement = Integer.MIN_VALUE;
        int minElement = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];
                if (arr[i] < minElement) {
                    minElement = arr[i];
                }
            }else if (arr[i] < minElement) {
                minElement = arr[i];
            }
            sumElements += arr[i];
        }

        System.out.println("Sum of elements: " + sumElements);
        System.out.println("Max element: " + maxElement);
        System.out.println("Min element: " + minElement);


    }
}
