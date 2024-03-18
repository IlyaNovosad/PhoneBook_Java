package JavaException;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserData {
    private String surname;
    private String name;
    private String patronymicName;
    private String dateOfBirth;
    private String phoneNumber;
    private String gender;

    public UserData(String surname, String name, String patronymicName, String dateOfBirth, String phoneNumber, String gender) {
        this.surname = surname;
        this.name = name;
        this.patronymicName = patronymicName;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

}