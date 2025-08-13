public class AdminUser extends User {
    private int accessLevel;

    public AdminUser(String username, int userId, int accessLevel) {
        super(username, userId);
        this.accessLevel = accessLevel;
    }

    public void logBranchCleanUp(int branchesDeleted) {
        System.out.println("Admin " + getUsername() + " ID: " + getUserId() + ", Level: " + accessLevel
                + ") deleted " + branchesDeleted + " branches.");
    }
}