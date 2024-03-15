package domains;

import java.util.ArrayList;
import java.util.List;

// Клас для зберігання контактів
class ContactManager {
    List<Contact> contacts;

    // Конструктор класу ContactManager
    public ContactManager() {
        contacts = new ArrayList<>();
    }

    // Метод для додавання нового контакту
    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    // Метод для виведення інформації про всі контакти
    public void displayAllContacts() {
        for (Contact contact : contacts) {
            contact.displayInfo();
            System.out.println(); // Друк пустого рядка для розділення контактів
        }
    }
}
