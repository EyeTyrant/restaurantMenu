package restaurant;

import java.util.ArrayList;

public class Menu{

  static ArrayList<MenuItem> appetizers = new ArrayList<>();
  static ArrayList<MenuItem> entrees = new ArrayList<>();
  static ArrayList<MenuItem> desserts = new ArrayList<>();


  public void addItem(MenuItem item){
    if (MenuItem.category.equals("Appetizer")){
      Menu.appetizers.add(item);
    } else if (MenuItem.category.equals("Entree")){
      Menu.entrees.add(item);
    } else if (MenuItem.category.equals("dessert")){
      Menu.desserts.add(item);
    }

  }


}
