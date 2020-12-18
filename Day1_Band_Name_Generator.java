import java.util.Scanner;

public class Day1_Band_Name_Generator {
    public static void main ( String [] args ){
        //Declare variables
        String user_city;
        String user_pet;
        String bandname;

        Scanner input = new Scanner (System.in);

        //1. Create a greeting for your program.
        System.out.println("Welcome to the Band Name Generator!");
        
        //2. Ask the user for the city that they grew up in.
        System.out.println( "Please enter the city that you grew up in: ");
        user_city = input.nextLine();

        //3. Ask the user for the name of a pet.
        System.out.println( "Please enter the name of your pet: ");
        user_pet = input.nextLine();

        //4. Combine the name of their city and pet and show them their band name.
        bandname = user_city + user_pet;

        System.out.print("Your new bandname is: " + bandname);
        input.close();
    }

}