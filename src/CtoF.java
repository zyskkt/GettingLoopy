import java.util.Scanner;
public class CtoF {
    public static void main(String[] args) {
        //Import scanner and initialize variables
        Scanner in = new Scanner(System.in);
        double tempF;
        double tempC;
        boolean validNumber = false;
        String trash = "";
        System.out.println("Enter temperature in Celcius:");
        //When valid number is false (default) run the program
        while (!validNumber) {
            if (in.hasNextDouble()) {
                //Get temp from the input
                tempC = in.nextDouble();
                in.nextLine(); // Clear buffer
                //calculate celcius from farenheit input
                tempF = (tempC * 1.8) + 32;
                System.out.println(tempC + " Celcius equals " + tempF + " Farenheit.");
            } else {
                //Not a valid input, read as string instead
                trash = in.nextLine();
                //Let the user know input was invalid and to retry.
                System.out.println("You entered an invalid temperature: " + trash);
                System.out.println("Please try again with a valid number.");
                System.out.println("Enter temperature in Celcius:");
            }
        }
    }
}
