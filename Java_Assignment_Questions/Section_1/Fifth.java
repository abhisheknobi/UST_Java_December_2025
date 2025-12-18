import java.util.Scanner;

class Fifth {

    // Celsius to Fahrenheit
    static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    // Kilometers to Miles
    static double kilometersToMiles(double km) {
        return km * 0.621371;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Celsius to Fahrenheit
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = celsiusToFahrenheit(celsius);
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        // Kilometers to Miles
        System.out.print("Enter distance in Kilometers: ");
        double km = sc.nextDouble();
        double miles = kilometersToMiles(km);
        System.out.println("Distance in Miles: " + miles);
    }
}
