//Ex 12 : Create a Book class with title, author, and year. Add several books to a Set<Book>,
// including some with the same author and title.
// Implement equals and hashCode to ensure each book is unique.

import java.util.Objects;

public class Book implements Comparable<Book> {

     private final String title;
     private final String author;
     private final int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
     if(o instanceof Book book) {
         return book.title.equals(this.title)
                 && book.author.equals(this.author);
     } return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, year);
    }

    @Override
    public int compareTo(Book o) {
        return this.title.compareTo(o.title);
    }
}
