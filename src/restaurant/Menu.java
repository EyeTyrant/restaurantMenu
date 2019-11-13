package restaurant;

import java.util.ArrayList;
import java.lang.Object;
import java.util.Date;

public class Menu{


  static ArrayList<MenuItem> appetizers = new ArrayList<>();
  static ArrayList<MenuItem> entrees = new ArrayList<>();
  static ArrayList<MenuItem> desserts = new ArrayList<>();
  private Date today = new Date();

  public static void addItem(MenuItem item){
    if (MenuItem.category.equals("appetizer")){
      appetizers.add(item);
    } else if (MenuItem.category.equals("entree")){
      entrees.add(item);
    } else if (MenuItem.category.equals("dessert")){
      desserts.add(item);
    }
  // update and display the date
  }


}
