import java.util.StringJoiner;
import java.util.Objects;

public class UserProfileFormatter {
    public static void main(String[] args) {
        // Complete user with all fields
        formatUserProfile("John", "Doe", "john.doe@example.com", "Software Developer", "New York");

        // User with some null fields
        formatUserProfile("Alice", "Smith", null, "Data Scientist", null);

        // User with only name
        formatUserProfile("Bob", "Johnson", null, null, null);

        // User with minimal information
        formatUserProfile(null, "Williams", "robert@example.com", null, null);

        // Let's use our utility method
        User user1 = new User("Sarah", "Connor", "sarah@skynet.com", "Freedom Fighter", "Los Angeles");
        System.out.println("\nFormatted user1 profile:");
        System.out.println(formatUserInfo(user1));

        User user2 = new User("James", null, null, "Student", "Boston");
        System.out.println("\nFormatted user2 profile:");
        System.out.println(formatUserInfo(user2));
    }

    public static void formatUserProfile(String firstName, String lastName,
                                        String email, String occupation, String city) {
        System.out.println("\n------ User Profile ------");

        // Format full name using StringJoiner
        StringJoiner nameJoiner = new StringJoiner(" ");
        if (firstName != null) nameJoiner.add(firstName);
        if (lastName != null) nameJoiner.add(lastName);
        String fullName = nameJoiner.toString();

        System.out.println("Name: " + (fullName.isEmpty() ? "Not provided" : fullName));

        // Email with null check using ternary operator
        System.out.println("Email: " + (email != null ? email : "Not provided"));

        // Occupation with Objects.toString()
        System.out.println("Occupation: " + Objects.toString(occupation, "Not provided"));

        // City with null check using if-else
        String cityInfo;
        if (city != null) {
            cityInfo = city;
        } else {
            cityInfo = "Not provided";
        }
        System.out.println("City: " + cityInfo);

        System.out.println("---------------------------");
    }

    // A more comprehensive utility method to format user information
    public static String formatUserInfo(User user) {
        if (user == null) {
            return "No user information available";
        }

        StringBuilder builder = new StringBuilder();
        builder.append("------ User Profile ------\n");

        // Handle name
        StringJoiner nameJoiner = new StringJoiner(" ");
        if (user.getFirstName() != null) nameJoiner.add(user.getFirstName());
        if (user.getLastName() != null) nameJoiner.add(user.getLastName());
        String fullName = nameJoiner.toString();
        builder.append("Name: ").append(fullName.isEmpty() ? "Not provided" : fullName).append("\n");

        // Handle email
        builder.append("Email: ").append(user.getEmail() != null ? user.getEmail() : "Not provided").append("\n");

        // Handle occupation
        builder.append("Occupation: ").append(Objects.toString(user.getOccupation(), "Not provided")).append("\n");

        // Handle city
        builder.append("City: ").append(Objects.toString(user.getCity(), "Not provided")).append("\n");

        builder.append("---------------------------");
        return builder.toString();
    }

    // User class to represent a user
    static class User {
        private final String firstName;
        private final String lastName;
        private final String email;
        private final String occupation;
        private final String city;

        public User(String firstName, String lastName, String email, String occupation, String city) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.occupation = occupation;
            this.city = city;
        }

        public String getFirstName() { return firstName; }
        public String getLastName() { return lastName; }
        public String getEmail() { return email; }
        public String getOccupation() { return occupation; }
        public String getCity() { return city; }
    }
}