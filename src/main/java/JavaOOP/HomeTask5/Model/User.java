package JavaOOP.HomeTask5.Model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class User {
    private String firstName;
    private String secondName;
    private String lastName;
    private Integer yearOfBirth;

    public User(String firstName, String secondName, String lastName, Integer yearOfBirth) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return " "
                + firstName +
                ", " + secondName +
                ", " + lastName +
                ", " + yearOfBirth;
    }


}