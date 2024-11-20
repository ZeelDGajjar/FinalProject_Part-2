
public class CreditCard {
    Person owner;
    Money balance;
    Money creditLimit;

    public CreditCard( Person owner, Money creditLimit){
        balance = new Money(0);
        this.creditLimit = creditLimit;
        this.owner = owner;
    }

    public Money getBalance() {
        return this.balance;
    }

    public Money getCreditLimit() {
        return this.creditLimit;
    }

    public String getPersonals() {
        return this.owner.toString();
    }

    public void charge(Money amount){

        if (this.balance.add(amount).compareTo(this.creditLimit) <= 0){
            this.balance = this.balance.add(amount);
            this.creditLimit = this.creditLimit.subtract(amount);
            System.out.println("Charge:" + amount);
        } else {
            System.out.println("Exceeds credit limit");
        }
    }

    public void payment(Money amount){
        this.balance = this.balance.subtract(amount);
        System.out.println("Payment:" + amount);
    }

}
