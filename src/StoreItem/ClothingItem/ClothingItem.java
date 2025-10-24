package StoreItem.ClothingItem;

import StoreItem.StoreItem;

public class ClothingItem extends StoreItem {
    //Initializing variables
    private String material;
    private String color;
    private String size;

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
     */

    public ClothingItem(double price, String section, String brand, String name, String returnPolicy,
                    String material, String color, String size) {
        super(price, section, brand, name, returnPolicy);
        this.material = material;
        this.color = color;
        this.size = size;
    }

    //Getters
    /**
     *
     * @return material String
     */
    public String getMaterial(){
        return this.material;
    }

    /**
     *
     * @return color String
     */
    public String getColor(){
        return this.color;
    }

    /**
     *
     * @return size String
     */
    public String getSize(){
        return this.size;
    }

    //Setters

    /**
     *
     * @param material String
     */
    public void setMaterial (String material){
        this.material = material;
    }

    /**
     *
     * @param color String
     */
    public void setColor (String color){
        this.color = color;
    }

    /**
     *
     * @param size String
     */
    public void setSize (String size){
        this.size = size;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(
                " | category=Clothing | material=%s | color=%s | size=%s",
                getMaterial(),
                getColor(),
                getSize()
        );
    }
}
