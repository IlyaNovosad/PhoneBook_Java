package Sem6_End;

public class Main {
    public static void main(String[] args) {
        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.fillContacts(myPhoneBook);
        myPhoneBook.mainMenu(myPhoneBook);
    }
}