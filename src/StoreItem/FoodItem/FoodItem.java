package StoreItem.FoodItem;


import StoreItem.StoreItem;

public class FoodItem extends StoreItem {
    //Initializing variables
    private String expirationDate;
    private boolean organic;
    private String nutritionFacts;

    /**
     * Constructor
     * @param price double
     * @param section String
     * @param brand String
     * @param name String
     * @param returnPolicy String
     * @param description String
     * @param expirationDate String
     * @param organic boolean
     * @param nutritionFacts String
     */

    public FoodItem(double price, String section, String brand, String name, String returnPolicy, String description,
                    String expirationDate, boolean organic, String nutritionFacts) {
        super(price, section, brand, name, returnPolicy, description);
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
    public String getExpirationDate(){
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
    public void setExpirationDate(String expirationDate){
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

    @Override
    public String toString() {
        return super.toString() + String.format(
                " | type=FoodItem | exp=%s | organic=%s | nutrition=%s",
                getExpirationDate(),
                getOrganic() ? "yes" : "no",
                getNutritionFacts()
        );
    }
}