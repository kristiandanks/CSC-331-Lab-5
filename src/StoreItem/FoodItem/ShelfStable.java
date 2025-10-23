package StoreItem.FoodItem;

public class ShelfStable extends FoodItem {
    //Initializing variable
    private String boxedOrCanned;

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
     * @param boxedOrCanned String
     */

    public ShelfStable(double price, String section, String brand, String name, String returnPolicy,
                 String expirationDate, boolean organic, String nutritionFacts, String boxedOrCanned) {
        super(price, section, brand, name, returnPolicy, expirationDate, organic, nutritionFacts);
        this.boxedOrCanned = boxedOrCanned;
    }

    //Getter
    /**
     *
     * @return boxedOrCanned String
     */
    public String getBoxedOrCanned(){
        return this.boxedOrCanned;
    }



    //Setter

    /**
     *
     * @param boxedOrCanned String
     */
    public void setBoxedOrCanned(String boxedOrCanned){
        this.boxedOrCanned = boxedOrCanned;
    }


}
