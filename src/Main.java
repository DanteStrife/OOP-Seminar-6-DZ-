package src;

import src.Book;
import src.Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book<String> book1 = new Book<>("L'Inferno di Dante");
        library.AddBook(book1, 534, "Dante Alighieri", "L'Inferno di Dante", 1321);

        Book<String> book2 = new Book<>("Theory of relativity");
        library.AddBook(book1, 534, "Albert Einstein", "Theory of relativity", 1916);

        LibraryCard<Integer, String> card1 = library.lnBook(4532);
        LibraryCard<Integer, String> card2 = library.lnBook(5643);

        library.AllBookInfomation();
    }
}
