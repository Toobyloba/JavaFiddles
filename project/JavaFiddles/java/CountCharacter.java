import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharacter {
    public static Map<Character, Integer> countCharacter(String input) {
        Map<Character, Integer> result = new HashMap<>();
        input = input.replaceAll("[^a-zA-Z]", "");
        char [] inputArray = input.toCharArray();

        for (char c : inputArray) {
            if (result.containsKey(c)){
                int count = result.get(c);
                result.put(c, count + 1);
            }else{
                result.put(c, 1);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String input = scanner.next();
        Map<Character, Integer> result = countCharacter(input);
        System.out.println("The frequency of each letter in the string: ");
        for (Map.Entry<Character, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}