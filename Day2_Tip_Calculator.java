import java.util.Scanner;

public class Day2_Tip_Calculator {
    public static void main(String[] args){
        double bill;
        int split_num;
        double tip_input;
        double tip_percentage;
        double final_bill;
        String final_bill_format;

        Scanner input = new Scanner(System.in);

        //Type out a greeting
        System.out.println("Welcome to the tip calculator!");

        //Ask the user for the bill
        System.out.print("What was the total bill? $");
        bill = input.nextDouble();

        //Ask the user for the tip percentage
        System.out.print("How much tip would you like to give? 10, 15, or 20?");
        tip_input = input.nextDouble();
        tip_percentage = tip_input / 100;

        //Ask how many people will be splitting the bill
        System.out.print("How many people will split the bill?");
        split_num = input.nextInt();

        //Calculate what each person owes and print out the amount
        final_bill = ((bill * (1 + tip_percentage))/split_num);
        final_bill_format = String.format("%.2f", final_bill);
        System.out.println("Each person owes $" + final_bill_format);

        input.close();
    }
}
