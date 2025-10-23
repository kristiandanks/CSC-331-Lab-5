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

        //initializing variable to store selection to add or remove made by input
        int addRemoveSelection;

        //initializing variable to store category of item type to add
        int addCategorySelection;

        //initializing variable to store selection of item type to add
        int addTypeSelection;

        //creating scanner to receive user input
        Scanner scanner = new Scanner(System.in);

        //initializing inventories for different item types
        ArrayList<FoodItem> foodItemInventory = new ArrayList<>();
        ArrayList<ElectronicsItem> electronicsItemInventory = new ArrayList<>();
        ArrayList<ClothingItem> clothingItemInventory = new ArrayList<>();
        ArrayList<HouseholdItem> householdItemInventory = new ArrayList<>();

        //creating array of arraylists to allow access to lists through indexing
        //this is using polymorphism because subclasses of StoreItem are being passed in as StoreItems
        ArrayList<StoreItem>[] inventories = {foodItemInventory, electronicsItemInventory, clothingItemInventory, householdItemInventory};

        //loop that will run program
        while (running)
        {
            //receiving user input to add, sell, or end
            System.out.printf("Please input the number corresponding to the action you would like to take :%n1) Add an item to the inventory%n2) Sell an item from the inventory%nIf you would like to end the program, press enter.%n");

            //making selection based on input
            userInput = scanner.nextLine();
            try
            {
                //if number is provided, make selection equal to that number (1 or 2 for choices)
                addRemoveSelection = Integer.parseInt(userInput);
            } catch (NumberFormatException e)
            {
                //if input is not numeric, selection is 0, program will end (default switch case)
                addRemoveSelection = 0;
            }


            //branching logic based on input
            switch (addRemoveSelection)
            {
                //user chooses to add
                case 1:
                    //asking user what item category they want to add
                    System.out.printf("What item type would you like to add:%n1) Food%n2) Electronics%n3) Clothing%n4) Household%n");
                    addCategorySelection = scanner.nextInt();
                    scanner.nextLine();

                    //displaying inventory for selected item type
                    for (StoreItem item: inventories[addCategorySelection-1])
                    {
                        System.out.println(item.getName());
                    }

                    //asking user what item type they want to add based on category
                    switch (addCategorySelection)
                    {
                        //user chooses to add Food
                        case 1:
                            System.out.printf("What item type would you like to add?%n1) Fruit%n2) Vegetable%n3) Shelf Stable%n");
                            addTypeSelection = scanner.nextInt();
                            scanner.nextLine();
                            break;

                        //user chooses to add Electronic item
                        case 2:
                            System.out.printf("What item type would you like to add?%n1) Laptop%n2) TV%n3) Phone%n");
                            addTypeSelection = scanner.nextInt();
                            scanner.nextLine();
                            break;

                        //user chooses to add Clothing item
                        case 3:
                            System.out.printf("What item type would you like to add?%n1) Shirt%n2) Outerwear%n3) Shoe");
                            addTypeSelection = scanner.nextInt();
                            scanner.nextLine();
                            break;

                        //user chooses to add Household item
                        case 4:
                            System.out.println("What item type would you like to add?%n1) Furniture%n2) Cleaning supply");
                            addTypeSelection = scanner.nextInt();
                            scanner.nextLine();
                            break;
                    }

                    boolean continueAdding;
                    int addCreateSelection;

                    do
                    {
                        //asking user if they want to add or create items
                        System.out.printf("What would you like to do?%n1) Add more of an existing item%n2) Create a new item");
                        addCreateSelection = scanner.nextInt();

                        //user chooses to add existing item
                        if (addCreateSelection == 1)
                        {
                            //ask what existing item to add
                            System.out.println("Please input the name of the item you would like to add more of.");
                            String addItemName = scanner.nextLine();

                            //iterate through list to find desired item
                            for (StoreItem item : inventories[addCategorySelection])
                            {
                                //desired item found
                                if (item.getName().equals(addItemName))
                                {
                                    inventories[addCategorySelection-1].add(item); //adding another instance of the item to the inventory
                                    break; //stop the loop
                                }
                            }
                        } else
                        {
                            //getting attributes of all store items
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

                            switch (addCategorySelection)
                            {
                                //user chooses to add Food item
                                case 1:
                                    //getting attributes of all food items

                                    //initializing boolean organic variable
                                    boolean itemOrganic;

                                    //getting expiration date of item
                                    System.out.println("What is the expiration date for your item (MM-DD-YYYY)?");
                                    String itemExpirationDate = scanner.nextLine();

                                    //getting if item is organic
                                    System.out.println("Is the item organic (y/n)?");

                                    //item is organic
                                    if (scanner.nextLine().equals("y"))
                                    {
                                        itemOrganic = true;
                                    } else //item is not organic
                                    {
                                        itemOrganic = false;
                                    }

                                    //getting nutrition facts of item
                                    System.out.println("What are the nutrition facts for your item?");
                                    String itemNutritionFacts = scanner.nextLine();

                                    //branching to get attributes of specific type chosen
                                    switch (addTypeSelection){
                                        //user chooses to add fruit
                                        case 1:
                                            //initializing boolean berry variable
                                            boolean itemBerry;

                                            //user inputs if item is berry
                                            System.out.println("Is the item a berry (y/n)?");
                                            if (scanner.nextLine().equals("y")){
                                                itemBerry = true;
                                            } else {
                                                itemBerry = false;
                                            }

                                            //attempting to create item, catch error if invalid numerical inputs
                                            try
                                            {
                                                Fruit newFruit = new Fruit(itemPrice, itemSection, itemBrand, itemName, itemReturnPolicy, itemExpirationDate, itemOrganic, itemNutritionFacts, itemBerry);
                                                inventories[addCategorySelection - 1].add(newFruit);
                                            } catch (IllegalArgumentException e)
                                            {
                                                System.out.println(e);
                                            }
                                            break;
                                        //User chooses to add a vegetable
                                        case 2:
                                            //initializing boolean leafy variable
                                            boolean itemLeafy;

                                            //user inputs if item is leafy
                                            System.out.println("Is the vegetable leafy (y/n)?");
                                            if (scanner.nextLine().equals("y"))
                                            {
                                                itemLeafy = true;
                                            } else
                                            {
                                                itemLeafy = false;
                                            }

                                            //attempting to create item, catch error if invalid numerical inputs
                                            try
                                            {
                                                Vegetable newVegetable = new Vegetable(itemPrice, itemSection, itemBrand, itemName, itemReturnPolicy, itemExpirationDate, itemOrganic, itemNutritionFacts, itemLeafy);
                                                inventories[addCategorySelection - 1].add(newVegetable);
                                            } catch (IllegalArgumentException e)
                                            {
                                                System.out.println(e);
                                            }
                                            break;
                                        //user chooses to add shelf stable item
                                        case 3:
                                            //user inputs packaging method of the item
                                            System.out.println("How is the item packaged (e.g boxed, canned, etc.)?");
                                            String itemBoxedOrCanned = scanner.nextLine();

                                            //attempting to create item, catch error if invalid numerical inputs
                                            try
                                            {
                                                ShelfStable newShelfStable = new ShelfStable(itemPrice, itemSection, itemBrand, itemName, itemReturnPolicy, itemExpirationDate, itemOrganic, itemNutritionFacts, itemBoxedOrCanned);
                                                inventories[addCategorySelection-1].add(newShelfStable);
                                            } catch (IllegalArgumentException e)
                                            {
                                                System.out.println(e);
                                            }
                                            break;
                                    }
                                //user chooses to add Electronic item
                                case 2:
                                    //getting attributes of all electronic items

                                    //getting wattage of item
                                    System.out.println("What is the wattage of the item (in watts)?");
                                    int itemWattage = scanner.nextInt();

                                    //getting screen type of item
                                    System.out.println("What is the screen type of the item?");
                                    String itemScreenType = scanner.nextLine();

                                    //branching based on item type
                                    switch (addTypeSelection)
                                    {
                                        //user chooses to add Laptop
                                        case 1:
                                            //initializing boolean touch screen variable
                                            boolean itemTouchscreen;

                                            //getting cpu of item
                                            System.out.println("What is the cpu of that laptop?");
                                            String itemCpu = scanner.nextLine();

                                            //getting number of ports on laptop
                                            System.out.println("How many ports does the laptop have?");
                                            int itemNumOfPorts = scanner.nextInt();

                                            //getting touchscreen value from user
                                            System.out.println("Is the laptop touchscreen (y/n)?");
                                            if (scanner.nextLine().equals("y"))
                                            {
                                                itemTouchscreen = true;
                                            } else
                                            {
                                                itemTouchscreen = false;
                                            }

                                            //attempting to create and add item, catch invalid numerical inputs
                                            try
                                            {
                                                Laptop newLaptop = new Laptop(itemPrice, itemSection, itemBrand, itemName, itemReturnPolicy, itemWattage, itemScreenType, itemCpu, itemTouchscreen, itemNumOfPorts);
                                                inventories[addCategorySelection-1].add(newLaptop);
                                            } catch (IllegalArgumentException e)
                                            {
                                                System.out.println(e);
                                            } break;
                                        //User chooses to add TV
                                        case 2:
                                            //initializing boolean variables for TV
                                            boolean itemIsSmart;
                                            boolean itemIsFlatscreen;
                                            boolean itemSurroundSound;

                                            //getting if TV is a smart TV from user
                                            System.out.println("Is the TV a smart TV (y/n)?");
                                            if (scanner.nextLine().equals("y"))
                                            {
                                                itemIsSmart = true;
                                            } else
                                            {
                                                itemIsSmart = false;
                                            }

                                            //getting if TV is flatscreen
                                            System.out.println("Is the TV a flatscreen (y/n)?");
                                            if (scanner.nextLine().equals("y"))
                                            {
                                                itemIsFlatscreen = true;
                                            } else
                                            {
                                                itemIsFlatscreen = false;
                                            }

                                            //getting if TV has surround sound
                                            System.out.println("Does the TV have surround sound (y/n)?");
                                            if (scanner.nextLine().equals("y"))
                                            {
                                                itemSurroundSound = true;
                                            } else
                                            {
                                                itemSurroundSound = false;
                                            }
                                            //attempting to create and add item, catch invalid numerical inputs
                                            try
                                            {
                                                TV newTV = new TV(itemPrice, itemSection, itemBrand, itemName, itemReturnPolicy, itemWattage, itemScreenType, itemIsSmart, itemIsFlatscreen, itemSurroundSound);
                                                inventories[addCategorySelection-1].add(newTV);
                                            } catch (IllegalArgumentException e)
                                            {
                                                System.out.println(e);
                                            } break;
                                        //user chooses to add Phone
                                        case 3:
                                            //getting of number of cameras phone has
                                            System.out.println("How many cameras does the phone have?");
                                            int itemNumOfCameras = scanner.nextInt();

                                            //attempting to create and add item, catch invalid numerical inputs
                                            try
                                            {
                                                Phone newPhone = new Phone(itemPrice,itemSection,itemBrand,itemName,itemReturnPolicy,itemWattage,itemScreenType,itemNumOfCameras);
                                                inventories[addCategorySelection-1].add(newPhone);
                                            } catch (IllegalArgumentException e)
                                            {
                                                System.out.println(e);
                                            } break;

                                    }
                                //user chooses to add Clothing item
                                case 3:
                                    //getting attributes of all clothing items
                                    //getting material of item
                                    System.out.println("What material is the item made of?");
                                    String itemMaterial = scanner.nextLine();

                                    //getting color of item
                                    System.out.println("What color is the item?");
                                    String itemColor = scanner.nextLine();

                                    //getting size of item
                                    System.out.println("What is the size of the item?");
                                    String itemSize = scanner.nextLine();

                                    //branching based on type of clothing
                                    switch (addTypeSelection)
                                    {
                                        //user chooses to add shirt
                                        case 1:
                                            //getting neck hole type of shirt
                                            System.out.println("What is the neck hole type of the shirt (crew-neck, v-neck, etc.)?");
                                            String itemNeckHoleType = scanner.nextLine();

                                            //attempting to create and add item, catch invalid numerical inputs
                                            try
                                            {
                                                Shirt newShirt = new Shirt(itemPrice, itemSection, itemBrand, itemName, itemReturnPolicy, itemMaterial, itemColor, itemSize, itemNeckHoleType);
                                                inventories[addCategorySelection-1].add(newShirt);
                                            } catch (IllegalArgumentException e)
                                            {
                                                System.out.println(e);
                                            } break;

                                        //user chooses to add outerwear
                                        case 2:
                                            //initializing boolean value for zipper
                                            boolean itemHasZipper;

                                            //asking user if clothing item has zipper
                                            System.out.println("Does the clothing have a zipper (y/n)?");
                                            if (scanner.nextLine().equals("y"))
                                            {
                                                itemHasZipper = true;
                                            } else
                                            {
                                                itemHasZipper = false;
                                            }


                                        //user chooses to add outerwear
                                        case 2:

                                        //user chooses to add shoes
                                        case 3:
                                    }

                            }
                        }
                    } while (continueAdding);

            }


                    //branching logic based on item type to add
                    switch (addTypeSelection)
                    {
                        //user chooses to add FoodItems
                        case 1:
                            //displaying inventory
                            System.out.println("The food items inventory currently contains: ");
                            for (FoodItem item: foodItemInventory)
                            {
                                System.out.println(item.getName());
                            }
                            //initialzing variable for do-while condition
                            boolean continueAdding;
                            do
                            {
                                //receiving user input to add existing items or create new ones
                                System.out.printf("What would you like to do:%n1) Add more of an existing item already in the list%n2) Create a new item to add to the list%n");
                                int addCreateSelection = scanner.nextInt();
                                scanner.nextLine();

                                //add more of an existing item
                                if (addCreateSelection == 1)
                                {
                                    //ask what existing item to add
                                    System.out.println("Please input the name of the item you would like to add more of.");
                                    String addItemName = scanner.nextLine();

                                    //iterate through list to find desired item
                                    for (FoodItem item : foodItemInventory)
                                    {
                                        //desired item found
                                        if (item.getName().equals(addItemName))
                                        {
                                            foodItemInventory.add(item); //adding another instance of the item to the inventory
                                            break; //stop the loop
                                        }
                                    }
                                } else
                                {
                                    //user is creating a new item, ask which type
                                    System.out.printf("Which item type would you like to create:%n1) Fruit%n2) Vegetable%n3) Shelf Stable%n");
                                    int newItemType = scanner.nextInt();
                                    scanner.nextLine();

                                    //branching logic based on new item type
                                    switch (newItemType)
                                    {
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
                                            if (scanner.nextLine().equals("y"))
                                            {
                                                itemOrganic = true;
                                            } else
                                            {
                                                itemOrganic = false;
                                            }

                                            //getting nutrition facts of item
                                            System.out.println("What are the nutrition facts for your item?");
                                            String itemNutritionFacts = scanner.nextLine();

                                            //getting if item is a berry
                                            System.out.println("Is the item a berry (y/n)?");

                                            //item is berry
                                            if (scanner.nextLine().equals("y"))
                                            {
                                                itemBerry = true;
                                            } else
                                            {
                                                itemBerry = false;
                                            }

                                            //create item and add to list
                                            Fruit newItem = new Fruit(itemPrice, itemSection, itemBrand, itemName, itemReturnPolicy, itemExpirationDate, itemOrganic, itemNutritionFacts, itemBerry);
                                            foodItemInventory.add(newItem);
                                            break;
                                        //user is adding a vegetable
                                        case 2:

                                            //initializing boolean values that are assigned in conditional statements
                                            boolean itemIsLeafy;
                                            //getting price and round it to two decimal places
                                            System.out.println("How much is your vegetbale going to cost?");
                                            itemPrice = Math.round(scanner.nextDouble() * 100) /100;
                                            scanner.nextLine();

                                            //getting section for item
                                            System.out.println("What section/aisle would your item be found on (e.g. A19)?");
                                            itemSection = scanner.nextLine();

                                            //getting brand of item
                                            System.out.println("What is the brand of the item?");
                                            itemBrand = scanner.nextLine();

                                            //getting name of item
                                            System.out.println("What is the name of the item?");
                                            itemName = scanner.nextLine();

                                            //getting return policy of item
                                            System.out.println("What is the item's return policy?");
                                            itemReturnPolicy = scanner.nextLine();

                                            //getting expiration date of item
                                            System.out.println("What is the expiration date for your item (MM-DD-YYYY)?");
                                            itemExpirationDate = scanner.nextLine();

                                            //getting if item is organic
                                            System.out.println("Is the item organic (y/n)?");

                                            //item is organic
                                            if (scanner.nextLine().equals("y"))
                                            {
                                                itemOrganic = true;
                                            } else
                                            {
                                                itemOrganic = false;
                                            }

                                            //getting nutrition facts of item
                                            System.out.println("What are the nutrition facts for your item?");
                                            itemNutritionFacts = scanner.nextLine();

                                            //getting if item is leafy
                                            System.out.println("Is the vegetable leafy?");
                                            if (scanner.nextLine().equals("y"))
                                            {
                                                itemIsLeafy = true;
                                            } else
                                            {
                                                itemIsLeafy = false;
                                            }

                                            //create item and add to list
                                            Vegetable newVeg = new Vegetable(itemPrice, itemSection, itemBrand, itemName, itemReturnPolicy, itemExpirationDate, itemOrganic, itemNutritionFacts, itemIsLeafy);
                                            foodItemInventory.add(newVeg);
                                            break;
                                        case 3:
                                            //user adds a shelf stable item
                                            //initializing boolean values that are assigned in conditional statements
                                            //getting price and round it to two decimal places
                                            System.out.println("How much is your fruit going to cost?");
                                            itemPrice = Math.round(scanner.nextDouble() * 100) /100;
                                            scanner.nextLine();

                                            //getting section for item
                                            System.out.println("What section/aisle would your item be found on (e.g. A19)?");
                                            itemSection = scanner.nextLine();

                                            //getting brand of item
                                            System.out.println("What is the brand of the item?");
                                            itemBrand = scanner.nextLine();

                                            //getting name of item
                                            System.out.println("What is the name of the item?");
                                            itemName = scanner.nextLine();

                                            //getting return policy of item
                                            System.out.println("What is the item's return policy?");
                                            itemReturnPolicy = scanner.nextLine();

                                            //getting expiration date of item
                                            System.out.println("What is the expiration date for your item (MM-DD-YYYY)?");
                                            itemExpirationDate = scanner.nextLine();

                                            //getting if item is organic
                                            System.out.println("Is the item organic (y/n)?");

                                            //item is organic
                                            if (scanner.nextLine().equals("y"))
                                            {
                                                itemOrganic = true;
                                            } else
                                            {
                                                itemOrganic = false;
                                            }

                                            //getting nutrition facts of item
                                            System.out.println("What are the nutrition facts for your item?");
                                            itemNutritionFacts = scanner.nextLine();

                                            //getting how item is packaged/stored
                                            System.out.println("How is the item packaged/stored (e.g boxed, canned, etc.)");
                                            String itemBoxedOrCanned = scanner.nextLine();

                                            ShelfStable newShelfStable = new ShelfStable(itemPrice, itemSection, itemBrand, itemName, itemReturnPolicy, itemExpirationDate, itemOrganic, itemNutritionFacts, itemBoxedOrCanned);
                                            foodItemInventory.add(newShelfStable);
                                            break;

                                    }
                                }
                                //ask user to continue program
                                System.out.println("Would you like to continue adding items (y/n)?)");
                                if (scanner.nextLine().equals("y"))
                                {
                                    continueAdding = true;
                                } else
                                {
                                    //displaying inventory
                                    System.out.println("The food items inventory now contains: ");
                                    for (FoodItem item: foodItemInventory)
                                    {
                                        System.out.println(item.getName());
                                    }
                                    continueAdding = false;
                                }
                            } while (continueAdding);
                            break;
                        //user chooses to add electronics item
                        case 2:
                            //displaying inventory
                            System.out.println("The food items inventory currently contains: ");
                            for (ElectronicsItem item: electronicsItemInventory)
                            {
                                System.out.println(item.getName());
                            }
                            //initialzing variable for do-while condition
                            do
                            {
                                //receiving user input to add existing items or create new ones
                                System.out.printf("What would you like to do:%n1) Add more of an existing item already in the list%n2) Create a new item to add to the list%n");
                                int addCreateSelection = scanner.nextInt();
                                scanner.nextLine();

                                //add more of an existing item
                                if (addCreateSelection == 1)
                                {
                                    //ask what existing item to add
                                    System.out.println("Please input the name of the item you would like to add more of.");
                                    String addItemName = scanner.nextLine();

                                    //iterate through list to find desired item
                                    for (ElectronicsItem item : electronicsItemInventory)
                                    {
                                        //desired item found
                                        if (item.getName().equals(addItemName))
                                        {
                                            electronicsItemInventory.add(item); //adding another instance of the item to the inventory
                                            break; //stop the loop
                                        }
                                    }
                                } else
                                {
                                    //user is creating a new item, ask which type
                                    System.out.printf("Which item type would you like to create:%n1) Laptop%n2) TV%n3) Phone%n");
                                    int newItemType = scanner.nextInt();
                                    scanner.nextLine();

                                    //getting price and round it to two decimal places
                                    System.out.println("How much is your item going to cost?");
                                    double itemPrice = Math.round(scanner.nextDouble() * 100) / 100;
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

                                    //getting wattage of item
                                    System.out.println("What is the wattage of the item (in Watts)?");
                                    int itemWattage = scanner.nextInt();
                                    scanner.nextLine();

                                    //getting type of screen
                                    System.out.println("What is the screen type of the device?");
                                    String itemScreenType = scanner.nextLine();

                                    //branching logic based on new item type
                                    switch (newItemType)
                                    {

                                        //user chooses to add new laptop
                                        case 1:
                                            //initializing boolean variables that are assigned in conditionals
                                            boolean itemTouchscreen;

                                            //getting cpu of the laptop from the user
                                            System.out.println("Please provide the cpu of the laptop: ");
                                            String itemCpu = scanner.nextLine();

                                            //getting if laptop is touchscreen or not
                                            System.out.println("Is the laptop touchscreen (y/n)?");
                                            if (scanner.nextLine().equals("y"))
                                            {
                                                itemTouchscreen = true;
                                            } else
                                            {
                                                itemTouchscreen = false;
                                            }

                                            //getting number of ports
                                            System.out.println("How many ports does the laptop have?");
                                            int itemNumOfPorts = scanner.nextInt();
                                            scanner.nextLine();

                                            Laptop newItem = new Laptop(itemPrice, itemSection, itemBrand, itemName, itemReturnPolicy, itemWattage, itemScreenType, itemCpu, itemTouchscreen, itemNumOfPorts);
                                            electronicsItemInventory.add(newItem);
                                            break;
                                        //User chooses to add new TV
                                        case 2:
                                            //initializing boolean variables that are assigned in conditionals
                                            boolean itemIsSmart;
                                            boolean itemIsFlatscreen;
                                            boolean itemSurroundSound;

                                            //getting if TV is smart TV
                                            System.out.println("Is this TV a smart TV (y/n)?");
                                            if (scanner.nextLine().equals("y"))
                                            {
                                                itemIsSmart = true;
                                            } else
                                            {
                                                itemIsSmart = false;
                                            }

                                            //getting if TV is flatscreen
                                            System.out.println("Is this TV a flatscreen TV (y/n)?");
                                            if (scanner.nextLine().equals("y"))
                                            {
                                                itemIsFlatscreen = true;
                                            } else
                                            {
                                                itemIsFlatscreen = false;
                                            }

                                            //getting if TV has surround sound
                                            System.out.println("Does this TV have surround sound (y/n)?");
                                            if (scanner.nextLine().equals("y"))
                                            {
                                                itemSurroundSound = true;
                                            } else
                                            {
                                                itemSurroundSound = false;
                                            }

                                            //this is using polymorphism to add an instance of the TV class to an ArrayList of electronics items
                                            TV newTV = new TV(itemPrice, itemSection, itemBrand, itemName, itemReturnPolicy, itemWattage, itemScreenType, itemIsSmart, itemIsFlatscreen, itemSurroundSound);
                                            electronicsItemInventory.add(newTV);
                                            break;
                                        //User chooses to add new phone
                                        case 3:
                                            //getting number of cameras
                                            System.out.println("How many cameras does this phone have?");
                                            int itemNumOfCameras = scanner.nextInt();
                                            scanner.nextLine();

                                            //this is using polymorphism to add an instance of the Phone class to an ArrayList of electronics items
                                            Phone newPhone = new Phone(itemPrice, itemSection, itemBrand, itemName, itemReturnPolicy, itemWattage, itemScreenType, itemNumOfCameras);
                                            electronicsItemInventory.add(newPhone);
                                            break;
                                    }
                                    }
                            //ask user to continue program
                            System.out.println("Would you like to continue adding items (y/n)?)");
                            if (scanner.nextLine().equals("y"))
                            {
                                continueAdding = true;
                            } else
                            {
                                //displaying inventory
                                System.out.println("The electronics items inventory now contains: ");
                                for (ElectronicsItem item : electronicsItemInventory)
                                {
                                    System.out.println(item.getName());
                                }
                                continueAdding = false;
                            }
                        } while (continueAdding);
                        break;
                        //user chooses to add clothing item
                        case 3:
                            //displaying inventory
                            System.out.println("The clothing items inventory currently contains: ");
                            for (ClothingItem item: clothingItemInventory)
                            {
                                System.out.println(item.getName());
                            }
                            //initialzing variable for do-while condition
                            do
                            {
                                //receiving user input to add existing items or create new ones
                                System.out.printf("What would you like to do:%n1) Add more of an existing item already in the list%n2) Create a new item to add to the list%n");
                                int addCreateSelection = scanner.nextInt();
                                scanner.nextLine();

                                //add more of an existing item
                                if (addCreateSelection == 1)
                                {
                                    //ask what existing item to add
                                    System.out.println("Please input the name of the item you would like to add more of.");
                                    String addItemName = scanner.nextLine();

                                    //iterate through list to find desired item
                                    for (ClothingItem item : clothingItemInventory)
                                    {
                                        //desired item found
                                        if (item.getName().equals(addItemName))
                                        {
                                            clothingItemInventory.add(item); //adding another instance of the item to the inventory
                                            break; //stop the loop
                                        }
                                    }
                                } else
                                {
                                    //getting input for item type to add
                                    System.out.printf("What item type would you like to add:%n1) Outerwear%n2) Shoe%n3) Shirt");
                                    addCreateSelection = scanner.nextInt();
                                    scanner.nextLine();

                                    //getting price and round it to two decimal places
                                    System.out.println("How much is your item going to cost?");
                                    double itemPrice = Math.round(scanner.nextDouble() * 100) / 100;
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

                                    //getting material of item
                                    System.out.println("What material is the item made of?");
                                    String itemMaterial = scanner.nextLine();

                                    //getting color of item
                                    System.out.println("What color is the item?");
                                    String itemColor = scanner.nextLine();

                                    //getting size of item
                                    System.out.println("What is the size of the item?");
                                    String itemSize = scanner.nextLine();

                                    //branching logic based on item type to be added
                                    switch (addCreateSelection){

                                    }
                                }
                            break;
                        //user chooses to add household item
                        case 4:
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