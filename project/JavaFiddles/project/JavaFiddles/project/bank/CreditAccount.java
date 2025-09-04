public class CreditAccount extends Account{  // Subclass: Credit Account
    private double ceiling;  // Overdraft limit
    private double money; // Cash withdrawal limit

    // todo: Add getter and setter methods for ceiling, as well as a parameterized constructor 
    public CreditAccount(){}

    public CreditAccount(double ceiling,double money){
        this.ceiling = ceiling;
        this.money = money;
    }

    public CreditAccount(int id, String name, String password, double ceiling, double money) {
        super.id = id;
        super.name = name;
        super.password = password;
        this.ceiling = ceiling;
        this.money = money;
    }

    public double getCeiling() {
        return ceiling;
    }
    
    public void setCeiling(double ceiling) {
        this.ceiling = ceiling;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void purchase(double payment){    // Consumption
        System.out.println("Your Card Number: "+id);
        System.out.println("Payment: "+payment);
        if((balance + ceiling - payment) > 0){  // Can overdraft
            balance = balance - payment; // Update balance
            System.out.println("Final Balance: "+balance+"\n");
        }else {
            System.out.println("Exceeded Overdraft Limit! The card is invalid for this transaction!\n");
        }
    }

    public void withdraw(double cash){   // Override the withdrawal method of the parent class
        // todo: Add code 
        // Check if cash withdrawal is allowed. If allowed, call the withdraw() method of the parent class to withdraw the money.
        // If not allowed, indicate that it exceeds the overdraft limit or cash withdrawal limit.
        if(cash<this.getMoney() && (this.balance+this.ceiling-cash)>0){ 
            super.withdraw(cash);
        }else {
            System.out.println("Exceeded Overdraft Limit Or Exceeded Cash withdrawal limit");
        }
    }
}