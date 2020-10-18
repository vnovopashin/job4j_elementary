package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean code", 500);
        Book java = new Book("Java. Руководство для начинающих", 600);
        Book headFirstJava = new Book("Head First Java", 400);
        Book effectiveJava = new Book("Effective Java", 550);
        Book[] books = new Book[4];
        books[0] = cleanCode;
        books[1] = java;
        books[2] = headFirstJava;
        books[3] = effectiveJava;
        System.out.println("Каталог книг до перестановки");
        for (int index = 0; index < books.length; index++) {
            Book  book = books[index];
            System.out.println(book.getName() + " - " + book.getCount());
        }
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        System.out.println();
        System.out.println("Каталог книг после перестановки");
        for (int index = 0; index < books.length; index++) {
            Book  book = books[index];
            System.out.println(book.getName() + " - " + book.getCount());
        }
        System.out.println();
        System.out.println("Находим книгу Clean code");
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            if ("Clean code".equals(book.getName())) {
                System.out.println(book.getName());
            }
        }
    }
}
