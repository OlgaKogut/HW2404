import java.util.Locale;

public class Task6_3 {
    public static void main(String[] args) {
        String s = "Посмотрите как Рите нравится ритм";

        int index = s.toLowerCase(Locale.ROOT).indexOf("рит");


        for (int i = index + 3; i != -1; ) {
            System.out.println(index);
            index = s.toLowerCase(Locale.ROOT).indexOf("рит", index + 3);
            i = index;

        }
    }
}
