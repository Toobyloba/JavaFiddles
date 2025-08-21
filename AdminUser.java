public class AdminUser extends User implements Loggable{
    private int accessLevel;

    public AdminUser(String username, int userId, int accessLevel) {
        super(username, userId);
        this.accessLevel = accessLevel;
    }

    public void logBranchCleanUp(int branchesDeleted) {
        System.out.println("Admin " + getUsername() + " ID: " + getUserId() + ", Level: " + accessLevel
                + ") deleted " + branchesDeleted + " branches.");
    }

    public String getLogEntry(){
        return "[ADMIN] User " + getUsername() + " (ID: " + getUserId() + ") " + "performed and action.";
    }
}
