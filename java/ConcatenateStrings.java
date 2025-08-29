import java.util.Arrays;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.StringJoiner;
public class ConcatenateStrings{
    public static void main(String[] args) {
        String a = "Hello";
        String b = "World";
        String c = "Java";
        StringBuilder builder = new StringBuilder();
        builder.append(a).append(" ").append(b);
        // String combination = a.concat(" ").concat(b);
        // String combination = String.join(" ", a, b, c);
        // String combination = String.format("%s %s %s", a, b, c);
        // String [] strings = {"Hello", "World", "Java"};
        // String combination = Arrays.toString(strings);
        // StringJoiner joiner = new StringJoiner(" ");
        // joiner.add(a);
        // joiner.add(b);
        // joiner.add(c);
        // String combination = joiner.toString();
        // List<String> strings = Arrays.asList("Hello", "World", "Java");
        // String seperator = " ";
        // String combination = String.join(seperator, strings);
        try {
            String combination = Files.lines(Paths.get("file1.txt")).reduce("", (line1, line2) -> line1 + line2);
            System.out.println(combination);
        } catch (Exception exception) {
            System.out.println("Exception Occurred: " + exception);
        }
        // System.out.println(combination);
    }
}