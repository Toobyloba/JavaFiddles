public class TemperatureConverter {
    public static void main(String[] args){
        int fahrenheit = 98;
        double celcius = (fahrenheit - 32) * 5.0 / 9.0;

        String message = fahrenheit + "F is equal to " + celcius;
        System.out.println(message);

        // Rounding to two deciman places
        double roundedCelcius = Math.round(celcius * 100.0) / 100.0;
        String formattedMessage = String.format("%d F is equal to %.2f C", fahrenheit, roundedCelcius);
        System.out.println(formattedMessage);

        // Converting the other way
        celcius = 37.0;
        fahrenheit = (int) (celcius * 9.0 / 5.0 + 32);
        System.out.println(celcius + "C is approximately " + fahrenheit + "F");
    }
}
