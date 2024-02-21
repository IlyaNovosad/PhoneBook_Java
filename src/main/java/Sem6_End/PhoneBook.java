package Sem6_End;

import java.util.*;

public class PhoneBook {
    private final HashMap<String, List<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }
    public void mainMenu(PhoneBook phoneBook) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add new contact");
            System.out.println("2. Delete a contact");
            System.out.println("3. Delete a phone number of a contact");
            System.out.println("4. Show contact");
            System.out.println("5. Exit from phonebook");
            System.out.print("Please insert a menu item: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Please input name: ");
                    String name = scanner.nextLine();
                    System.out.print("please input number: ");
                    String phone = scanner.nextLine();
                    phoneBook.add(name, phone);
                    break;
                case 2:
                    System.out.print("Please input a name for deleting: ");
                    String deleteName = scanner.nextLine();
                    phoneBook.deleteContact(deleteName);
                    break;
                case 3:
                    System.out.println("Please input name for deleting phone number of contact:");
                    String removeName = scanner.nextLine();
                    System.out.println("Please input number: ");
                    String removeNumber = scanner.nextLine();
                    phoneBook.removeNumber(removeName, removeNumber);
                    break;
                case 4:
                    phoneBook.getAllContacts();
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Wrong menu item.");
            }
        }
    }
    public void fillContacts(PhoneBook phoneBook) {
        phoneBook.add("Ivanov", "89991234567");
        phoneBook.add("Ivanov", "89119876543");
        phoneBook.add("Novosad", "89803553015");
        phoneBook.add("Petrov", "89057894532");
        phoneBook.add("Petrov", "89169087856");
        phoneBook.add("Petrov", "89218766756");
        phoneBook.add("Gulyaev", "89669876754");
    }
    public void add(String name, String phoneNumber) {
        if (phoneBook.containsKey(name)) {
            List<String> phoneNumbers = phoneBook.get(name);
            phoneNumbers.add(phoneNumber);
        } else {
            List<String> phoneNumbers = new ArrayList<>();
            phoneNumbers.add(phoneNumber);
            phoneBook.put(name, phoneNumbers);
        }
    }

    public void removeNumber(String name, String num) {
        if (phoneBook.containsKey(name)){
            List<String> phoneNumbers = phoneBook.get(name);
            phoneNumbers.remove(num);
        }
    }


    public void deleteContact(String name) {
        phoneBook.remove(name);
    }

    public void getAllContacts() {
        List<Map.Entry<String, List<String>>> sortList = new ArrayList<>(phoneBook.entrySet());
        sortList.sort((entry1, entry2) -> Integer.compare(entry2.getValue().size(), entry1.getValue().size()));

        for (Map.Entry<String, List<String>> entry : sortList) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}