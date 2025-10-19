package StoreItem.FoodItem;


public class Fruit extends FoodItem {

    //Initializing variable
    private boolean isBerry;

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
     * @param isBerry boolean
     */

    public Fruit(double price, String section, String brand, String name, String returnPolicy,
                    int expirationDate, boolean organic, String nutritionFacts, boolean isBerry) {
        super(price, section, brand, name, returnPolicy, expirationDate, organic, nutritionFacts);
        this.isBerry = isBerry;
    }

    //Getter
    /**
     *
     * @return isBerry Boolean
     */
    public boolean getIsBerry(){
        return this.isBerry;
    }



    //Setter

    /**
     *
     * @param isBerry boolean
     */
    public void setIsBerry(boolean isBerry){
        this.isBerry = isBerry;
    }


}
