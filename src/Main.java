import java.util.Scanner; //Import to activate scanner function

public class Main {
    public static void main(String[] args) {

        //Project init
        //you really need to put all your variable declartions first, makes them easier to track and change
        
        double f;
        double celsiusFinal;
        String trash;
        boolean validValue = false;
        Scanner fahrenheit = new Scanner(System.in); // Scanner function for the variables
       
        //start your loop here.  I prefer do/whiles so I don't have to worry about setting a variable to start, but you can do whatever
        
        do{ 
            System.out.println("Enter a temperature in fahrenheit "); //Output for the user to inter information
            
            //this is the test method for the 'double' variable type
            if(fahrenheit.hasNextDouble){

                //we got something good, let's store it here
                f = fahrenheit.nextDouble(); //Variable for Fahrenheit for the scanner
                validValue = true;
            }
            else{
                
                //the user is an idiot and gave us a String.  Let's store it as trash so we can echo
                trash = fahrenheit.nextLine();
                System.out.println("You've entered an incorrect value - " + trash +".  Please supply a number.");
            }
        }while(!validValue);
        
        //now we can do all our math
        
        celsiusFinal = ((f-32)*5/9); // the formula to convert Fahrenheit to Celius
        System.out.println("Your temperature in Celsius is " + celsiusFinal); //The final output of the program
      
        fahrenheit.close();
    }
}
