//Create a Book class with title, author, and year. Add several books to a Set<Book>,
// including some with the same author and title. Implement equals and hashCode to ensure each book is unique.

import java.util.*;

public class Ex12 {
    public static void main(String[] args) {

        Set<Book> books = new TreeSet<>();

        books.add(new Book("Jocurile foamei", "Suzanne Collins", 2018 ));
        books.add(new Book("Divergent", "Veronica Roth", 2011));
        books.add(new Book("La rascruce de vanturi", "Emily Bronte", 1847));
        books.add(new Book("Confess", "Colleen Hoover", 2022));
        books.add(new Book("Jocurile foamei", "Suzanne Collins", 2018));
        books.add(new Book("Confess", "Colleen Hoover", 2022));

        System.out.println("Printing book details in unique alphabetical order by title: ");
        for (Book book : books) {
            System.out.println(book);
        }



    }
}
