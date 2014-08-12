package entities.reader;

public class Reader {
    private String login;
    private String password;
    private String mail;
    private String name;
    private IFind find;
    private IOrder order;

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

    public void find() {
        find = new ReaderService();
        find.find();
    }

    public void order() {
        order = new ReaderService();
        order.order();
    }
}
