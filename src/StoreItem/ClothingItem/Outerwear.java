package StoreItem.ClothingItem;

public class Outerwear extends ClothingItem {
    //Initializing variable
    private boolean hasZipper;

    /**
     * Constructor
     * @param price double
     * @param section String
     * @param brand String
     * @param name String
     * @param returnPolicy String
     * @param description String
     * @param material String
     * @param color String
     * @param size String
     * @param hasZipper boolean
     */

    public Outerwear(double price, String section, String brand, String name, String returnPolicy, String description,
                 String material, String color, String size, boolean hasZipper) {
        super(price, section, brand, name, returnPolicy, description, material, color, size);
        this.hasZipper = hasZipper;
    }

    //Getter
    /**
     *
     * @return hasZipper Boolean
     */
    public boolean getHasZipper(){
        return this.hasZipper;
    }



    //Setter

    /**
     *
     * @param hasZipper boolean
     */
    public void setHasZipper(boolean hasZipper){
        this.hasZipper = hasZipper;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(
                " | type=Outerwear | zipper=%s",
                getHasZipper() ? "yes" : "no"
        );
    }
}
