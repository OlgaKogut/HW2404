public class Task5_4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        double average = 0;

        for (int i = 0; i < arr.length; i++) {
            average += arr[i];
        }

        average /= arr.length;
        System.out.println("Average: " + average);
    }
}
