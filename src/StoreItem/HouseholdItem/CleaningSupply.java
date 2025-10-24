package StoreItem.HouseholdItem;

public class CleaningSupply extends HouseholdItem {
    //Initializing variables
    private String activeChemical;

    /**
     * Constructor
     * @param price double
     * @param section String
     * @param brand String
     * @param name String
     * @param returnPolicy String
     * @param volume String
     * @param intendedUse String
     * @param activeChemical String
     */

    public CleaningSupply(double price, String section, String brand, String name, String returnPolicy
            , String volume, String intendedUse, String activeChemical) {
        super(price, section, brand, name, returnPolicy, volume, intendedUse);
        this.activeChemical = activeChemical;
    }

    //Getter

    /**
     *
     * @return activeChemical String
     */
    public String getActiveChemical(){
        return this.activeChemical;
    }

    //Setter

    /**
     *
     * @param activeChemical String
     */
    public void setActiveChemical(String activeChemical){
        this.activeChemical = activeChemical;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(
                " | type=CleaningSupply | activeChemical=%s",
                getActiveChemical()
        );
    }
}
