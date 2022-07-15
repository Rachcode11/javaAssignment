package phonebook;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class PhonebookTest {

    @Test
    public void phonebookCanBeCreatedTest(){
        PhoneBook phoneBook = new PhoneBook();
        assertNotNull(phoneBook);
    }

    @Test
    void phonebookContactCanHaveA_NameTest(){
        PhoneBook phoneBook = new PhoneBook();
        String name = phoneBook.getContactName();
        assertEquals("Rachel", name);
    }

    @Test
    void phonebookContactCanHaveA_PhoneNumberTest(){
        PhoneBook phoneBook = new PhoneBook();
        String number = phoneBook.getContactPhoneNumber();
        assertEquals("0909999999", number);
    }

    @Test
    void phonebookContactCanHaveA_AddressTest(){
        PhoneBook phoneBook = new PhoneBook();
        String address = phoneBook.getContactAddress();
        assertEquals("yaba", address);
    }

    @Test
    void phonebookContactCanHaveA_EmailTest(){
        PhoneBook phoneBook = new PhoneBook();
        String email = phoneBook.getContactEmail();
        assertEquals("ececceec", email);
    }

    @Test
    void phonebookCanHaveContactTest(){
        PhoneBook phoneBook = new PhoneBook();
        Contacts contacts = phoneBook.createContact("Rachel", "0909999999", "yaba", "email");
        phoneBook.addContact(contacts);
        assertEquals(1, phoneBook.getNumberOfContacts());
    }

    @Test
    void phonebookCanHaveMultipleContactsTest(){
        PhoneBook phoneBook = new PhoneBook();

        Contacts contacts = phoneBook.createContact("Rachel", "0909999999", "yaba", "email");
        phoneBook.addContact(contacts);

        Contacts contacts1 = phoneBook.createContact("daniel", "09099888888", "sabo", "mail");
        phoneBook.addContact(contacts1);

        assertEquals(2, phoneBook.getNumberOfContacts());
    }


    @Test
    void ContactCanBeFoundByIdTest(){
        PhoneBook phoneBook = new PhoneBook();

        Contacts contacts = phoneBook.createContact("Rachel", "0909999999", "yaba", "email");
        phoneBook.addContact(contacts);

        Contacts contacts1 = phoneBook.createContact("daniel", "09099888888", "sabo", "mail");
        phoneBook.addContact(contacts1);

        String contact = phoneBook.findById(1);
        assertEquals("=================================================\n" +
                "                name:           Rachel\n" +
                "                phoneNumber:    0909999999\n" +
                "                address:        yaba\n" +
                "                email:          email\n" +
                "=================================================\n" +
                "\n", contact);
    }

    @Test
    void ContactCanBeDeletedFromPhoneBookTest(){
        PhoneBook phoneBook = new PhoneBook();

        Contacts contacts = phoneBook.createContact("Rachel", "0909999999", "yaba", "email");
        phoneBook.addContact(contacts);

        Contacts contacts1 = phoneBook.createContact("daniel", "09099888888", "sabo", "mail");
        phoneBook.addContact(contacts1);

        Contacts contacts2 = phoneBook.createContact("man", "090111", "", "");
        phoneBook.addContact(contacts2);

        phoneBook.deleteContact(2);

        assertEquals( 2, phoneBook.getNumberOfContacts());
    }

}
