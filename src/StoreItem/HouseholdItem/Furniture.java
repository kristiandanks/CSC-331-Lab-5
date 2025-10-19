package StoreItem.HouseholdItem;

public class Furniture extends HouseholdItem {
    //Initializing variables
    private double weight;
    private String material;

    /**
     * Constructor
     * @param price double
     * @param section String
     * @param brand String
     * @param name String
     * @param returnPolicy String
     * @param volume String
     * @param intendedUse String
     * @param weight double
     * @param material String
     */

    public Furniture(double price, String section, String brand, String name, String returnPolicy
            , String volume, String intendedUse, double weight, String material) {
        super(price, section, brand, name, returnPolicy, volume, intendedUse);
        this.weight = weight;
        this.material = material;
    }

    //Getters

    /**
     *
     * @return weight double
     */
    public double getWeight(){
        return this.weight;
    }

    /**
     *
     * @return material String
     */
    public String getMaterial(){
        return this.material;
    }

    //Setters

    /**
     *
     * @param weight double
     */
    public void setWeight(double weight){
        this.weight = weight;
    }

    /**
     *
     * @param material String
     */
    public void setMaterial (String material){
        this.material = material;
    }
}
