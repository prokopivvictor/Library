import entities.librarian.Librarian;
import entities.reader.Reader;

public class Main {
    public static void main(String[] args) {
        Librarian librarian = new Librarian();
        librarian.issue("Reading Room");
        librarian.issue("Subscription");
        Reader reader = new Reader();
        reader.order();
        reader.find();
    }
}
