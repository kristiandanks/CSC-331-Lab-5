package StoreItem.HouseholdItem;

import StoreItem.StoreItem;

public class HouseholdItem extends StoreItem {
    //Initializing variables
    private String volume;
    private String intendedUse;

    /**
     * Constructor
     * @param price double
     * @param section String
     * @param brand String
     * @param name String
     * @param returnPolicy String
     * @param volume String
     * @param intendedUse String
     */

    public HouseholdItem(double price, String section, String brand, String name, String returnPolicy
                            , String volume, String intendedUse) {
        super(price, section, brand, name, returnPolicy);
        this.volume = volume;
        this.intendedUse = intendedUse;
    }

    //Getters

    /**
     *
     * @return volume String
     */
    public String getVolume(){
        return this.volume;
    }

    /**
     *
     * @return intendedUse String
     */
    public String getIntendedUse(){
        return this.intendedUse;
    }

    //Setters

    /**
     *
     * @param volume String
     */
    public void setVolume(String volume){
        this.volume = volume;
    }

    /**
     *
     * @param intendedUse String
     */
    public void setIntendedUse (String intendedUse){
        this.intendedUse = intendedUse;
    }
}
