package JavaOOP.Sem5.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class User {
    private String firstName;
    private String secondName;
    private String lastName;

    public User(String firstName, String secondName, String lastName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }

    public User() {
    }

    @Override
    public String toString() {
        return " " + "User{" +
                "firstName='" + getFirstName() + '\'' +
                ", secondName='" + getSecondName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                '}';
    }
}
