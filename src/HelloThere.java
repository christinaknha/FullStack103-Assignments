import java.util.Scanner;
public class HelloThere {
    public static void main(String[] args){
//      Create scanner for userinput
        Scanner scanner = new Scanner(System.in);

//      Create prompt for user to answer
        System.out.println("Hello there! How are you doing today?");

//      Save user input into a variable
        String userResponse1 = scanner.nextLine();

//      Create prompt for second answer
        System.out.println("Wow! Interesting. Tell me more about yourself!");

//      Save users second response into a variable
        String userResponse2 = scanner.nextLine();

//      End chat
        System.out.println("Cool! It was nice meeting you. Goodbye.");
    }
}
