package org.example;

public class CreditCard {
    Person owner;
    Money balance;
    Money CreditLimit;

    public CreditCard( Person owner, Money creditLimit){
        this.owner = owner;
        this.CreditLimit = new Money(creditLimit);
        this.balance = new Money(0);
    }

    public Money getBalance() {
        return new Money(balance);
    }

    public Money getCreditLimit() {
        return new Money(CreditLimit);
    }

    public String getPersonals() {
        return owner.toString();
    }

    public void charge(Money amount){
        Money newBalance = new Money(balance);

        if (newBalance.compareTo(getCreditLimit()) <= 0){
            balance = newBalance;
            System.out.println("Charge: " + amount);
        } else {
            System.out.println("Exceeds credit limit");
        }
    }

    public void payment(Money amount){
        balance = balance.subtract(amount);
        System.out.println("Payment: " + amount);
    }

}
