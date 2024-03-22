package src;

import java.util.ArrayList;
import java.util.List;

public class Library implements InteractionWithBook { // Логично использовать Dependency inversion principle, сделать абстракцию, но ломается Main

    protected List<LibraryCard<Integer, String>> Books;


    public Library() {
        this.Books = new ArrayList<>();
    }

    @Override
    public <T> void AddBook(src.Book<T> book, int numCard, String Author, String Name, int Year) {
        LibraryCard<Integer, String> card = new LibraryCard<>(numCard, " Автор: " + Author + " Название: " + Name + " Год издания: " + Year);
        Books.add(card);
    }

    public LibraryCard<Integer, String> lnBook(int nm) {
        for (LibraryCard<Integer, String> card : Books) {
            if (card.getNumcard() == nm) {
                return card;
            }
        }
        return null;
    }
    @Override
    public void AllBookInfomation() {
        for (LibraryCard<Integer, String> card : Books) {
            System.out.println("Карточка: " + card.getNumcard() + " Книга: " + card.getBookdescription());
        }
    }
}
