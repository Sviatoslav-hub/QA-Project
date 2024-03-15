
package domains;

import service.ContactValidators;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Створення об'єкту класу ContactManager
        ContactManager manager = new ContactManager();



        while (true) {
            try {
                System.out.println("1. Додати новий контакт");
                System.out.println("2. Вивести всі контакти");
                System.out.println("3. Вийти");
                System.out.print("Оберіть опцію: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Очистка буфера вводу

                switch (choice) {
                    case 1:
                        String name, surname, phoneNumber;
                        System.out.print("Введіть ім'я: ");
                        name = scanner.nextLine();
                        if (!ContactValidators.isValidName(name)) {
                            System.out.println("Неправильний формат імені. Введіть ім'я без цифр та спеціальних символів.\n");
                            break;
                        }

                        System.out.print("Введіть прізвище: ");
                        surname = scanner.nextLine();
                        if (!ContactValidators.isValidSurname(surname)) {
                            System.out.println("Неправильний формат прізвища. Введіть прізвище без цифр та спеціальних символів.\n");
                            continue;
                        }

                        System.out.print("Введіть номер телефону: ");
                        phoneNumber = scanner.nextLine();
                        if (!ContactValidators.isValidPhoneNumber(phoneNumber)) {
                            System.out.println("Неправильний формат номера телефону. Введіть 10 цифр без спеціальних символів.\n");
                            break;
                        }

                        Contact newContact = new Contact(name, surname, phoneNumber);
                        manager.addContact(newContact);
                        System.out.println("Контакт успішно доданий!\n");
                        break;
                    case 2:
                        System.out.println("Список всіх контактів:");
                        manager.displayAllContacts();
                        break;
                    case 3:
                        System.out.println("Програма завершує роботу.");
                        System.exit(0);
                    default:
                        System.out.println("Невірний вибір, спробуйте ще раз.\n");
                }
            } catch (Exception e) {
                System.out.println("Помилка введення. Спробуйте ще раз.\n");
                scanner.nextLine(); // Очистка буфера вводу
            }

        }
    }
}
