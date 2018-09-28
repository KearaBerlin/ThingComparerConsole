import java.util.Scanner;
import java.util.Random;

public class ThingComparerConsole {

  public static void main(String args[]) {
    System.out.println("*\n*");
    System.out.println("Welcome to Thing Comparer (Console Edition)!");

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a thing: ");
    String thingOne = scanner.nextLine();

    System.out.println("Enter another thing: ");
    String thingTwo = scanner.nextLine();

    System.out.println("Which is better - " + thingOne + " or " + thingTwo + "?");
    System.out.println(getResponse(thingOne, thingTwo));
  }

  private static String getResponse(String thingOne, String thingTwo) {
    Random random = new Random();
    int randomInt = random.nextInt(2);
    String response = "";
    if(randomInt == 0) {
      response = "Clearly, " + thingOne + " is better. Everyone who's anyone knows that.";
    }
    else {
      response = thingTwo + " is mediocre, but I'll go with it anyway. I'm feeling spicy today.";
    }

    return response;
  }

}
