package customer;

public class Customer {
private String name;
private String email;
private final int id;

public Customer(String name, String email, int id) {
    setName(name);
    setEmail(email);
    this.id = id;
}
public void setName(String name) {
    this.name = name;
}
public String getName() {
    return name;
}
public void setEmail(String email) {
    this.email = email;
}
public String getEmail() {
    return email;
}

public int getId() {
    return id;
}
}