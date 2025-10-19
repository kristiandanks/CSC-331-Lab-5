package StoreItem.ClothingItem;

public class Shoe extends ClothingItem{
    //Initializing variable
    private String shoeType;

    /**
     * Constructor
     * @param price double
     * @param section String
     * @param brand String
     * @param name String
     * @param returnPolicy String
     * @param material String
     * @param color String
     * @param size String
     * @param shoeType String
     */

    public Shoe(double price, String section, String brand, String name, String returnPolicy,
                 String material, String color, String size, String shoeType) {
        super(price, section, brand, name, returnPolicy, material, color, size);
        this.shoeType = shoeType;
    }

    //Getter
    /**
     *
     * @return shoeType String
     */
    public String getShoeType(){
        return this.shoeType;
    }



    //Setter

    /**
     *
     * @param shoeType String
     */
    public void setShoeType(String shoeType){
        this.shoeType = shoeType;
    }

}
