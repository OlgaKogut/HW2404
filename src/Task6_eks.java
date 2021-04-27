public class Task6_eks {
    public static void main(String[] args) {
        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
        int numberOfString = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j].indexOf('е') == -1) {
                    numberOfString += 1;
                    System.out.println(array[i][j]);
                }
            }
        }
        System.out.println("_____________________");
        System.out.println("Number of strings: " + numberOfString);
    }
}
