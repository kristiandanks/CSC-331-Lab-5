package StoreItem.ElectronicsItem;

import StoreItem.StoreItem;

public class ElectronicsItem extends StoreItem {
    //initializing variables
    private int wattage;
    private String screenType;

    /**
     * Constructor
     * @param price double
     * @param section String
     * @param brand String
     * @param name String
     * @param returnPolicy String
     * @param wattage int
     * @param screenType String
     */
    public ElectronicsItem(double price, String section, String brand, String name, String returnPolicy,
                           int wattage, String screenType){
        super(price, section, brand, name, returnPolicy);

        //validating wattage input
        if (wattage <= 0){
            throw new IllegalArgumentException("Wattage must be an integer greater than 0.");
        }

        this.wattage = wattage;
        this.screenType = screenType;
    }

    //Getters
    /**
     *
     * @return wattage int
     */
    public int getWattage(){
        return this.wattage;
    }

    /**
     *
     * @return screenType String
     */
    public String getScreenType(){
        return this.screenType;
    }

    //Setters

    /**
     *
     * @param wattage int
     */
    public void setWattage(int wattage){

        //validating wattage input
        if (wattage <= 0){
            throw new IllegalArgumentException("Wattage must be an integer greater than 0.");
        }

        this.wattage = wattage;
    }

    /**
     *
     * @param screenType String
     */
    public void setScreenType(String screenType){
        this.screenType = screenType;
    }
}

