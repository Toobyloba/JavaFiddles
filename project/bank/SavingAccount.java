public class SavingAccount extends Account{  // Subclass: Savings Account
    private static double interest;  // Annual interest rate, private and static

    // todo: Add getter and setter methods for interest, as well as a parameterized constructor 
    public SavingAccount(long id, String name, String password){
        super(id, name, password);
    }

    public void setInterest(double Interest){
        interest = Interest;
    }

    public void countInterest(){
        double Interest = balance * interest;
        deposit(Interest);
    }
}