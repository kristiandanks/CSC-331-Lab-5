package StoreItem.ElectronicsItem;


public class Laptop extends ElectronicsItem {
    //initializing variables
    String cpu;
    boolean touchScreen;
    int numOfPorts;

    /**
     * Constructor
     * @param price double
     * @param section String
     * @param brand String
     * @param name String
     * @param returnPolicy String
     * @param wattage int
     * @param screenType String
     * @param cpu String
     * @param touchScreen boolean
     * @param numOfPorts int
     */
    public Laptop(double price, String section, String brand, String name, String returnPolicy, int wattage, String screenType,
                  String cpu, boolean touchScreen, int numOfPorts){
        super(price, section, brand, name, returnPolicy, wattage, screenType);

        //validating numOfPorts input
        if (numOfPorts < 0) {
            throw new IllegalArgumentException("Number of ports must be an integer greater than or equal to zero.");
        }

        this.cpu = cpu;
        this.touchScreen = touchScreen;
        this.numOfPorts = numOfPorts;
    }

    //Getters
    /**
     *
     * @return cpu String
     */
    public String getCpu(){
        return cpu;
    }

    /**
     *
     * @return touchScreen boolean
     */
    public boolean getTouchScreen(){
        return touchScreen;
    }

    /**
     *
     * @return numOfPorts int
     */
    public int getNumOfPorts(){
        return numOfPorts;
    }

    //Setters
    /**
     *
     * @param cpu String
     */
    public void setCpu(String cpu){
        this.cpu = cpu;
    }

    /**
     *
     * @param touchScreen boolean
     */
    public void setTouchScreen(boolean touchScreen){
        this.touchScreen = touchScreen;
    }

    /**
     *
     * @param numOfPorts int
     */
    public void setNumOfPorts(int numOfPorts){
        //validating numOfPorts input
        if (numOfPorts < 0){
            throw new IllegalArgumentException("Number of ports must be a number greater than or equal to 0.");
        }

        this.numOfPorts = numOfPorts;
    }
    @Override
    public String toString() {
        return super.toString() + String.format(
                " | type=Laptop | cpu=%s | touchScreen=%s | ports=%d",
                getCpu(),
                getTouchScreen() ? "yes" : "no",
                getNumOfPorts()
        );
    }

//    /**
//     * Main method for testing getters
//     * @param args String[]
//     */
//    public static void main(String[] args){
//        Laptop lenovo = new Laptop(1000, "B15", "Lenovo", "3-in-1", "Return wintin 30 days", 140, "VLN", "Ryzen 7 3700-X", true, 4);
//        System.out.println(lenovo.getPrice()+lenovo.getSection()+lenovo.getBrand()+lenovo.getName()+lenovo.getReturnPolicy()+lenovo.getWattage()+lenovo.getScreenType()+lenovo.getCpu()+lenovo.getTouchScreen()+lenovo.getNumOfPorts());
//    }
}
