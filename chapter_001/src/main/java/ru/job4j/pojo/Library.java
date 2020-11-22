package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean code", 402);
        Book mathematicalAnalysis = new Book("Mathematical analysis", 705);
        Book technicalEnglish = new Book("Technical English", 250);
        Book relationalDataModels = new Book("Relational data models", 604);
        Book[] books = new Book[4];
        books[0] = cleanCode;
        books[1] = mathematicalAnalysis;
        books[2] = technicalEnglish;
        books[3] = relationalDataModels;
        showBookList(books);
        System.out.println("\nChange the fourth book from the first\n");
        books[3] = cleanCode;
        books[0] = relationalDataModels;
        showBookList(books);
    }
    public static void showBookList(Book[] books){
        System.out.println("Show book list");
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " - " + book.getNumberOfPages());
        }
    }
}
