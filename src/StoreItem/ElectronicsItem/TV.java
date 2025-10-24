package StoreItem.ElectronicsItem;


public class TV extends ElectronicsItem {
    //initializing variables
    private boolean isSmart;
    private boolean isFlatScreen;
    private boolean surroundSound;


    /**
     * Constructor
     * @param price double
     * @param section String
     * @param brand String
     * @param name String
     * @param returnPolicy String
     * @param wattage int
     * @param screenType String
     * @param isSmart boolean
     * @param isFlatScreen boolean
     * @param surroundSound boolean
     */
    public TV(double price, String section, String brand, String name, String returnPolicy, int wattage, String screenType,
              boolean isSmart, boolean isFlatScreen, boolean surroundSound){

        super(price, section, brand, name, returnPolicy, wattage, screenType);
        this.isSmart = isSmart;
        this.isFlatScreen = isFlatScreen;
        this.surroundSound = surroundSound;
    }

    //Getters
    /**
     *
     * @return isSmart boolean
     */
    public boolean getIsSmart(){
        return isSmart;
    }

    /**
     *
     * @return isSmart boolean
     */
    public boolean getIsFlatScreen(){
        return isFlatScreen;
    }

    /**
     *
     * @return surroundSound boolean
     */
    public boolean getSurroundSound(){
        return surroundSound;
    }

    //Setters
    /**
     *
     * @param isSmart boolean
     */
    public void setIsSmart(boolean isSmart){
        this.isSmart = isSmart;
    }

    /**
     *
     * @param isFlatScren boolean
     */
    public void setIsFlatScreen(boolean isFlatScren){
        this.isFlatScreen = isFlatScreen;
    }

    /**
     *
     * @param surroundSound boolean
     */
    public void setSurroundSound(boolean surroundSound){
        this.surroundSound = surroundSound;
    }

    //testing to ensure getters and setters work properly
    /**
     * Main method for testing
     * param args String[]
     */
//    public static void main(String[] args){
//        TV toshiba = new TV(1500, "A15", "Toshiba", "Smart TV", "Return within 30 days", 240, "OLED", true, true, false);
//        System.out.println(toshiba.getPrice()+toshiba.getSection()+toshiba.getBrand()+toshiba.getName()+toshiba.getReturnPolicy()+toshiba.getWattage()+toshiba.getScreenType()+toshiba.getIsSmart()+toshiba.getIsFlatScreen()+toshiba.getSurroundSound());
//    }
}


