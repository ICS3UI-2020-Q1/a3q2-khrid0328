import java.util.Scanner;
/**
 * This program that allows the user to determine the identity of items in the natural world, such as trees, wildflowers, mammals, reptiles, rocks, and fish.
 * @author Dafna Khripun
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user if the animal have feathers
    System.out.println("Does the animal have feathers?");
    String feathers = input.nextLine();

    // does the animal have feathers?
    if(feathers.equals("yes")){

      // ask the user if the animal swims
      System.out.println("Does the animal swim?");
      String swims = input.nextLine();

      // see what animal this is
      if(swims.equals("yes")){
        System.out.println("This is a duck");

      }else if(swims.equals("no")){
        System.out.println("This is a hen");
      }

    }else if(feathers.equals("no")){

      // ask the user if the animal has legs
      System.out.println("Does the animal have legs?");
      String legs = input.nextLine();

      // see what animal this is
      if(legs.equals("yes")){
        System.out.println("This is a lizard");

      }else if(legs.equals("no")){
        System.out.println("This is a snake");
      }
    }
  }
    

    
  
}
