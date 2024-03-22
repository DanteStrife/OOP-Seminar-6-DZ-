package src;

import src.Book;

interface InteractionWithBook { // Open-closed principle
    <T> void AddBook(Book<T> book, int numCard, String Author, String Name, int Year); // Single responsibility principle


    public void AllBookInfomation();// Single responsibility principle( Операции производимые с книгами)

}
