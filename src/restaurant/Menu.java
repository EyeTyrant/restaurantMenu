package restaurant;

import java.util.ArrayList;
import java.lang.Object;

public class Menu{


  static ArrayList<MenuItem> appetizers = new ArrayList<>();
  static ArrayList<MenuItem> entrees = new ArrayList<>();
  static ArrayList<MenuItem> desserts = new ArrayList<>();


  public static void addItem(MenuItem item){
    if (MenuItem.category.equals("appetizer")){
      appetizers.add(item);
    } else if (MenuItem.category.equals("entree")){
      entrees.add(item);
    } else if (MenuItem.category.equals("dessert")){
      desserts.add(item);
    }

  }


}
