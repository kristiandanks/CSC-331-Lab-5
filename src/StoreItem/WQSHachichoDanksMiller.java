package StoreItem;

/**
 *
 *
 *
 * @author Patrick Hachicho
 * @date 09/25/2025
 * @section CSC-331-003
 */
import java.util.Scanner;
import java.util.ArrayList;

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

        //initiliazing variable to store selection to add or remove made by input
        int addRemoveSelection;

        //initializing variable to store selection of item type to add
        int addTypeSelection;

        //creating scanner to receive user input
        Scanner scanner = new Scanner(System.in);

        //initializing inventories for different item types
        ArrayList<FoodItem> foodItemInventory = new ArrayList<>();
        ArrayList<ElectronicsItem> electronicsItemInventory = new ArrayList<>();
        ArrayList<ClothingItem> clothingItemInventory = new ArrayList<>();
        ArrayList<HouseholdItem> householdItemInventory = new ArrayList<>();

        //loop that will run program
        while (running){

            //receiving user input to add, sell, or end
            System.out.printf("Please input the number corresponding to the action you would like to take :%n1) Add an item to the inventory%n2) Sell an item from the inventory%nIf you would like to end the program, press enter.%n");

            //making selection based on input
            userInput = scanner.nextLine();
            try {
                //if number is provided, make selection equal to that number (1 or 2 for choices)
                addRemoveSelection = Integer.parseInt(userInput);
            } catch (NumberFormatException e){
                //if input is not numeric, selection is 0, program will end (default switch case)
                addRemoveSelection = 0;
            }


            //branching logic based on input
            switch (addRemoveSelection) {
                //user chooses to add
                case 1:
                    //asking user what item type they want to add
                    System.out.printf("What item type would you like to add:%n1) Food%n2) Electronics%n3) Clothing%n4) Household%n");
                    addTypeSelection = scanner.nextInt();

                    //branching logic based on item type to add
                    switch (addTypeSelection){
                        //user chooses to add FoodItems
                        case 1:
                            //displaying inventory
                            System.out.println("The food items inventory currently contains: ");
                            for (FoodItem item: foodItemInventory){
                                System.out.println(item.getName());
                            }
                            //initialzing variable for do-while condition
                            boolean continueAdding;
                            do {
                                //receiving user input to add existing items or create new ones
                                System.out.printf("What would you like to do:%n1) Add more of an existing item already in the list%n2) Create a new item to add to the list%n");
                                int addCreateSelection = scanner.nextInt();

                                //add more of an existing item
                                if (addCreateSelection == 1) {
                                    //ask what existing item to add
                                    System.out.println("Please input the name of the item you would like to add more of.");
                                    String addItemName = scanner.nextLine();

                                    //iterate through list to find desired item
                                    for (FoodItem item : foodItemInventory) {
                                        //desired item found
                                        if (item.getName() == addItemName) {
                                            foodItemInventory.add(item); //adding another instance of the item to the inventory
                                            break; //stop the loop
                                        }
                                    }
                                } else {
                                    //user is creating a new item, ask which type
                                    System.out.printf("Which item type would you like to create:%n1) Fruit%n2) Vegetable%n3) Shelf Stable%n");
                                    int newItemType = scanner.nextInt();

                                    //branching logic based on new item type
                                    switch (newItemType){
                                        //user is adding a fruit
                                        case 1:
                                            //initialzing boolean variables that are assigned in conditional statements
                                            boolean itemOrganic;
                                            boolean itemBerry;

                                            //getting price and round it to two decimal places
                                            System.out.println("How much is your fruit going to cost?");
                                            double itemPrice = Math.round(scanner.nextDouble() * 100) /100;
                                            scanner.nextLine();

                                            //getting section for item
                                            System.out.println("What section/aisle would your item be found on (e.g. A19)?");
                                            String itemSection = scanner.nextLine();

                                            //getting brand of item
                                            System.out.println("What is the brand of the item?");
                                            String itemBrand = scanner.nextLine();

                                            //getting name of item
                                            System.out.println("What is the name of the item?");
                                            String itemName = scanner.nextLine();

                                            //getting return policy of item
                                            System.out.println("What is the item's return policy?");
                                            String itemReturnPolicy = scanner.nextLine();

                                            //getting expiration date of item
                                            System.out.println("What is the expiration date for your item (MM-DD-YYYY)?");
                                            String itemExpirationDate = scanner.nextLine();

                                            //getting if item is organic
                                            System.out.println("Is the item organic (y/n)?");

                                            //item is organic
                                            if (scanner.nextLine() == "y"){
                                                itemOrganic = true;
                                            } else {
                                                itemOrganic = false;
                                            }

                                            //getting nutrition facts of item
                                            System.out.println("What are the nutrition facts for your item?");
                                            String itemNutritionFacts = scanner.nextLine();

                                            //getting if item is a berry
                                            System.out.println("Is the item a berry (y/n)?");

                                            //item is berry
                                            if (scanner.nextLine() == "y"){
                                                itemBerry = true;
                                            } else {
                                                itemBerry = false;
                                            }

                                            //create item and add to list
                                            Fruit newItem = new Fruit(itemPrice, itemSection, itemBrand, itemName, itemReturnPolicy, itemExpirationDate, itemOrganic, itemNutritionFacts, itemBerry);
                                            foodItemInventory.add(newItem);
                                            break;
                                        //user is adding a vegetable
                                        case 2:

                                            //initializing boolean values that are assigned in conditional statements
                                            boolean itemOrganic;
                                            boolean itemIsLeafy;
                                            //getting price and round it to two decimal places
                                            System.out.println("How much is your vegetbale going to cost?");
                                            double itemPrice = Math.round(scanner.nextDouble() * 100) /100;
                                            scanner.nextLine();

                                            //getting section for item
                                            System.out.println("What section/aisle would your item be found on (e.g. A19)?");
                                            String itemSection = scanner.nextLine();

                                            //getting brand of item
                                            System.out.println("What is the brand of the item?");
                                            String itemBrand = scanner.nextLine();

                                            //getting name of item
                                            System.out.println("What is the name of the item?");
                                            String itemName = scanner.nextLine();

                                            //getting return policy of item
                                            System.out.println("What is the item's return policy?");
                                            String itemReturnPolicy = scanner.nextLine();

                                            //getting expiration date of item
                                            System.out.println("What is the expiration date for your item (MM-DD-YYYY)?");
                                            String itemExpirationDate = scanner.nextLine();

                                            //getting if item is organic
                                            System.out.println("Is the item organic (y/n)?");

                                            //item is organic
                                            if (scanner.nextLine() == "y"){
                                                itemOrganic = true;
                                            } else {
                                                itemOrganic = false;
                                            }

                                            //getting nutrition facts of item
                                            System.out.println("What are the nutrition facts for your item?");
                                            String itemNutritionFacts = scanner.nextLine();

                                            //getting if item is leafy
                                            System.out.println("Is the vegetable leafy?");
                                            if (scanner.nextLine() == "y"){
                                                itemIsLeafy = true;
                                            } else {
                                                itemIsLeafy = false;
                                            }

                                            //create item and add to list
                                            Vegetable newItem = new Vegetable(itemPrice, itemSection, itemBrand, itemName, itemReturnPolicy, itemExpirationDate, itemOrganic, itemNutritionFacts, itemIsLeafy);
                                            foodItemInventory.add(newItem);
                                            break;
                                        case 3:
                                            //user adds a shelf stable item
                                            //initializing boolean values that are assigned in conditional statements
                                            boolean itemOrganic;
                                            //getting price and round it to two decimal places
                                            System.out.println("How much is your fruit going to cost?");
                                            double itemPrice = Math.round(scanner.nextDouble() * 100) /100;
                                            scanner.nextLine();

                                            //getting section for item
                                            System.out.println("What section/aisle would your item be found on (e.g. A19)?");
                                            String itemSection = scanner.nextLine();

                                            //getting brand of item
                                            System.out.println("What is the brand of the item?");
                                            String itemBrand = scanner.nextLine();

                                            //getting name of item
                                            System.out.println("What is the name of the item?");
                                            String itemName = scanner.nextLine();

                                            //getting return policy of item
                                            System.out.println("What is the item's return policy?");
                                            String itemReturnPolicy = scanner.nextLine();

                                            //getting expiration date of item
                                            System.out.println("What is the expiration date for your item (MM-DD-YYYY)?");
                                            String itemExpirationDate = scanner.nextLine();

                                            //getting if item is organic
                                            System.out.println("Is the item organic (y/n)?");

                                            //item is organic
                                            if (scanner.nextLine() == "y"){
                                                itemOrganic = true;
                                            } else {
                                                itemOrganic = false;
                                            }

                                            //getting nutrition facts of item
                                            System.out.println("What are the nutrition facts for your item?");
                                            String itemNutritionFacts = scanner.nextLine();

                                            //getting how item is packaged/stored
                                            System.out.println("How is the item packaged/stored (e.g boxed, canned, etc.)");
                                            String itemBoxedOrCanned = scanner.nextLine();

                                            ShelfStable newItem = new ShelfStable(itemPrice, itemSection, itemBrand, itemName, itemReturnPolicy, itemExpirationDate, itemOrganic, itemNutritionFacts, itemBoxedOrCanned);
                                            foodItemInventory.add(newItem);
                                            break;

                                    }
                                }
                                //ask user to continue program
                                System.out.println("Would you like to continue adding items (y/n)?)";
                                if (scanner.nextLine() == "y"){
                                    continueAdding = true;
                                } else {
                                    //displaying inventory
                                    System.out.println("The food items inventory now contains: ");
                                    for (FoodItem item: foodItemInventory){
                                        System.out.println(item.getName());
                                    }
                                    continueAdding = false;
                                }
                            } while (continueAdding);
                            break;
                    }
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