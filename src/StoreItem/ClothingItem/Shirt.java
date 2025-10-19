package StoreItem.ClothingItem;

public class Shirt extends ClothingItem {
    //Initializing variable
    private String neckHoleType;

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
     * @param neckHoleType String
     */

    public Shirt(double price, String section, String brand, String name, String returnPolicy,
                     String material, String color, String size, String neckHoleType) {
        super(price, section, brand, name, returnPolicy, material, color, size);
        this.neckHoleType = neckHoleType;
    }

    //Getter
    /**
     *
     * @return neckHoleType String
     */
    public String getNeckHoleType(){
        return this.neckHoleType;
    }



    //Setter

    /**
     *
     * @param neckHoleType String
     */
    public void setNeckHoleType(String neckHoleType){
        this.neckHoleType = neckHoleType;
    }

}
