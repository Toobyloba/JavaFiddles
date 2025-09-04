public class AccountTest {
    public static void main(String args[]){
        SavingAccount sa = new SavingAccount(100003,"Li Si","123456");
        sa.deposit(10000);  // Deposit 10000
        sa.setInterest(0.004); // Set interest rate
        sa.countInterest();  // Deposit the interest into the account
        sa.withdraw(2000); // Withdraw 2000
        sa.query(); // Query the current account number, name, and balance. The balance should be 8040

        CreditAccount ca = new CreditAccount(100005,"Wang Wu","123123",10000.0,8000.0);
        ca.deposit(4000); // Deposit 4000
        ca.purchase(3000); // Consumption 3000
        ca.withdraw(6000);// The remaining 1000 plus the overdraft limit 10000 is greater than the withdrawal amount 6000, and the withdrawal amount 6000 is less than the cash withdrawal limit 8000. Withdraw 6000 from the account, resulting in a balance of -5000.
    }
}