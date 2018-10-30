package libraryPackage;


import javafx.beans.property.SimpleStringProperty;

//class used in accountFXML.java
public class Person {
    private SimpleStringProperty id;
    private SimpleStringProperty name;
    private SimpleStringProperty email;
    private SimpleStringProperty phone;


    public Person(String id, String name, String email, String phone) {
        this.id = new SimpleStringProperty(id);
        this.name = new SimpleStringProperty(name);
        this.phone = new SimpleStringProperty(phone);
        this.email = new SimpleStringProperty(email);
    }

    public String getId() {
        return id.get();
    }

    public String getName() {
        return name.get();
    }

    public String getPhone() {
        return phone.get();
    }

    public String getEmail() {
        return email.get();
    }

    public void setId(String id) {
        this.id.set(id);
    }

    public void setName(String name) {
        this.name = new SimpleStringProperty(name);
    }

    public void setPhone(String phone) {
        this.id.set(phone);
    }

    public void setEmail(String email) {
        this.id.set(email);
    }


}