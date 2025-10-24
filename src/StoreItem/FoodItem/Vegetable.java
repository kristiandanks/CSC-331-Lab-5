package StoreItem.FoodItem;

public class Vegetable extends FoodItem {
    //Initializing variable
    private boolean isLeafy;

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
     * @param isLeafy boolean
     */

    public Vegetable(double price, String section, String brand, String name, String returnPolicy,
                 String expirationDate, boolean organic, String nutritionFacts, boolean isLeafy) {
        super(price, section, brand, name, returnPolicy, expirationDate, organic, nutritionFacts);
        this.isLeafy = isLeafy;
    }

    //Getter
    /**
     *
     * @return isLeafy Boolean
     */
    public boolean getIsLeafy(){
        return this.isLeafy;
    }



    //Setter

    /**
     *
     * @param isLeafy boolean
     */
    public void setIsLeafy(boolean isLeafy){
        this.isLeafy = isLeafy;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(
                " | type=Vegetable | exp=%s | organic=%s | nutrition=%s | leafy=%s",
                getExpirationDate(),
                getOrganic() ? "yes" : "no",
                getNutritionFacts(),
                getIsLeafy() ? "yes" : "no"
        );
    }
}
