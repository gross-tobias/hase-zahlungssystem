package payment;

import bankingEntity.Bank;

public interface PaymentMethod {
    public void pay(double amount);
    public boolean validate(Bank bank);
    public void einlesen();
}
