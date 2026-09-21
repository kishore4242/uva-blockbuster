package customer;

public class Customer {
private String name;
private String email;

public Customer(String name, String email) {
    setName(name);
    setEmail(email);
}
private void setName(String name) {
    this.name = name;
}
private String getName() {
    return name;
}
private void setEmail(String email) {
    this.email = email;
}
private String getEmail() {
    return email;
}

}