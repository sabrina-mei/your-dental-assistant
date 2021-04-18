import java.util.Scanner;
public class Main {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
			System.out.print("Hello! Welcome to the Dental Center, what is your full name? ");
			String name = in.nextLine();
      System.out.println("Hi " + name + "!");

      System.out.print("What type of appointment are you here for today? ");
			String appt = in.nextLine();

      System.out.print("\nOkay, now I will ask you a few routine questions to make your visit smoother. Please answer yes/no questions with a simple \"yes\" or \"no\". \n\nI may also provide some feedback for you based on your responses.");

      System.out.print("\n\nFirst, how many times a day do you brush your teeth? ");
			String bru = in.nextLine();
      int brushN = Integer.parseInt(bru);
      if(brushN == 2) {
        System.out.println("Great! Keep it up.");
      }
      else if(brushN < 2){
        System.out.println("\nThe American Dental Association recommends that you brush your teeth twice a day, for two minutes each. Try to maintain this schedule for good oral health.");
      } else{
        System.out.println("\nThe American Dental Association only recommends that you brush your teeth twice a day, but a extra brushing generally doesn't hurt!");
      }
      System.out.print("\nDo you floss at least once per day?  ");
			String floss = in.nextLine();
      if(floss.equalsIgnoreCase("no")){
        System.out.println("The American Dental Association recommends that you floss once a day, try to maintain this schedule for good oral health.");
      } else if(floss.equalsIgnoreCase("yes")){
        System.out.println("Great! Keep it up.");
      }

      System.out.print("\nHave you replaced your toothbrush in the last 3 to 4 months? ");
			String brushRep = in.nextLine();
      String newB;

      if(brushRep.equalsIgnoreCase("yes")){
        System.out.print("\nStellar, would you like a new toothbrush? ");
        newB = in.nextLine();
        if(newB.equalsIgnoreCase("no")) {
          System.out.println("Cool, saving plastic helps to save the environment :)");
        } else {
          System.out.println("\nWonderful, we will provide you with a new toothbrush at the end of your visit.");
        }
      } else {
        System.out.println("Toothbrush manufacturers and many dentists recommand that you replace your toothbrush after 3 to 4 months to maintain hygiene and efficacy.");
        System.out.println("We will provide you with a new toothbrush at the end of your visit :)");
        newB = "yes";
      }

      System.out.print("\nWhat toothpaste flavor do you prefer, mint or bubblegum? ");
			String paste = in.nextLine();
      System.out.println("\nYum, " + paste + " is my favorite flavor, too!");

      System.out.print("\nHave you had any pain in your teeth recently? ");
			String pain = in.nextLine();
      if(pain.equalsIgnoreCase("yes")) {
        System.out.println("\nOh no! I will make sure to let your dentist know to discuss that with you further during your appointment.");
      } else {
        System.out.println("\nWonderful, keep up the good work!");
      }

      System.out.println("Horray! That's all the questions I have for you. Your dentist will be with you shortly.");

      Patient p = new Patient(name, appt, brushN, floss, brushRep, newB, paste, pain);

      System.out.println("\n" + p);
  }
}