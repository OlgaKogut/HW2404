public class TaskLoop_3 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 9 - i; j >= 0; j --) {
                System.out.print(" " + j);
            }
            for ( int j = 1; j < 10 - i; j ++) {
                System.out.print(" " + j);
            }
            System.out.println();
            String s = "  ";
            int k = i + 1;
            while ( k > 0) {
                System.out.print(s);
                k --;
            }
        }
    }
}
