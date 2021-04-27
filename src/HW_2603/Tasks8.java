package HW_2603;

public class Tasks8 {
    public static void main(String[] args) {

        Block figure = new Block(new int[] {2, 3, 5});
        Block f1 = new Block( new int[] {2,4,6});
        System.out.println("_________");

        System.out.println(f1.getWidth());
        System.out.println(f1.getLength());
        System.out.println(f1.getHeight());
        System.out.println(f1.getVolume());
        System.out.println(f1.getSurfaceArea());
        System.out.println("_________");

        Fighter player1 = new Fighter("Jerry", 30, 3);
        Fighter player2 = new Fighter("Harald", 20, 5);
        System.out.println(player2.declareWinner(player1, player2, "Jerry"));
    }

    }
