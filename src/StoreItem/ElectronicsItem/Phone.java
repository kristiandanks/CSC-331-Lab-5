package StoreItem.ElectronicsItem;


public class Phone extends ElectronicsItem {
    //initializing variables
    private int numOfCameras;

    /**
     * Constructor
     *
     * @param price        double
     * @param section      String
     * @param brand        String
     * @param name         String
     * @param returnPolicy String
     * @param wattage      int
     * @param screenType   String
     * @param numOfCameras int
     */
    public Phone(double price, String section, String brand, String name, String returnPolicy,
                 int wattage, String screenType, int numOfCameras) {
        super(price, section, brand, name, returnPolicy, wattage, screenType);

        //validating numOfCameras input
        if (numOfCameras < 0){
            throw new IllegalArgumentException("The number of cameras must be an integer greater than or equal to 0.");
        }

        this.numOfCameras = numOfCameras;

    }

    //Getter

    /**
     *
     * @return numOfCameras int
     */
    public int getNumOfCameras() {
        return this.numOfCameras;
    }

    //Setter

    /**
     *
     * @param numOfCameras int
     */

    public void setNumOfCameras(int numOfCameras) {
        //validating number of cameras input
        if (numOfCameras <0){
            throw new IllegalArgumentException("Number of cameras must be a number greater than or equal to zero.");
        }

        this.numOfCameras = numOfCameras;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(
                " | type=Phone | cameras=%d",
                getNumOfCameras()
        );
    }
    //used for testing functionality of Phone getters and setters
    /**
     * Main method for testing
     * param args String[]
     */
//    public static void main(String[] args){
//        Phone iPhone = new Phone(650, "A20", "Apple", "iPhone 16", "Return within 30 days", 95, "LCD", 3);
//        System.out.println(iPhone.getPrice()+iPhone.getSection()+iPhone.getBrand()+iPhone.getName()+iPhone.getReturnPolicy()+iPhone.getWattage()+iPhone.getScreenType()+iPhone.getNumOfCameras());
//
//    }
}
