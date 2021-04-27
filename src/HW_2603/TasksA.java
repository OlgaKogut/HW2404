package HW_2603;

public class TasksA {

    public static String MakeUpperCase(String str){
        str = str.toUpperCase();
        return str;
    }

    public static String remove(String str) {
        return str.substring(1, str.length() - 1);
    }

    static String noSpace(final String x) {
        return x.replace(" ", "");
    }

    public static String updateLight(String current) {
        String changeLight = "";
        if (current == "green") {
            changeLight = "yellow";
        } else if (current == "yellow") {
            changeLight = "red";
        } else {
            changeLight = "green";
        }

        return changeLight;
    }

    public static String repeatStr(final int repeat, final String string) {
        return string.repeat(repeat);
    }

    public static void main(String[] args) {

        System.out.println(MakeUpperCase("hello"));
        System.out.println("_______________");

        System.out.println(remove("hello"));
        System.out.println("_______________");

        System.out.println(noSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"));
        System.out.println("_______________");

        System.out.println(updateLight("green"));
        System.out.println(updateLight("red"));
        System.out.println(updateLight("yellow"));
        System.out.println("_______________");

        System.out.println(repeatStr(5, "f"));
        System.out.println(repeatStr(3, "Hello!"));
        System.out.println("_______________");

    }


}
