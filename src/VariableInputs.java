import java.util.Scanner;
public class VariableInputs {
    public static void main(String[] args){
//      Set up scanner for user inputs
        Scanner scanner = new Scanner(System.in);

//      Ask user for a string of text:
        System.out.println("Enter a string of text: ");

//      Store user input into a variable:
        String userString = scanner.nextLine();

//      Ask user for an integer:
        System.out.println("Enter an integer: ");

//      Store user input into a variable
        int userInt = Integer.valueOf(scanner.nextLine());

//      Ask user for a double:
        System.out.println("Enter a double: ");

//      Store user input into a variable
        double userDouble = Double.valueOf(scanner.nextLine());

//      Ask user for a boolean:
        System.out.println("Enter a boolean value: ");

//      Store user input into a variable
        boolean userBoolean = Boolean.valueOf(scanner.nextLine());

//      Print results to the console
        System.out.println("Your string is " + userString);
        System.out.println("Your integer is " + userInt);
        System.out.println("Your double is " + userDouble);
        System.out.println("Your boolean is " + userBoolean);
    }
}
