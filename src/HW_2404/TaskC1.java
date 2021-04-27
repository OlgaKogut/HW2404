package HW_2404;

import java.util.Locale;

public class TaskC1 {

    public static String abbrevName(String name) {
        String result = (name.charAt(0) + "." + name.charAt(name.indexOf(" ") + 1)).toUpperCase();
        return result;
    }

    public static boolean feast(String beast, String dish) {
        return ((beast.charAt(0) == dish.charAt(0)) && (beast.charAt(beast.length() - 1) == dish.charAt(dish.length() - 1)));

    }


    public static String tripleTrouble(String one, String two, String three) {
            String result = "";
            for (int i = 0; i < one.length(); i++) {
                result += "" + one.charAt(i) + two.charAt(i) + three.charAt(i);
            };
            return result;
    }

    public static String position(char alphabet) {
        int i = 1;
        int result = 0;
        for (char letter = 'a'; letter<='z'; letter ++) {
            if (alphabet == letter) {
                result = i;
            }
            i += 1;
        }
        return "Position of alphabet: " + result;
    }

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int result = 0;
        for(int i = 0; i < arr1.length; i++){
            result += arr1[i] + arr2[i];
        }
        return result;
    }


    public static void main(String[] args){
        //System.out.println(abbrevName("ser NTvak"));
        //System.out.println(feast("great blue heron","garlic nann"));
        //System.out.println(tripleTrouble("ak", "bb", "cc"));
        System.out.println(position('s'));
    }
}
