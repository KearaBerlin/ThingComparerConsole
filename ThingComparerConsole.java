import java.util.Scanner;
import java.util.Random;

public class ThingComparerConsole {

  public static void main(String args[]) {
    System.out.println("*\n*");
    System.out.println("Welcome to Thing Comparer (Console Edition)!");
    System.out.println("Please input two things you would like to compare!");


    Scanner scanny = new scanner(System.in);
    String apple = scanny.next();
    String orange = scanny.next();

    System.out.println(getResponse(apple, orange));
  }

  private static String getResponse(String apple, String orange) {
    Random random = new Random();
    int responseInt = random.nextInt(3);
    int thingInt = random.nextInt(2);

    String thing = apple;
    if (thingInt != 0) {
      thing = orange;
    }

    String response = "Clearly, " + apple + " is better. Everyone who's anyone knows that.";
    if(responseInt == 1) {
      response = "Well, " + orange + " is mediocre, but I'll go with it anyway. I'm feeling spicy today.";
    }
    else if (responseInt == 2) {
      response = "I like " + apple +  " better. Because I said so.";
    }

    return response;
  }

}
