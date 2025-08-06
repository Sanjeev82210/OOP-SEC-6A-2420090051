public class Question14 {
    static String bankName;
    static double interestRate;
    static {
        bankName = "Global Bank";
        interestRate = 4.5;
    }
    String accountNumber;
    double balance;

    Question14(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    static void updateInterestRate(double newRate) {
        interestRate = newRate;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void displayAccountDetails() {
        System.out.println("Account: " + accountNumber + ", Balance: " + balance +
                ", Bank: " + bankName + ", Interest Rate: " + interestRate + "%");
    }

    public static void main(String[] args) {
        Question14 a1 = new Question14("12345", 1000.0);
        Question14 a2 = new Question14("67890", 2000.0);

        a1.deposit(500.0);
        a1.displayAccountDetails();
        a2.displayAccountDetails();

        updateInterestRate(5.0);
        a1.displayAccountDetails();
        a2.displayAccountDetails();
    }
}