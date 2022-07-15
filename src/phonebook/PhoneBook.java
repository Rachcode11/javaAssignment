package phonebook;


import java.util.ArrayList;

public class PhoneBook {
    private int numberOfContacts;
    private ArrayList<Contacts> phonebook;
    Contacts contacts = new Contacts("Rachel", "0909999999", "yaba", "ececceec");

    public PhoneBook() {
        phonebook = new ArrayList<>();
    }

    public String getContactName() {
        return contacts.getName();
    }

    public String getContactPhoneNumber() {
        return contacts.getPhoneNumber();
    }

    public String getContactAddress() {
        return contacts.getAddress();
    }

    public String getContactEmail() {
        return contacts.getEmail();
    }

    public Contacts createContact(String name, String phoneNumber, String address, String email) {
        return new Contacts(name, phoneNumber, address, email);
    }

    public void addContact(Contacts contacts) {
        phonebook.add(contacts);
        numberOfContacts++;
    }

    public int getNumberOfContacts() {
        return numberOfContacts;
    }

    public String findById(int id) {
        int index = id - 1;
        for (int i = 0; i < phonebook.size(); i++) {
            Contacts contact = phonebook.get(i);
            if (index == i) {
                return contact.toString();
            }
        }
        return "Contact not found";
    }

    public void deleteContact(int id) {
        int index = id - 1;
        for (int i = 0; i < phonebook.size(); i++) {
            Contacts contact = phonebook.get(i);
            if (i == index){
                phonebook.remove(contact);
                numberOfContacts--;
            }
        }
    }
}
