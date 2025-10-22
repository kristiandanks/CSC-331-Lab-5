/**
 *
 *
 *
 * @author Patrick Hachicho
 * @date 09/25/2025
 * @section CSC-331-003
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class WQSHachichoDanksMiller{

    /**
     * Main method that will output functionality of classes
     * @param args String[]
     */
    public static void main(String[] args){
        //creating variable to control loop that will run program
        boolean running = true;

        //initializing variable to store user input
        String userInput;

        //initiliazing variable to store selection made by input
        int selection;

        //creating scanner to receive user input
        Scanner scanner = new Scanner(System.in);

        //loop that will run program
        while (running){

            //receiving user input to add, sell, or end
            System.out.printf("Please input the number corresponding to the action you would like to take :%n1) Add an item to the inventory%n2) Sell an item from the inventory%nIf you would like to end the program, press enter.%n");

            //making selection based on input
            userInput = scanner.nextLine();
            try {
                //if number is provided, make selection equal to that number (1 or 2 for choices)
                selection = Integer.parseInt(userInput);
            } catch (NumberFormatException e){
                //if input is not numeric, selection is 0, program will end (default switch case)
                selection = 0;
            }


            //branching logic based on input
            switch (selection) {
                //user chooses to add
                case 1:
                    break;
                //user chooses to sell
                case 2:
                    break;
                //user chooses to end program
                default:
                    running = false;
                    break;
            }
        }
    }

}