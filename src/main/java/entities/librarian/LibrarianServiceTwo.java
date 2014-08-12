package entities.librarian;

public class LibrarianServiceTwo implements IIssue {

    @Override
    public void issue() {
        System.out.println("Subscription Issue is complete");
    }
}
