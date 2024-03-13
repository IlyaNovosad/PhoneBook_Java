package JavaOOP.HomeTask6;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class User {
    private String firstName;
    private String secondName;
    private String lastName;

    public User(String firstName, String secondName, String lastName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "User {" + firstName +
                ", " + secondName +
                ", " + lastName +
                '}';
    }
}