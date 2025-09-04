public class Account {
    long id;  // Account ID
    String name;  // Customer name
    String password = "000000";  // Account password: initial password is "000000"
    double balance;  // Account balance

    // todo: Add getter and setter methods for attributes, as well as parameterized and non-parameterized constructors
    public Account(){
        super();
    }

    public Account(long id, String name, String password){
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public long getID(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getPassword(){
        return password;
    }

    public double getBalance(){
        return balance;
    }

    public void setID(long id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void setBalance(Double balance){
        this.balance = balance;
    }

    public void deposit(double cash){  // Deposit
        System.out.println("======Deposit Operation======");
        System.out.println("Amount Deposited: "+cash);
        balance += cash;    // Update balance
        System.out.println("Updated Balance: "+balance+"\n");
    }

    public void withdraw(double cash){  // Withdrawal
        System.out.println("======Withdrawal Operation======");
        System.out.println("Amount Withdrawn: "+cash);
        balance -= cash;    // Update balance
        System.out.println("Updated Balance: "+balance+"\n");
    }

    public void query(){  // Query
        System.out.println("======Query Operation======");
        System.out.println("Account ID: "+id);
        System.out.println("Customer Name: "+name);
        System.out.println("Balance: "+balance+"\n");
    }
}