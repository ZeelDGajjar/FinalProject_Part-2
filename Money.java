package org.example;

/**
 *
 * @author 2474008
 */

/**
 This class represents nonnegative amounts of money. 
*/

public class Money 
{
	 // The number of dollars 
	 private long dollars; 
	 // The number of cents 
	 private long cents; 
	 /** 
	Constructor
	@param amount The amount in decimal format. 
	 */ 
	 public Money(double amount) 
	 { 
		if (amount < 0) {
			System.out.println("Error: Negative amounts " + "of money are not allowed.");
			System.exit(0); 
		}
		else{
		long allCents = Math.round(amount * 100); 
			dollars = allCents / 100; 
			cents = allCents % 100; 
		}
	 } 

	 // ADD LINES FOR TASK #1 HERE

	/**
	 * Task #1: Copy Constructor
	 * Creates a new Money object by copying the values of another Money object.
	 * @param otherAmount The Money object to copy.
	 */
	public Money (Money otherAmount){
		this.dollars = otherAmount.dollars; // Copy the dollar value
		this.cents = otherAmount.cents; // Copy the cent value
        }
	 /***
	The add method 
	@param otherAmount The amount of money to add. 
	@return The sum of the calling Money object 
	and the parameter Money object. 
	 */
	 public Money add(Money otherAmount) {
		Money sum = new Money(0); 
		sum.cents = this.cents + otherAmount.cents; 
		long carryDollars = sum.cents / 100; 
		sum.cents = sum.cents % 100; 
		sum.dollars = this.dollars + otherAmount.dollars + carryDollars;
		return sum; 
	 }
	 /**
	The subtract method 
	@param amount The amount of money to subtract. 
	@return The difference between the calling Money 
	object and the parameter Money object.
	 */
	 public Money subtract (Money amount)  {
		Money difference = new Money(0); 
		if (this.cents < amount.cents) {
			this.dollars = this.dollars - 1;
			this.cents = this.cents + 100; 
			}
		difference.dollars = this.dollars - amount.dollars;
		difference.cents = this.cents - amount.cents;
		return difference; 
	 } 
	 /** 
	The compareTo method 
	@param amount The amount of money to compare against. 
	@return -1 if the dollars and the cents of the 
	calling object are less than the dollars and 
	the cents of the parameter object. 
	0 if the dollars and the cents of the calling 
	object are equal to the dollars and cents of 
	the parameter object. 
	1 if the dollars and the cents of the calling 
	object are more than the dollars and the 
	cents of the parameter object. 
	 */ 
	 public int compareTo(Money amount) 
	 { 
		int value;
		if(this.dollars < amount.dollars) 
			value = -1; 
		else if (this.dollars > amount.dollars) 
			value = 1; 
		else if (this.cents < amount.cents) 
			value = -1; 
		else if (this.cents > amount.cents) 
			value = 1; 
		else
			value = 0; 
		return value; 
	 } 

	 // ADD LINES FOR TASK #2 HERE

	// Document and write an equals method
	/**
	 * Compares the instance variables of the calling object with another Money object.
	 * @param otherMoney The Money object to compare against.
	 * @return true if both the dollars and cents are equal, false otherwise.
	 */
	public boolean equals(Money otherMoney){
		 return this.dollars == otherMoney.dollars && this.cents == otherMoney.cents;
	}

	// Document and write a toString method
	/**
	 * Converts the Money object into a string representation.
	 * @return A string in the format "$dollars.cents", ensuring cents are always
	 *         displayed with two digits (e.g., $10.05 instead of $10.5).
	 */
	// return String.format("$%d.%02d", dollars, cents); ?
	public String toString(){
		 return  "$" + dollars + "." + (cents < 10 ? "0" + cents : cents);
	}
}
