import bankingEntity.Bank;
import payment.CreditCardPayment;
import payment.PayPalPayment;
import payment.BitcoinPayment;
import payment.PaymentMethod;

import java.util.Scanner;

public class HasePaymentSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PaymentMethod method = null;
        Bank bank = new Bank();

        while (true) {
            System.out.println("Bitte wählen Sie eine Zahlungsmethode:");
            System.out.println("1. Kreditkarte");
            System.out.println("2. PayPal");
            System.out.println("3. Bitcoin");
            System.out.println("0. Beenden");
            System.out.print("Ihre Wahl: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Konsumiert das verbleibende newline-Zeichen

            switch (choice) {
                case 1:
                    method = new CreditCardPayment();
                    break;
                case 2:
                    method = new PayPalPayment();
                    break;
                case 3:
                    method = new BitcoinPayment();
                    break;
                case 0:
                    System.out.println("Programm beendet.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Ungültige Auswahl. Bitte versuchen Sie es erneut.");
                    continue;
            }

            pay(method, scanner, bank);
        }
    }

    private static void pay(PaymentMethod method, Scanner scanner, Bank bank) {
        if (method != null) {
            method.einlesen();
            System.out.print("Bitte geben Sie den Betrag ein: ");
            double amount = scanner.nextDouble();
            scanner.nextLine(); // Konsumiert das verbleibende newline-Zeichen

            if (method.validate(bank)) {
                method.pay(amount);
            } else {
                System.out.println("Validierung fehlgeschlagen.");
            }
        }
    }
}
