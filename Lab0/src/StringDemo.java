public class StringDemo {
    public static void main(String[] args){
        String greeting = "Hello";
        String name = "Alice";

        // String concatenation
        String message = greeting + ", " + name + "!";
        System.out.println(message);


        //String length
        System.out.println("The lenght of the message is: " + message.length());

        // Accessing characters in a string
        System.out.println("The first character of the message is: " + message.charAt(0));

        // Converting to uppercase
    }
}
