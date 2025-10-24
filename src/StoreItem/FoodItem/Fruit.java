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
     * @param description String
     * @param expirationDate int
     * @param organic boolean
     * @param nutritionFacts String
     * @param isBerry boolean
     */

    public Fruit(double price, String section, String brand, String name, String returnPolicy, String description,
                    String expirationDate, boolean organic, String nutritionFacts, boolean isBerry) {
        super(price, section, brand, name, returnPolicy, description, expirationDate, organic, nutritionFacts);
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

    @Override
    public String toString() {
        return super.toString() + String.format(
                " | type=Fruit | berry=%s",
                getIsBerry() ? "yes" : "no"
        );
    }

}
