public class Task4_3 {
    public static void main(String[] args) {
        for (int i = 40; i < 61; i ++) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("---------another variant----------");

        boolean check = true;
        int i = 40;
        while (check) {
            System.out.println(i);
            i +=4;
            check = i <= 60;

        }
    }
}
