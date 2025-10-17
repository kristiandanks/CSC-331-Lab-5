package StoreItem.ClothingItem;

import StoreItem.StoreItem;

public class ClothingItem extends StoreItem {
    public static double CLOTHING_TAX = 0.07; // Idk what tax is yet


    private String material;
    private String color;
    private String size;


    public ClothingItem(String name, String brand, String description, double price, int quantity,
                        String material, String size, String color) {
        super(name, brand, description, price, quantity);
        this.material = material;
        this.size = size;
        this.color = color;

    // Getters
    public String getMaterial() {
        return material; }
    public String getSize() {
        return size; }
    public String getColor() {
        return color;
    }

    // Setters
    public void setMaterial(String material) {
        this.material = material; }
    public void setSize(String size) {
        this.size = size; }
    public void setColor(String color) {
        this.color = color; }
}

