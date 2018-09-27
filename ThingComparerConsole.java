import java.util.Scanner;

public class ThingComparerConsole {

  public static void main(String args[]) {
    System.out.println("Welcome to Thing Comparer (Console Edition)!");
    System.out.println("Please input two things you would like to compare!");
    Scanner scanny = new scanner(System.in);
    String apple = scanny.next();
    String orange = scanny.next();
    System.out.println("I like " + apple +  " better. Because I said so.")
  }

}
