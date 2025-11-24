package payment;

import bankingEntity.*;

import java.util.Scanner;

public class CreditCardPayment implements PaymentMethod {
    private String cardNumber;
    private String cardHolderName;
    private String expiryDate;
    private String cvv;

    public void pay(double amount) {
        System.out.println("Bezahlung von " + amount + " mit Kreditkarte erfolgreich.");
    }

    public boolean validate(Bank bank) {
        return bank.validateCreditCard(cardNumber, cvv);
    }

    @Override
    public void einlesen() {
        Scanner scanner = new Scanner(System.in);
        // Zahlung mit Kreditkarte
        System.out.println("Kreditkartenzahlung:");
        System.out.print("Kartennummer: ");
        cardNumber = scanner.nextLine();
        System.out.print("Karteninhaber: ");
        cardHolderName = scanner.nextLine();
        System.out.print("Ablaufdatum (MM/YY): ");
        expiryDate = scanner.nextLine();
        System.out.print("CVV: ");
        cvv = scanner.nextLine();
    }
}
