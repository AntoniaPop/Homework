//Create a List<String> with book titles.
// Write methods to add a book title, remove a title, and check if a specific title exists.

import java.util.ArrayList;
import java.util.List;

public class Ex4 {


//    public static void main(String[] args) {

        //first method

//        List<String> books = new ArrayList<>();
//
//        books.add("Harap Alb");
//        books.add("Pe aripi de vant");
//        books.add("Enigma Otiliei");
//
//        System.out.println(books);
//
//        books.remove("Pe aripi de vant");
//        System.out.println(books);
//
//        books.remove(0);
//        System.out.println(books);
//
//
//
//
//    }
            //second method
private static List<String> bookTitles = new ArrayList<>();

    public static void main(String[] args) {

        addBookTitle("Pe aripi de vant");
        addBookTitle("Enigma Otiliei");
        addBookTitle("Harap Alb");

        System.out.println("Book titles are: " + bookTitles);
        System.out.println("----------");

        removeBookTitle("Harap Alb");
        removeBookTitle("Ion");

        System.out.println("After removing some titles, the titles are: " + bookTitles);
        System.out.println("------------");

        String titleToCheck = "Ion";
        System.out.println("Does the book " + titleToCheck + " exists? " + doesBookExists(titleToCheck));

        String titleToCheck2 = "Enigma Otiliei";
        System.out.println("Does the book " + titleToCheck2 + " exists? " +doesBookExists(titleToCheck2));

    }

    public static void addBookTitle(String title) {
        bookTitles.add(title);
        System.out.println("Added book : " + title);
    }

    public static void removeBookTitle(String title) {
        if (bookTitles.contains(title)) {
            bookTitles.remove(title);
            System.out.println("Removed book: " + title);
        } else
            System.out.println("The book you entered, does not exist.");
    }

    public static boolean doesBookExists(String title) {
        return(bookTitles.contains(title));
    }

}
