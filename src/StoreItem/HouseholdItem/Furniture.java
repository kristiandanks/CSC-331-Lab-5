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
     * @param description String
     * @param volume String
     * @param intendedUse String
     * @param weight double
     * @param material String
     */

    public Furniture(double price, String section, String brand, String name, String returnPolicy
            , String description, String volume, String intendedUse, double weight, String material) {
        super(price, section, brand, name, returnPolicy, description, volume, intendedUse);

        //validating weight input
        if (weight <= 0){
            throw new IllegalArgumentException("The weight of the furniture must be a number greater than or equal to 0.");
        }

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
        //validating weight input
        if (weight <= 0){
            throw new IllegalArgumentException("Weight must be a number greater than 0.");
        }
        this.weight = weight;
    }

    /**
     *
     * @param material String
     */
    public void setMaterial (String material){
        this.material = material;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(
                " | type=Furniture | weight=%.1f lbs | material=%s",
                getWeight(),
                getMaterial()
        );
    }
}
