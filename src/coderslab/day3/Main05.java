package coderslab.day3;

public class Main05 {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("xyz");
            System.out.println(num);

        } catch (NumberFormatException e) {
            System.out.println("podana wartość musi być wartością liczbową");
        }
        try {
            int num = Integer.parseInt("12a");
            System.out.println(num);

        } catch (NumberFormatException e) {
            System.out.println("podana wartość musi być wartością liczbową");
        } finally {
            System.out.println("to się wyświetli zawsze ... :)");

        }
    }
}

