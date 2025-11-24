package bankingEntity;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<String, String> creditCardData = new HashMap<>();
    private Map<String, String> paypalData = new HashMap<>();

    public Bank() {
        String kartennummer1 = "8765437812357649";
        String cvv1 = "345";
        String kartennummer2 = "2397638673433245";
        String cvv2 = "657";

        String email1 = "mueller@bestmail.com";
        String password1 = "geheim";
        String email2 = "steinber.m@mailsystem.de";
        String password2 = "ramz";

        // Beispielhafte Initialisierung von Daten
        creditCardData.put("1234567812345678", "123");
        creditCardData.put(kartennummer1, cvv1);
        creditCardData.put(kartennummer2, cvv2);
        paypalData.put("user@example.com", "password123");
        paypalData.put(email1, password1);
        paypalData.put(email2, password2);
    }

    public boolean validateCreditCard(String cardNumber, String cvv) {
        return creditCardData.containsKey(cardNumber) && creditCardData.get(cardNumber).equals(cvv);
    }

    public boolean validatePayPal(String email, String password) {
        return paypalData.containsKey(email) && paypalData.get(email).equals(password);
    }
}
