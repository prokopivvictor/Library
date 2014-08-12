package entities.librarian;

public class LibrarianService implements IIssue {

    @Override
    public void issue() {
        System.out.println("Reading Room Issue is complete");
    }
}
