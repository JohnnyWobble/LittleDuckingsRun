public class GiftCard {
// declare instance variables
private double balance;

// precondition: the starting balance is not negative
// postcondition: all instance variables are initialized
public GiftCard(double startBal) {
if (startBal < 0) {
balance = 0;
} else {
balance = startBal;
}
}

// postcondition: amount is subtracted from balance
// if there are insufficient funds, the balance is set to zero and a message
// is displayed to indicate how much of the transaction is still owed
public void spendFunds(double amount) {
if (balance - amount < 0) {
System.out.println("You still owe $" + -(balance - amount));
balance = 0;
} else {
balance -= amount;
}
}

// postcondition: amount is added to balance, if the amount is at least 100
// dollars,
// 10 dollars is added
public void addFunds(double amount) {
if (amount >= 100.0) {
balance += 10;
}
balance += amount;
}

// postcondition: the current balance is returned
public double checkBalance() {
return balance;
}
}