package src;

import java.awt.print.Book;

public class LibraryCard<K, V> {
    protected K numcard;
    private V bookdescription;
    public LibraryCard(K numcard, V bookdescription){
        this.numcard = numcard;
        this.bookdescription = bookdescription;
    }
    public K getNumcard() {
        return numcard;
    }
    public V getBookdescription() {
        return bookdescription;
    }
}
