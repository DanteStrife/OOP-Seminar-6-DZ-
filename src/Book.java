package src;

public class Book<T> {
    private T name;
    public Book(T name) {
        this.name = name;
    }
    public T getName() {
        return name;
    }
}