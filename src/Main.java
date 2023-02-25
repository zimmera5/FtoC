import java.util.Scanner; //Import to activate scanner function

public class TempCalculatorScrip {
    public static void main(String[] args) {

        //Project init

        Scanner celius = new Scanner(System.in); // Scanner function for the variables
        System.out.print("Enter a temperature in Celsius "); //Output for the user to inter information
        double C = celius.nextDouble(); //Variable for celcius for the scanner
        double fahrenheitFinal = ((C*9/5)+32); // the formula to convert Celius to Fahrenheit

        System.out.println("Your temperature in Fahrenheit is " + fahrenheitFinal); //The final output of the program
    }


}