package payment;

import bankingEntity.*;

import java.util.Scanner;

public class PayPalPayment implements PaymentMethod {
    private String email;
    private String password;

    public void pay(double amount) {
        System.out.println("Bezahlung von " + amount + " mit PayPal erfolgreich.");
    }

    public boolean validate(Bank bank) {
        return bank.validatePayPal(email, password);
    }

    @Override
    public void einlesen() {
        Scanner scanner = new Scanner(System.in);
        // Zahlung mit PayPal
        System.out.println("PayPal-Zahlung:");
        System.out.print("E-Mail: ");
        email = scanner.nextLine();
        System.out.print("Passwort: ");
        password = scanner.nextLine();
    }
}