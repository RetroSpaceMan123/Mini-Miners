import Inventory.Inventory;
import Shop.ShopWindow;

public class Main {
    public static void main(String[] args) {
        //Create a new Inventory
        Inventory inventory = new Inventory();
        //Spawn the Window
        new ShopWindow(inventory);
    }
}
