package entities.librarian;

public class Librarian {
    private String login;
    private String password;
    private String mail;
    private String name;
    private IIssue issue;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void issue(String s) {
        if (s.equals("Reading Room")) {
            issue = new LibrarianService();
            issue.issue();
        }
        if (s.equals("Subscription")) {
            issue = new LibrarianServiceTwo();
            issue.issue();
        }
    }
}
