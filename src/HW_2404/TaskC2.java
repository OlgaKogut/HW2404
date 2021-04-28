package HW_2404;

import java.util.Arrays;

public class TaskC2 {

    public static String boolToWord(boolean b)
    {
        if (b == false) {
            return "No";
        }else return "Yes";
    }

    public static Integer basicMath(String op, int v1, int v2) {
        switch (op) {
            case "+":
                return v1 + v2;
            case "-":
                return v1 - v2;
            case "*":
                return v1 * v2;
            case "/":
                return (v2 == 0) ? null : v1 / v2;
            default:
                return null;
        }
    }

    public static int[] reverse(int n){
        int[] arr = new int[n];
        for (int i = n; i > 0; i--){
            arr[n-i] = i;
        }
        return arr;
    }

    public static String[] stringToArray(String s) {
            return s.split(" ");
    }

    public static String correct(String string) {
        String s = string.replaceAll("5", "S").replaceAll("0","O").
                replaceAll("1","I");
        return s;
    }

    public static void main(String[] args){
        System.out.println(boolToWord(false));

        System.out.println(basicMath("/",100, 0));

        int[] array = reverse(6);
        System.out.println(Arrays.toString(array));

        String[] str = stringToArray("Rob sam Henry");
        System.out.println(Arrays.toString(str));

    }
}
