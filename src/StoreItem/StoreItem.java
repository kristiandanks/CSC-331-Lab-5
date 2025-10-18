package StoreItem;

public class StoreItem {
    //initializing variables
    private double price;
    private String section;
    private String brand;
    private String name;
    private String returnPolicy;

    //Constructor
    /**
     *
     * @param price double
     * @param section String
     * @param brand String
     * @param name String
     * @param returnPolicy String
     */
    public StoreItem(double price, String section, String brand, String name, String returnPolicy){
        this.price = price;
        this.section = section;
        this.brand = brand;
        this.name = name;
        this.returnPolicy = returnPolicy;
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
}
