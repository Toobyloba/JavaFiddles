import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class StreamOnMap {

    public static void main(String[] args) {
        Map<String, Integer> commitCounts = new HashMap<>();
        commitCounts.put("Alice", 15);
        commitCounts.put("Bob", 22);
        commitCounts.put("Charlie", 8);
        commitCounts.put("David", 30);

        // The stream-based solution
        Optional<String> topDeveloper = commitCounts.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);

        topDeveloper.ifPresent(name -> System.out.println("Top developer: " + name));
    }
}
