package Overloads;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Book {
    private String title;
    private int pages;
    private int publicationYear;

    public Book(String title, int pages, int publicationYear) {
        this.title = title;
        this.pages = pages;
        this.publicationYear = publicationYear;
    }

    public Book(String title) {
        System.out.println("Just the title huh? Well I'll figure it out I guess");
        this.title = title;
        this.pages = ThreadLocalRandom.current().nextInt(1, 101);
        this.publicationYear = ThreadLocalRandom.current().nextInt(1, 3000);
    }

    public String getTitle(){
        return this.title;
    }

    public int getPages() {
        return this.pages;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<Book>();
        while (true) {
            System.out.println("What is the title of the book?");
            String title = scanner.nextLine();
            if (title.equals("")) {
                break;
            }
            System.out.println("How many pages?");
            int pages = scanner.nextInt();
            scanner.nextLine();
            if (pages == 0) {
                books.add(new Book(title));
                continue;
            }
            System.out.println("What year was it published?");
            int year = scanner.nextInt();
            scanner.nextLine();

            books.add(new Book(title, pages, year));
        }

        System.out.print("What information will be printed? ");
        String answer = scanner.nextLine().toLowerCase();
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (answer.equals("everything")) {
                System.out.println(book.getTitle() + ", " + book.getPages() + " pages, " + book.getPublicationYear());
            } else if (answer.equals("name")) {
                System.out.println(book.getTitle());
            } else {
                System.out.println("Invalid response, exiting...");
            }
        }
    }
}
