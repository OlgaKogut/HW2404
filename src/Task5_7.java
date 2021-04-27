public class Task5_7 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int numberOfElements = 0;

        for (int i = 0; i < array.length; i++) {
            numberOfElements += array[i].length;
        }
        System.out.println("Number of elements: " + numberOfElements);
    }
}
