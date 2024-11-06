/**
 This program demonstrates the Money class.
*/
public class MoneyDemo 
{
 public static void main(String[] args) 
 {
// Named constants 
final int BEGINNING = 500; // Beginning balance 
final Money FIRST_AMOUNT = new Money(10.02); 
final Money SECOND_AMOUNT = new Money(10.02);
final Money THIRD_AMOUNT = new Money(10.88); 
// Create an instance of the Money class with 
// the beginning balance. 
Money balance = new Money(BEGINNING); 
// Display the current balance. 
System.out.println("The current amount is " + 
balance.toString()); 
// Add the second amount to the balance 
// and display the results. 
balance = balance.add(SECOND_AMOUNT); 
System.out.println("Adding " + SECOND_AMOUNT + 
" gives " + balance.toString()); 
// Subtract the third amount from the balance 
// and display the results. 
balance = balance.subtract(THIRD_AMOUNT); 
System.out.println("Subtracting " + THIRD_AMOUNT + 
" gives " + balance.toString()); 
// Determine if the second amount equals 
// the first amount and store the result. 
boolean equal = SECOND_AMOUNT.equals(FIRST_AMOUNT); 
// Display the result. 
if(equal)
{
// The first and second amounts are equal. 
System.out.println(SECOND_AMOUNT + " equals " + 
FIRST_AMOUNT); 
}
else
{
// The first and second amounts are not equal. 
System.out.println(SECOND_AMOUNT + 
" does not equal " + 
FIRST_AMOUNT); 
}
// Determine if the third amount equals 
// the first amount and store the result. 
equal = THIRD_AMOUNT.equals(FIRST_AMOUNT);
// Display the result. 
if(equal)
{
// The third and first amounts are equal. 
System.out.println(THIRD_AMOUNT + " equals " + 
FIRST_AMOUNT); 
}
else
{
// The third and first amounts are not equal. 
System.out.println(THIRD_AMOUNT + 
" does not equal " + 
FIRST_AMOUNT); 
}
 } 
}
/**
 This program demonstrates the CreditCard class. 
*/
public class CreditCardDemo 
{
 public static void main(String[] args) 
 {
// Named constants 
final Money CREDIT_LIMIT = new Money(1000); 
final Money FIRST_AMOUNT = new Money(200); 
final Money SECOND_AMOUNT = new Money(10.02); 
final Money THIRD_AMOUNT = new Money(25); 
final Money FOURTH_AMOUNT = new Money(990); 
// Create an instance of the Person class. 
Person owner = new Person("Christie", "Diane", 
new Address("237J Harvey Hall", 
"Menomonie", "WI", "54751")); 
// Create an instance of the CreditCard class. 
CreditCard visa = new CreditCard(owner, 
CREDIT_LIMIT); 
// Display the credit card information.
System.out.println(visa.getPersonals()); 
System.out.println("Balance: " + visa.getBalance()); 
System.out.println("Credit Limit: " + 
visa.getCreditLimit()); 
System.out.println(); // To print a new line
// Attempt to charge the first amount and 
// display the results. 
System.out.println("Attempting to charge " + 
FIRST_AMOUNT); 
visa.charge(FIRST_AMOUNT); 
System.out.println("Balance: " + visa.getBalance()); 
System.out.println(); // To print a new line 
// Attempt to charge the second amount and 
// display the results. 
System.out.println("Attempting to charge " + 
SECOND_AMOUNT); 
visa.charge(SECOND_AMOUNT); 
System.out.println("Balance: " + visa.getBalance()); 
System.out.println(); // To print a new line 
// Attempt to pay using the third amount and
// display the results. 
System.out.println("Attempting to pay " +
THIRD_AMOUNT); 
visa.payment(THIRD_AMOUNT); 
System.out.println("Balance: " + visa.getBalance()); 
System.out.println(); // To print a new line 
// Attempt to charge using the fourth amount and 
// display the results. 
System.out.println("Attempting to charge " + 
FOURTH_AMOUNT); 
visa.charge(FOURTH_AMOUNT); 
System.out.println("Balance: " + visa.getBalance()); 
 } 
}
