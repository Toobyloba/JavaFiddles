import java.util.Arrays;
import java.util.List;

public class FilterExample{
    public static void main(String[] args) {
        List<String> tools = Arrays.asList("Git", "Gradle", "JUnit", "Java", "Jenkins");
        tools.stream().filter(tool -> tool.startsWith("J")).forEach(System.out::println);
    }
}