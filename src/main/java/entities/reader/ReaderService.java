package entities.reader;

import entities.book.Book;

public class ReaderService implements IOrder, IFind {
    @Override
    public void find() {
        System.out.println("Find is complete");
    }

    @Override
    public void order() {
        System.out.println("Order is complete");
    }
}
