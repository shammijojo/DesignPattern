package IteratorPattern;

public interface Collection {

    Iterator createIterator();

    void addItem(Object object);

}
