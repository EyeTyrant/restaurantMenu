package restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {
  public static void main(String[] args) {

    MenuItem Wings = new MenuItem("Appetizer", "Hot Wings", "A dozen wings smothered in our spicy sauce.", 4.99, true);
    Wings.addItem(Wings);

    MenuItem Fries = new MenuItem("Appetizer", "French Fries", "Yummy taters fried in the same \ngrease we use for our fish.", 2.99, false);
    Fries.addItem(Fries);


    System.out.println(Menu.appetizers); // prints memory location instead of array



  }

}
