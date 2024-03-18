
public class CreditCard {
    private String accountNumber;
    private double currentBalance;

    public CreditCard(String accountNumber, double currentBalance) {
        this.accountNumber = accountNumber;
        this.currentBalance = currentBalance;
    }

    public void deposit(double amount) {
        currentBalance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= currentBalance) {
            currentBalance -= amount;
        } else {
            System.out.println("Not enough funds!");
        }
    }

    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + currentBalance);
    }

    public static void main(String[] args) {
        CreditCard card1 = new CreditCard("1234", 1000);
        CreditCard card2 = new CreditCard("5678", 2000);
        CreditCard card3 = new CreditCard("9101", 1500);

        card1.deposit(500);
        card2.deposit(1000);
        card3.withdraw(700);

        card1.displayInfo();
        card2.displayInfo();
        card3.displayInfo();
    }
}