package restaurant;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Menu {

  static ArrayList<MenuItem> appetizers = new ArrayList<MenuItem>();
  static ArrayList<MenuItem> entrees = new ArrayList<MenuItem>();
  static ArrayList<MenuItem> desserts = new ArrayList<MenuItem>();
//  private Date today = new Date();


  public Menu(ArrayList<MenuItem> appetizer) {
    this.appetizers = appetizer;
  }

  public static ArrayList<MenuItem> getAppetizers() {
    return appetizers;
  }

  public static void setAppetizers(ArrayList<MenuItem> appetizers) {
    Menu.appetizers = appetizers;
  }

  public static ArrayList<MenuItem> getEntrees() {
    return entrees;
  }

  public static void setEntrees(ArrayList<MenuItem> entrees) {
    Menu.entrees = entrees;
  }

  public static ArrayList<MenuItem> getDesserts() {
    return desserts;
  }

  public static void setDesserts(ArrayList<MenuItem> desserts) {
    Menu.desserts = desserts;
  }

  public ArrayList<MenuItem> addItem(MenuItem item){

      this.appetizers.add(item);
  return this.appetizers;
    // update and display the date
  }
  public void printMenu (){
    for (MenuItem appetizer : appetizers) {
      appetizer.displayItem();
    }
  }


  @Override
  public String toString() {
    return "Menu{" +
            "appetizers=" + appetizers +
            ", entrees=" + entrees +
            ", desserts=" + desserts +
            '}';
  }
}
