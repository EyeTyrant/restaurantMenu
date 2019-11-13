package restaurant;

import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Object;

public class Restaurant {
  public static void main(String[] args) {


    MenuItem Fries = new MenuItem("appetizer", "French Fries", "Yummy taters fried in the same \ngrease we use for our fish.", 2.99, false);
    Menu.addItem(Fries);
//    Fries.displayItem();
    MenuItem Wings = new MenuItem("appetizer", "Hot Wings", "A dozen wings smothered in our spicy sauce.", 4.99, true);
    Menu.addItem(Wings);
//    Wings.displayItem();

    MenuItem Skins = new MenuItem("appetizer", "Potato Skins", "Dry tater halves topped with oily \ncheese, greasy bacon, and sour cream.", 2.99, true);
    MenuItem Steak = new MenuItem("entree", "Bootsteak", "Overcooked fatty slab of beef that's as tough \nas a boot just like momma used to make.", 8.99, false);
    MenuItem Pizza = new MenuItem( "entree", "Pizza", "Dough, sauce, and cheese, right from the freezer \nsection at WalMart. What, You exptected toppings for 4 bucks?", 3.99, true);
    MenuItem Cod = new MenuItem("entree", "Fried Cod", "Shhhh!, it's really just cheap talapia. \nServed with a slice of white bread", 6.99, false);
    MenuItem Cheesecake = new MenuItem("dessert", "Cheesecake", "A slice of cake made from cheese \nand topped with fruity pie filling.", 3.99, false);
    MenuItem Pie = new MenuItem("dessert", "Apple Pie", "A dry slice of pie stuffed with road apples \nand topped with 5 scoops of ice cream to make it palletable.", 3.99, true);
    MenuItem Brownies = new MenuItem("dessert", "Brownie", "The best Sara Lee has to offer", 1.99, true);


    System.out.println(Menu.appetizers); // prints memory location instead of array



  }

}
