package coderslab.day1.atrybuty;

import coderslab.day1.klasy.Book;

public class Main01Book {
    public static void main(String[] args) {
        Book book1 = new Book();
        String bookName = book1.name;
        double price = book1.price;
        String author = book1.author;
        System.out.println(book1.name);
        System.out.println(book1.price);
        System.out.println(book1.author);
    }
}
