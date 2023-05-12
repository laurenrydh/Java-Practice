package Lists;

import java.util.Scanner;
import java.util.ArrayList;

public class Book {
    private String title;
    private int pages;
    private int publicationYear;

    public Book(String title, int pages, int publicationYear) {
        this.title = title;
        this.pages = pages;
        this.publicationYear = publicationYear;
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
