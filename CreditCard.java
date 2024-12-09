package org.example;

/**
 *
 * @author 2474008
 */

/**
 * The CreditCard class represents a credit card account with
 * an owner, balance, and credit limit. It supports charges
 * and payments while enforcing credit limit constraints.
 */
public class CreditCard {

    Person owner; // The owner of the credit card
    Money balance; // The current balance on the credit card
    Money creditLimit; // The credit limit of the credit card

    /**
     * Constructor to initialize a CreditCard object.
     * @param owner       The owner of the credit card (Person object).
     * @param creditLimit The credit limit for the card (Money object).
     */
    public CreditCard(Person owner, Money creditLimit) {
        balance = new Money(0); // Initialize balance to zero
        this.creditLimit = creditLimit;
        this.owner = owner;
    }

    /**
     * Retrieves the current balance on the card.
     * @return A new Money object representing the balance.
     */
    public Money getBalance() {
        return new Money(this.balance);
    }

    /**
     * Retrieves the credit limit of the card.
     * @return A new Money object representing the credit limit.
     */
    public Money getCreditLimit() {
        return new Money(this.creditLimit);
    }

    /**
     * Retrieves information about the card owner.
     * @return A string representation of the owner's details.
     */
    public String getPersonals() {
        return this.owner.toString();
    }

    /**
     * Charges an amount to the credit card if the new balance does not exceed the credit limit.
     * @param amount The amount to charge (Money object).
     */
    public void charge(Money amount) {
        if (this.balance.add(amount).compareTo(this.creditLimit) <= 0) {
            this.balance = this.balance.add(amount);
            System.out.println("Charge: " + amount);
        } else {
            System.out.println("Exceeds credit limit");
        }
    }

    /**
     * Makes a payment on the credit card by reducing the balance.
     * @param amount The payment amount (Money object).
     */
    public void payment(Money amount) {
        this.balance = this.balance.subtract(amount);
        System.out.println("Payment: " + amount);
    }
}
