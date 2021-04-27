package HW_2603;

public class Task7 {

    public static int doubleInteger(int i) {
        // Double the integer and return it!
        i *=2;
        return i;
    }

    public static boolean isLove(final int flower1, final int flower2) {
            return ((flower1 + flower2) % 2 != 0);
    }

    public static String numberToString(int num) {
        // Return a string of the number here!
        return String.valueOf(num);
    }

    public static int findSmallestInt(int[] args) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < args.length; i ++) {
            if (args[i] < min) {
                min = args[i];
            }
        }
        return min;

    }

    public static String countingSheep(int num) {
        String countSheep = "";
        for (int i = 1; i <= num; i ++) {
            countSheep = countSheep + i + " sheep...";
        }
        return countSheep;
    }


    public static void main(String[] args) {
        System.out.println(doubleInteger(3));
        System.out.println(doubleInteger(23));
        System.out.println("_______________");

        System.out.println(isLove(3, 7));
        System.out.println(isLove(4, 12));
        System.out.println(isLove(22, 11));
        System.out.println(isLove(11, 12));
        System.out.println("_______________");

        System.out.println(findSmallestInt(new int[]{78,56,232,12,11,43}));
        System.out.println("_______________");

        System.out.println(countingSheep(3));
        System.out.println(countingSheep(1));



    }

}
