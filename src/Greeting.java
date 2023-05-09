//imports scanner class into code
import java.util.Scanner;
public class Greeting {
    public static void main(String[] args){
//      Creates a scanner looking for user input
        Scanner scanner = new Scanner(System.in);

//      Print instructions asking for user to input their name
        System.out.println("What's your name?");

//      Assign user input to a variable
        String username = scanner.nextLine();

//      Greet user
        System.out.println("Hi " + username);

    }
}
