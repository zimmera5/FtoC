import java.util.Scanner; //Import to activate scanner function

public class Main {
    public static void main(String[] args) {

        //Project init

        Scanner fahrenheit = new Scanner(System.in); // Scanner function for the variables

        System.out.print("Enter a temperature in fahrenheit "); //Output for the user to inter information
        double f = fahrenheit.nextDouble(); //Variable for Fahrenheit for the scanner
        double celsiusFinal = ((f-32)*5/9); // the formula to convert Fahrenheit to Celius

        System.out.println("Your temperature in Celsius is " + celsiusFinal); //The final output of the program

        fahrenheit.close();
    }
}