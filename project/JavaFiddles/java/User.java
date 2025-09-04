public class User{
    private String username;
    private int userId;

    public User(String username, int userId){
        this.username = username;
        this.userId = userId;
    }

    public User(String username){
        this.username = username;
        this.userId = -1;
    }

    public String getUsername(){
        return username;
    }

    public int getUserId(){
        return userId;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void printUserInfo(){
        System.out.println(this.username);
        System.out.println(this.userId);
    }

    public static void main(String[] args) {
        User user = new User("Tobiloba", 14);
        user.printUserInfo();
    }
}