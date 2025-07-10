package Generics;

public class Box<T> {
    T item;
    Box(T item)
    {
        this.item = item;
    }
    public String toString()
    {
        return "the item in the box is: " + this.item;
    }
}
