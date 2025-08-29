public class SubStringReplace {
    public static void main(String[] args) {
        String originalString = "the quick brown fox jumps over the lazy dog";
        System.out.println("Original String: " + originalString);
        // Replacing a substring
        String newString = originalString.replaceAll("the", "a");
        System.out.println("New String: " + newString);
    }
}