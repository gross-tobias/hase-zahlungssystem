package payment;

import bankingEntity.*;

import java.util.Scanner;

public class BitcoinPayment implements PaymentMethod {
    private String wallet;

    public void pay(double amount) {
        System.out.println("Bezahlung von " + amount + " mit Bitcoin erfolgreich.");
    }

    public boolean validate(Bank bank) {
        return bank.validateBitcoin(wallet);
    }

    @Override
    public void einlesen() {
        Scanner scanner = new Scanner(System.in);
        // Zahlung mit PayPal
        System.out.println("Bitcoin-Zahlung:");
        System.out.print("Wallet: ");
        wallet = scanner.nextLine();
    }
}