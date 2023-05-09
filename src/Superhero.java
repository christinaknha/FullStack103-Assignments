import java.sql.SQLOutput;
import java.util.Scanner;
public class Superhero {
    public static void main(String[] args){
//      Create scanner for user input
        Scanner scanner = new Scanner(System.in);

//      Print first two lines of the story
        System.out.println("Let's write a story about a superhero.");
        System.out.println("Who is the hero of our story?");

//      Get user input Save as a variable
        String heroname = scanner.nextLine();

//      Print next question
        System.out.println("What is their superpower?");

//      Get user input Save as a variable
        String power = scanner.nextLine();

//      Fill in the story
        System.out.println("Here is the story: ");
        System.out.println("There once was a superhero named " + heroname + ", who had the power of " + power);
        System.out.println("As they grew older, " + heroname + " saw that the world needed them.");
        System.out.println(heroname + " used their ability to " + power + " to save the world.");
    }
}
