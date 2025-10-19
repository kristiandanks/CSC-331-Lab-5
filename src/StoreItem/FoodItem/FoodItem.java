package StoreItem.FoodItem;

import StoreItem.StoreItem;


public class FoodItem extends StoreItem {
    //Initializing variables
    private int expirationDate;
    private boolean organic;
    private String nutritionFacts;

    /**
     * Constructor
     * @param price double
     * @param section String
     * @param brand String
     * @param name String
     * @param returnPolicy String
     * @param expirationDate int
     * @param organic boolean
     * @param nutritionFacts String
     */

    public FoodItem(double price, String section, String brand, String name, String returnPolicy,
                    int expirationDate, boolean organic, String nutritionFacts) {
        super(price, section, brand, name, returnPolicy);
        this.expirationDate = expirationDate;
        this.organic = organic;
        this.nutritionFacts = nutritionFacts;
    }

    //Getters
    /**
     *
     * @return expirationDate int
     *
     */
    public int getExpirationDate(){
        return this.expirationDate;
    }

    /**
     *
     * @return organic boolean
     */
    public boolean getOrganic(){
        return this.organic;
    }

    /**
     *
     * @return nutritionFacts String
     */
    public String getNutritionFacts(){

        return this.nutritionFacts;
    }

    //Setters

    /**
     *
     * @param expirationDate int
     */
    public void setExpirationDate(int expirationDate){
        this.expirationDate = expirationDate;
    }

    /**
     *
     * @param organic boolean
     */
    public void setOrganic(boolean organic){
        this.organic = organic;
    }

    /**
     *
     * @param nutritionFacts String
     */
    public void setNutritionFacts(String nutritionFacts){
        this.nutritionFacts = nutritionFacts;
    }
}