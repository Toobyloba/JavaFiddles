public class StringBuilderDemo{
    public static void main(String[] args) {
        String str = "LabEx";
        StringBuilder strBuilder = new StringBuilder(str);
        strBuilder.reverse();
        String reversedStr = strBuilder.toString();
        System.out.println("Reversed String using StringBuilder: " + reversedStr);

        String newStr = "";
        for(int i = str.length() - 1; i >= 0; i--){
            newStr = newStr + str.charAt(i);
        }
        System.out.println("Reversed String using new String: " + newStr);
    }
}