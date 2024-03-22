package src;

public class Book<T> { // Логично использовать Dependency inversion principle, сделать абстракцию, но ломается Main
    private T name;
    public Book(T name) {
        this.name = name;
    }
    public T getName() {
        return name;
    }
}