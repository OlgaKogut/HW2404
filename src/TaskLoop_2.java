public class TaskLoop_2 {
    public static void main(String[] args) {
        for (int i = 0;  i < 10; i ++) {
            for (int j = 0; j < 10 - i; j ++) {
                System.out.print(" " + j + " ");
            }
            System.out.println();
            String s = "   ";
            int k = i + 1;
            while ( k > 0) {
                System.out.print(s);
                k --;
            }
        }
    }
}
