package coderslab.day3;

public class Main03 {
    public static void main(String[] args) {
        try {
            showLength(null);
        } catch (NullPointerException e) {
            System.out.println("parametr nie może przyjmować wartości null");
        }
    }

    static void showLength(String s) throws NullPointerException {
        System.out.println(s.length());
    }
}
