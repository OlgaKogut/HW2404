public class Task6_2 {
    public static void main(String[] args) {
        String s = "Перевыборы выбранного президента";
        int number = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'е') {
                number ++;
            }
        }
        System.out.println(number);
    }
}
