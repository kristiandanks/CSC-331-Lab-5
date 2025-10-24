package StoreItem;

public class StoreItem {
    //initializing variables
    private double price;
    private String section;
    private String brand;
    private String name;
    private String returnPolicy;
    private String description;

    //Constructor
    /**
     *
     * @param price double
     * @param section String
     * @param brand String
     * @param name String
     * @param returnPolicy String
     * @param description String
     */
    public StoreItem(double price, String section, String brand, String name, String returnPolicy, String description){

        //validating price input
        if (price < 0){
            throw new IllegalArgumentException("Price must be a number greater than or equal to 0.");
        }

        this.price = price;
        this.section = section;
        this.brand = brand;
        this.name = name;
        this.returnPolicy = returnPolicy;
        this.description = description;
    }

    //Getters

    /**
     * @return price double
     */
    public double getPrice(){
        return price;
    }

    /**
     * @return section String
     */
    public String getSection(){
        return section;
    }

    /**
     * @return brand String
     */
    public String getBrand(){
        return brand;
    }

    /**
     * @return name String
     */
    public String getName(){
        return name;
    }

    /**
     * @return returnPolicy String
     */
    public String getReturnPolicy(){
        return returnPolicy;
    }

    /**
     *
     * @return description String
     */
    public String getDescription() { return description;}

    //Setters
    /**
     *
     * @param price double
     */
    public void setPrice(double price){
        this.price = price;
    }

    /**
     *
     * @param section String
     */
    public void setSection(String section){
        this.section = section;
    }

    /**
     *
     * @param brand String
     */
    public void setBrand(String brand){
        this.brand = brand;
    }

    /**
     *
     * @param name String
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     *
     * @param returnPolicy String
     */
    public void setReturnPolicy(String returnPolicy){
        this.returnPolicy = returnPolicy;
    }

    /**
     *
     * @param description String
     */
    public void setDescription(String description) {this.description = description;}

    @Override
    public String toString() {
        return String.format(
                "%s | brand=%s | section=%s | $%.2f | policy=%s | description=%s",
                name, brand, section, price, returnPolicy, description
        );
    }
}
