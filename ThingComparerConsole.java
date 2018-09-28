import java.util.Scanner;

public class ThingComparerConsole {

  public static void main(String args[]) {
    System.out.println("*\n*\n*\n*\n");
    System.out.println("Welcome to Thing Comparer (Console Edition)!");

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a thing: ");
    String thingOne = scanner.nextLine();

    System.out.println("Enter another thing: ");
    String thingTwo = scanner.nextLine();

    System.out.println("Which is better - " + thingOne + " or " + thingTwo + "?");
    System.out.println("Clearly, " + thingOne + " is better. Everyone who's anyone knows that."); 
  }

}
