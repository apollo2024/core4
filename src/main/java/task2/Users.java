package task2;

public class Users {
    String surname;
    String name;
    Integer phoneNumber;

    public Users(String surname, String name, Integer phoneNumber) {
        this.surname = surname;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Users() {
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
