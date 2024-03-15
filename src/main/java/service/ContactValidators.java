package service;

public class ContactValidators {
    // Метод для перевірки правильності імені (без цифр і спеціальних символів)
    public static boolean isValidName(String name) {
        return name.matches("[a-zA-Z ]+") && name.matches(".*[a-z].*");
    }

    public static boolean isValidPhoneNumber(String phoneNumber) {
        try {
            Long.parseLong(phoneNumber); // перевірка чи можна конвертувати в Long
            return phoneNumber.matches("\\d{10}"); // перевірка на 10 цифр
        } catch (NumberFormatException e) {
            return false; // якщо не вдалося сконвертувати в Long, то не є правильним номером телефону
        }
    }

    public static boolean isValidSurname(String surname) {
        return surname.matches("[a-zA-Z]+"); // Перевірка на наявність лише літер у прізвищі
    }
}

